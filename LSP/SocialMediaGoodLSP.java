/* By using this interfaces every child class now can implement all the methods that parent class should have without violating Liskov Principle.*/

package LSP;

public class SocialMediaGoodLSP {
    public static void main(String[] args) {
        Facebook fb = new Facebook();
        fb.SendMedia();
        fb.Post();
        fb.VideoCall("Sharia","Asad");
        LinkedIn lkdin = new LinkedIn();
        lkdin.SendMessage();

    }
}
