import java.util.UUID;

public class SBIUser implements BankInterfce{
     private   String name;
     private String accountNo;
     private double balance;
     private String password;
     private  double rateOfIntrest;

     public SBIUser(String name, double balance, String password) {
          this.name = name;
          this.balance = balance;
          this.password = password;

          this.rateOfIntrest=6.5;
          this.accountNo=String.valueOf(UUID.randomUUID());
     }

     public String getName() {
          return name;
     }

     public String getAccountNo() {
          return accountNo;
     }

     public double getBalance() {
          return balance;
     }

     public double getRateOfIntrest() {
          return rateOfIntrest;
     }

     public String getPassword() {
          return password;
     }

     public void setName(String name) {
          this.name = name;
     }

     public void setAccountNo(String accountNo) {
          this.accountNo = accountNo;
     }

     public void setBalance(double balance) {
          this.balance = balance;
     }

     public void setPassword(String password) {
          this.password = password;
     }

     public void setRateOfIntrest(double rateOfIntrest) {
          this.rateOfIntrest = rateOfIntrest;
     }

     @Override
     public double checkBalance() {
          return 0;
     }

     @Override
     public String addMoney(int amount) {
          balance=balance+amount;
          return "your new balance is: "+balance;
     }

     @Override
     public String withdrawMoney(int amount, String enterpassword) {
          if(enterpassword.equals(password)){
               if(amount>balance){
                    return "sorry bro no money";
               }
               else{
                    balance=balance-amount;
                    return " money is available";
               }
          }
          else{
               return "your password is wrong";
          }
     }

     @Override
     public double calculateIntrest(int years) {
          return (balance*years*rateOfIntrest)/100;
     }
}
