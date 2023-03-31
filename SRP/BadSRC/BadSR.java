package SRP.BadSRC;

/* This code don't have any exact responsibility it contains many methods/tasks of different types.
Which is the clear violation of the SOLID's First principle which is Single responsibility i.e. One class should do a specific task.*/

public class BadSR {
    public int balance;
    BadSR(){
        balance = 500;
    }
    public void Loan() {
        System.out.println("Issuing Loan");
    }
    public boolean LoanEligibility(int balance){
        return balance > 200;
    }
    public void Balance() {
        System.out.println("Balance is "+balance);
    }
    public void AddMoney(int extra) {
        int new_balance = balance + extra;
//        System.out.println("Previous Balance is "+balance +"tk");
        System.out.println("New balance is "+new_balance);
        balance = new_balance;
    }
    public void CashOut(int amount) {
        if(balance>=amount)
        {
            int new_balance = balance - amount;
//            System.out.println("Previous Balance is "+balance);
            System.out.println("New balance is "+new_balance);
            balance = new_balance;
        }
        else {
            System.out.println("You dont have that much money...Goribssss!!"+"You have "+balance+"tk");
        }

    }
    public static void main(String[] args) {
        BadSR obj = new BadSR();
        obj.AddMoney(500);
        obj.Balance();
        obj.CashOut(200);
        obj.Balance();
        obj.CashOut(350);
        obj.CashOut(500);
    }
}
