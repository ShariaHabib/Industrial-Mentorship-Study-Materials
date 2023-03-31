package LSP;

public class WhatsApp implements MediaManager,VideoCallManger{
    @Override
    public void SendMedia() {
        System.out.println("User is sending media file in WhatsApp");
    }

    @Override
    public void SendMessage() {
        System.out.println("User is sending messages in WhatsApp");
    }

    @Override
    public void VideoCall(String user1, String user2) {
        System.out.println(user1+" is in a video call with "+user2+" in WhatsApp");

    }
}
