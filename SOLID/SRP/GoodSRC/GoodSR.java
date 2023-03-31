package SRP.GoodSRC;

public class GoodSR {
    public static void main(String[] args) {
        GSR_User obj = new GSR_User("Sharia");
        obj.UserName();
        obj.Balance();
        obj.Loan();
        obj.AddMoney(obj.balance, 500);
        obj.LoanEligibility(obj.balance);
    }
}
