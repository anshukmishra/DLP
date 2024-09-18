import client.Client;
import client.entity.Credentials;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            System.out.println("User Onboarding: 1 for Mobile & 0 for Email");
            int onboardingType = sc.nextInt();
            System.out.println("User Verification: 1 for Aadhaar & 0 for PAN");
            int verificationType = sc.nextInt();
            System.out.println("Verification ID Number :");
            String id = sc.next();
            System.out.println("First Name: ");
            String firstName = sc.next();
            Credentials credentials = new Credentials(id, firstName);
            client.run(onboardingType, verificationType, credentials);
            t--;
        }
    }
}