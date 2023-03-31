package OCP;

public class OCP_User {
    public int balance;
    String name;
    OCP_User(String name){balance = 500;this.name = name;}

    public void Balance() {
        System.out.println("Balance is "+balance);
    }

    public void UserName(){
        System.out.println("The account owner name is "+name);
    }
}
