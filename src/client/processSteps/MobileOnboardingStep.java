package client.processSteps;

import client.entity.Context;

public class MobileOnboardingStep implements OnboardingStep {
    @Override
    public void execute(Context context) throws Exception{
        System.out.println("Mobile Onboarding");
        String mobileNumber = "9534049086"; //Can be taken with the help of Constructor like VerificationStep
        context.set("mobileNumber", mobileNumber);
    }

    @Override
    public String getName() {
        return "Mobile Onboarding";
    }
}
