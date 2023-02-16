import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ,password and bal");
        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

        SBIAccount anishAcc = new SBIAccount(name,balance,password);


        System.out.println("your account has been created with account number: "+ anishAcc.getAccountNo());

        //getBal
        System.out.println("your curr bal is: "+anishAcc.getBalanace());

        //deposit
        System.out.println(anishAcc.depositMoney(500));
        System.out.println("new bal is: "+anishAcc.getBalanace());

        //withdraw
        System.out.println("enter amount to withdraw");
        int amount = sc.nextInt();
        System.out.println("enter your password");
        String enterPass = sc.next();

        System.out.println(anishAcc.withdrwan(amount,enterPass));
        System.out.println("current balance is :"+ anishAcc.getBalanace());
        //roi
        System.out.println("rate of interest(4): "+anishAcc.getBalanace()+" is: "+anishAcc.calculateInterest(4));
    }
}