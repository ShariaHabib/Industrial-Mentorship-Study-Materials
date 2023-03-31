package SRP.GoodSRC;

public class GSR_User extends LoanDeptSR{
    public int balance;
    String name;
    GSR_User(String name){balance = 500;this.name = name;}

    public void Balance() {
        System.out.println("Balance is "+balance);
    }

    public void UserName(){
        System.out.println("The account owner name is "+name);
    }
}
