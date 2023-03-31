package DIP;

public class CreditCard implements MasterCard {
//    public void Transaction(int amount){
//        System.out.println("Transaction using CreditCard");
//    }

    @Override
    public void Transaction(int amount) {
        System.out.println("Transaction using MasterCard");
    }
}
