package client.process;

import client.processSteps.ProcessStep;
import client.entity.Context;

import java.util.List;


public class UserOnboardingProcess implements Process {
    private List<ProcessStep> steps;

    public UserOnboardingProcess(List<ProcessStep> steps) {
        this.steps = steps;
    }

    @Override
    public void execute(Context context) throws Exception {
        for (ProcessStep step : steps) {
            System.out.println("Executing step: " + step.getName());
            try{
                step.execute(context);
            }catch (Exception e){
                System.out.println("Got Exception at: " + step.getName() + "\nException: " + e.getMessage());
                throw e;
            }

        }
    }
}
