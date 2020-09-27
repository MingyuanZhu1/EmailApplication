import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private final int defaultPasswordLength = 10;
    private String alternateEmail;
    private final String companySuffix = "hotmail.com";

    // Constructor to receive the first name adn last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Call a method asking for the department - return the method
        this.department = setDepartment();

        // Call a method that return a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your random password is " + password);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"+
                department + "." + companySuffix;
    }

    // Ask for the department
    private String setDepartment() {
        System.out.println("New worker: "+ firstName + "\n" +"Department Code\n1 for Sales" +
                "\n2 for Development\n3 for Accounting\n0 for temp.");
        Scanner scanner = new Scanner(System.in);
        int depChoice = scanner.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "temp";
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
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set the alternative email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    // Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    // Getter for mailbox Capacity
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    // Getter for alter email
    public String getAlterEmail() {
        return alternateEmail;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +"\n"
                + "COMPANY EMAIL: " + email  + "\n" +
                "MAILBOX CAPACITY:" + mailboxCapacity + "mb";
    }
}
