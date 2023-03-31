package OCP;

public class UpdatedOCP_User extends OCP_User{
    int age;
    String occupation;
    UpdatedOCP_User(String name) {
        super(name);
    }

    public void Info(int age,String occupation) {
        this.age = age;
        System.out.println("The name of the user is "+name);
        System.out.println("Users age is "+age);
        System.out.println("Users occupation is "+occupation);
    }
}
