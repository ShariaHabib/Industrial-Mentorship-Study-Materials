/* LSP states that all the parent class methods should be fit in the child class.
More accurately objects of a superclass should be replaceable with objects of its subclasses without breaking the system.
In this example of parent class this violates the LSP because all the objects can't be implemented if the subclass extends this parent class. */
package LSP;

public abstract class SocialMediaBadLSP {

    public abstract  void Chat();//this feature is available in facebook,messenger,whatsapp & LinkedIn.

    public abstract void PostShare();//this feature is available in facebook & LinkedIn not in whatsapp,messenger.

    public abstract  void ShareMedia();//this feature is available in facebook,messenger,whatsapp & LinkedIn.

    public abstract  void VideoCall(String user1,String user2);// this feature is not available in LinkedIn.
}
