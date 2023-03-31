/*The principle of dependency inversion refers to the decoupling of software modules.
 This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.*/

package DIP;

public class GoodDIP {
    private MasterCard master_card;
    public GoodDIP(MasterCard master_card) {
        this.master_card = master_card;
    }

    public void Payment(int amount){
        master_card.Transaction(amount);
    }

    public static void main(String[] args) {
        /* Here if we used debit card without master card then it would be tightly coupled with the class and variable
         then we had to change whole class if the payment system is changed debit to credit. Now by making new interface it is being loosely coupled
         So there wouldn't be any difficulties if the payment card is being changed.
         DebitCard debitCard=new DebitCard();
         CreditCard creditCard=new CreditCard(); */

        MasterCard master_card=new CreditCard();
        GoodDIP purchase =new GoodDIP(master_card);
        purchase.Payment(5000);
    }
}
