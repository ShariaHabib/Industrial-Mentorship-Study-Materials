package DIP;

public class DebitCard implements MasterCard{

    @Override
    public void Transaction(int amount) {
            System.out.println("Transaction using MasterCard");
    }
}
