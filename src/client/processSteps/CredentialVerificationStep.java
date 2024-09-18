package client.processSteps;

public abstract class CredentialVerificationStep implements VerificationStep {
    String credentialsType;

    CredentialVerificationStep(String credentialsType){
        this.credentialsType = credentialsType;
    }

}
