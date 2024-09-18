package client.factory;

import client.entity.Credentials;
import client.processSteps.*;

import java.util.ArrayList;
import java.util.List;

public class ProcessFactory {

    public static List<ProcessStep> createOnboardingSteps(int onboardingType, int verificationType, Credentials credentials) throws IllegalArgumentException{
        List<ProcessStep> steps = new ArrayList<>();

        switch (onboardingType) {
            case 0:
                steps.add(new MobileOnboardingStep());
                break;
            case 1:
                steps.add(new EmailOnboardingStep());
                break;
            default:
                throw new IllegalArgumentException("Invalid onboarding type: " + onboardingType);
        }

        switch (verificationType) {
            case 0:
                steps.add(new AadhaarVerificationStep(credentials));
                break;
            case 1:
                steps.add(new PANVerificationStep(credentials));
                break;
            default:
                throw new IllegalArgumentException("Invalid verification type: " + verificationType);
        }

        steps.add(new AccountExistenceVerificationStep());

        return steps;
    }
}
