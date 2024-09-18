package client.processSteps;

import client.entity.Context;
import client.entity.Credentials;

public class AadhaarVerificationStep extends CredentialVerificationStep {

    Credentials credentials;

    public AadhaarVerificationStep(Credentials credentials){
        super("Aadhaar");
        this.credentials = credentials;
    }

    @Override
    public void execute(Context context) throws Exception{
        System.out.println("Verifying Aadhaar Credentials");
        context.set("aadhaarVerified", credentials.getId());
    }

    @Override
    public String getName() {
        return "Aadhaar Verification";
    }
}
