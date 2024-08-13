import java.util.HashSet;

public class User
{

        //Validate the details.
        String id;
        String name;
        String email;

        //Initialization of both hashSet.
        HashSet<String> followers;
        HashSet<String> following;

        //Call the  parameterized constructor
        User(String id, String name, String email)
        {
            this.id = id;
            this.name = name;
            this.email = email;

            //Create the hashset for the followers.
            this.followers = new HashSet<>();

            //Create the hashset for the following.
            this.following = new HashSet<>();
        }
}
