package ISP;
/* Here it is not necessary that a user must have to post or give reaction in social media but if any class want to implements from this interface then that class must have to override both of these methods.
This is the violation of segregation principle. So we need to separate those interfaces so that a class doesnt need to override unnecessary methods forcefully.*/
public interface PostManager {
    public void Post();
    //public void Reaction();
}
