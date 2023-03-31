package SRP.GoodSRC;

public class TransactionSR {
//    int balance = 500;
    public void AddMoney(int balance,int extra) {
        int new_balance = balance + extra;
        System.out.println("New balance is "+new_balance);
        balance = new_balance;
    }
    public void CashOut(int balance,int amount) {
        if(balance>=amount)
        {
            int new_balance = balance - amount;
            System.out.println("New balance is "+new_balance);
            balance = new_balance;
        }
        else {
            System.out.println("You dont have that much money...Goribssss!!"+"You have "+balance+"tk");
        }

    }
}
