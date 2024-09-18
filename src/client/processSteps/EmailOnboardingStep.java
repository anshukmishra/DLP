package client.processSteps;

import client.entity.Context;

public class EmailOnboardingStep implements OnboardingStep {
    @Override
    public void execute(Context context) throws Exception {
        String email = "akmisala@gmail.com"; //Can be taken with the help of Constructor like VerificationStep
        System.out.println("In Email OnboardingStep");
        context.set("Email", email);
    }

    @Override
    public String getName() {
        return "Email OnboardingStep";
    }
}
