package client;

import client.entity.Context;
import client.entity.Credentials;
import client.factory.ProcessFactory;
import client.process.Process;
import client.process.UserOnboardingProcess;
import client.processSteps.ProcessStep;

import java.util.List;

public class Client {
    Context context = new Context();

    public void run(int onboardingType, int verificationType, Credentials credentials){
        try{
            List<ProcessStep> steps = ProcessFactory.createOnboardingSteps(onboardingType, verificationType, credentials);
            Process onboardingProcess = new UserOnboardingProcess(steps);
            onboardingProcess.execute(context);
        }catch(Exception e){
            System.err.println("Error during client.process: " + e.getMessage());
        }
    }


}
