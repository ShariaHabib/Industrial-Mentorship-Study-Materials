package OCP;

public class UpdatedLoanDeptOcp extends LoanDeptOCP{

    public void LoanRules() {
        System.out.println("Loan must be paid within a year");
    }
    public void ClosingLoan(String name) {
        System.out.println("Loan has been closed for the user "+name);
    }

}
