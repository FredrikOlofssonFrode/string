package se.fredrik;

public class Lab3 {
    public void run3() {

   

        System.out.println("Mata in din email: ");
        String email = System.console().readLine();

        boolean isValidEmail = false;

        if (email.indexOf('@') != -1) {
            int lastDotIndex = email.lastIndexOf('.');
            if (lastDotIndex != -1) {
                int charsAfter = email.length() - lastDotIndex - 1;
                if (charsAfter == 2 && charsAfter == 3) {
                    isValidEmail = true;
                }
            } 
            

        }
        System.out.printf("%s is an %s emailaddress", email, isValidEmail ? "valid" : "invalid");
    }
}
