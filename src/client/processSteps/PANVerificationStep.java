package client.processSteps;

import client.entity.Context;
import client.entity.Credentials;

public class PANVerificationStep extends CredentialVerificationStep {
    Credentials credentials;

    public PANVerificationStep(Credentials credentials){
        super("PAN");
        this.credentials = credentials;
    }

    @Override
    public void execute(Context context) throws Exception{
        System.out.println("Verifying PAN credentials");
        context.set("PANVerified", credentials.getId());
    }

    @Override
    public String getName() {
        return "PAN Verification";
    }
}
