package ISP;

public class LinkedIn implements PostManager, MediaManager {
    @Override
    public void SendMedia() {
        System.out.println("User is sending media file in LinkedIn");
    }

    @Override
    public void SendMessage() {
        System.out.println("User is sending messages in LinkedIn");
    }

    @Override
    public void Post() {
        System.out.println("User has created a post in LinkedIn");
    }

    @Override
    public void Reaction() {
        System.out.println("User has reacted/commented on a post from LinkedIn");
    }
}
