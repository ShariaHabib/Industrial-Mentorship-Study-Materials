package SRP.GoodSRC;

public class LoanDeptSR extends TransactionSR{
    public void Loan() {
        System.out.println("Issuing Loan");
    }
    public void LoanEligibility(int balance){
        if(balance>400) System.out.println("Yes you can issue Loan");
        else System.out.println("NOT Eligible");
    }
}
