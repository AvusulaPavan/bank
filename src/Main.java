import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ur name , passworrd and balance");
        String name =sc.next();
        String password=sc.next();
        double balance=sc.nextDouble();

        //create user
        SBIUser user=new SBIUser(name, balance, password);

        // adding money
        String msg=user.addMoney(10000);
        System.out.println(msg);

        //withdraw money
        System.out.println("Enter amount you want to withdraw");
        int money=sc.nextInt();
        System.out.println("Enter the password");
        String enterpassword=sc.next();
        System.out.println(user.withdrawMoney(money, enterpassword));

        // calclating the rate of intrest
        System.out.println(user.calculateIntrest(10));

    }
}
