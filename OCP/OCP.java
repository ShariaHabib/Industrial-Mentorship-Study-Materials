package OCP;/* Open close principle states that a class is opened for extension and closed for modification.
 That means we can use a class and extend it for implementing new features, but it doesn't allow to modify the class everytime for new features or any updates.*/

public class OCP {
    public static void main(String[] args) {
        OCP_User obj = new OCP_User("Sharia Habib");
        UpdatedLoanDeptOcp o = new UpdatedLoanDeptOcp();
        o.LoanRules();
        UpdatedTransactionOCP t = new UpdatedTransactionOCP();
        t.Payment(5000);
        t.AddMoney(obj.balance,500);
        t.CashOut(obj.balance, 10000);
    }
}
