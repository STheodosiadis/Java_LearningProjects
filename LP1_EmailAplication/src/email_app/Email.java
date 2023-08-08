package email_app;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private int defaultPassLenght =10;
    private String department;
    private int mailboxCapacity =500;
    private String alternateEmail;
    private String Email;
    private String companySuffix = "Company.com";

     // constractors will recive the Fname and the Lname

    public Email(String firstName, String lastName){
       this.firstName = firstName;
       this.lastName = lastName;
       System.out.println("Email created: " + this.firstName + " " + this.lastName );

       // Call a method asking for the department and returnign it.
        this.department = setDepartment();
        // System.out.println("Department: " + this.department + "\n1");

      // Call A method that returns a random number as password.
        this.password = randomPass(defaultPassLenght);
        // System.out.println("Your password is: " + this.password);

      // Combine elements to create an email adress acording to spesifications
        Email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "." + department +"@" + companySuffix;
        // System.out.println("Your email is: " + Email);
    }


     // Department method
    private String setDepartment(){

        System.out.println("Choose Department\n1 Departmemt Codes\n1 For Sales \n2 For Development \n3 For Accounting \n0 For None \n Enter Department Code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1) { return "Sales";}
        else if (depChoice ==2) {return "Dev";}
        else if (depChoice ==3) {return "Accnt";}
        else {return "";}
    }

     // Generate a random password
    private String randomPass(int length) {

        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
            System.out.println(rand);
            System.out.println(passwordSet.charAt(rand));
        }
        return new String(password);
    }

    // Set the mailbox capasity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // Ghange the password
    public void changePassword(String password){
        this.password = password;
    }

    // Creating getters
    public int getMailboxCapacity() {return mailboxCapacity;}
    public String getAlternateEmail() {return alternateEmail;}
    public String getPassword() {return password;}

    // Show method to display all the information according to the project requirments
    public String showInfo(){
        return "Display name: " + firstName + " " + lastName +
                "\n1 Company mail: " + Email +
                "\n1 Mailbox capacity: " + mailboxCapacity + "mb";

    }

    }





