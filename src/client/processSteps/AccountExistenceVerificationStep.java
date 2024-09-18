package client.processSteps;

import client.entity.Context;
import client.entity.Credentials;

public class AccountExistenceVerificationStep implements VerificationStep {
    @Override
    public void execute(Context context) throws Exception{
        String mobileNumber = context.get("mobileNumber", String.class);

        if (context.contains("aadhaarVerified") || context.contains("PANVerified")) {
            if(context.contains("mobileNumber") || context.contains("emailID")){
                System.out.println("Account exists: ");
            }
            else{
                System.out.println("Account Not exists");
            }
        }
        else{
            System.out.println("Account not exists creds not verified");
        }
    }

    @Override
    public String getName() {
        return "AccountExistenceVerificationStep";
    }
}
