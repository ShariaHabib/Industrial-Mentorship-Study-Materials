package ISP;

public class Facebook implements MediaManager, PostManager, VideoCallManger {
    @Override
    public void Post() {
        System.out.println("User has created a post in Facebook");
    }

    @Override
    public void Reaction() {
        System.out.println("User has reacted/commented on a post from Facebook");
    }

    @Override
    public void VideoCall(String user1,String user2) {
        System.out.println(user1+" is in a video call with "+user2+" in Facebook");
    }

    @Override
    public void SendMedia() {
        System.out.println("User is sending media file in Facebook");

    }

    @Override
    public void SendMessage() {
        System.out.println("User is sending messages in Facebook");
    }
}
