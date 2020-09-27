import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    // Constructor to receive the first name adn last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // Call a method asking for the department - return the method
        this.department = setDepartment();
        System.out.println("Department Code: " + department);

        // Call a method that return a random password

    }

    // Ask for the department
    private String setDepartment() {
        System.out.println("Department Code\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none.");
        Scanner scanner = new Scanner(System.in);
        int depChoice = scanner.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }

    }


    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIGKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }

    // Set the mail box capacity

    // Set the alternative email

    // Change the password
}
