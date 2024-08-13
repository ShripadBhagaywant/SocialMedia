import java.util.HashMap;
import java.util.Scanner;

public class Social_Media
{
    //Scanner class obj.
    private static final Scanner sc = new Scanner(System.in);

    // Create the HashMap.
    private static final HashMap<String, User> users = new HashMap<>();

    //Add user method.
    public static void addUser()
    {

        //Get the user id.
        System.out.println("Enter the id : ");
        String id = sc.nextLine();

        //Validation id's.
        if(users.containsKey(id))
        {
            System.out.println("User already exits.");
            return;
        }

        //Get the user .
        System.out.println("Enter the  name : ");
        String name = sc.nextLine();

        //Get the user email id.
        System.out.println("Enter the  email id : ");
        String eid = sc.nextLine();

        //Add the elements in the list.
        users.put(id, new User(id, name, eid));

        //Added user.
        System.out.println(" User added successfully! ");
    }

    //follow user method.
    public static  void followUser()
    {
        //Get the user id.
        System.out.println("Enter the user id : ");
        String id = sc.nextLine();

        //Follow the user id.
        System.out.println("Enter the user id to follow : ");
        String follow = sc.nextLine();

        //Validation in id's.
        if (!users.containsKey(id) || !users.containsKey(follow))
        {
            System.out.println("User don't exist!");
            return;
        }

        //Add elements from the list.
        users.get(id).following.add(follow);
        users.get(follow).followers.add(id);

        //Print the message.
        System.out.println("User "+ id +" is now following the user "+ follow);
    }

    //Unfollow user method.
    public static void unfollowUser()
    {
        //Get the user id.
        System.out.println("Enter the user id : ");
        String id = sc.nextLine();

        //Follow the user id.
        System.out.println("Enter the user id to Unfollow : ");
        String Unfollow = sc.nextLine();

        //Validation in id's.
        if (!users.containsKey(id) || !users.containsKey(Unfollow))
        {
            System.out.println("One or both users don't exist!");
            return;
        }

        //Remove from the List.
        users.get(id).following.add(Unfollow);
        users.get(Unfollow).followers.add(id);

        //Print the message.
        System.out.println("User "+ id +" is unfollowed the user "+ Unfollow);
    }

    //Follower list method.
    public static void followerList()
    {
        //Get the user id.
        System.out.println("Enter the  id : ");
        String id = sc.nextLine();

        //Validation in id's.
        if (!users.containsKey(id))
        {
            System.out.println("Users don't exist!");
            return;
        }

        //Get the list.
        System.out.println("The follower list is : " +users.get(id).followers);
    }

    //Following list method.
    public static void followingList()
    {
        //Get the user id.
        System.out.println("Enter the user id : ");
        String id = sc.nextLine();

        //Validation in id's.
        if (!users.containsKey(id))
        {
            System.out.println("User don't exist!");
            return;
        }

        //Get the list.
        System.out.println("The followed list is : " +users.get(id).following);
    }

    //Exit the app method.
    public static void exit()
    {
        System.exit(0);
    }
}
