import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //Declared the Scanner class obj.
        Scanner sc = new Scanner(System.in);

        //Using infinite loop.
        while(true)
        {
            //Enter the details.
            System.out.println("Press 1 : Add the user");
            System.out.println("Press 2 : Follow the user");
            System.out.println("Press 3 : UnFollow the user");
            System.out.println("Press 4 : Retrieve followers list");
            System.out.println("Press 5 : Retrieve following list");
            System.out.println("Press 6 : Exit");

            System.out.println();

            //Get choice from user.
            System.out.print("Enter the your choice : ");
            int choice = sc.nextInt();

            System.out.println();

            switch (choice)
            {
                case 1:
                    System.out.println("********* |Add the user here| *************");
                    Social_Media.addUser();
                    break;

                case 2:
                    System.out.println("********** |Follow the user here| *********");
                    Social_Media.followUser();
                    break;

                case 3:
                    System.out.println("********** | Follow the user here | *********");
                    Social_Media.unfollowUser();
                    break;

                case 4:
                    System.out.println("***********| Follower list |*************");
                    Social_Media.followerList();
                    break;

                case 5:
                    System.out.println("***********| Following list |*************");
                    Social_Media.followingList();
                    break;

                case 6:
                    Social_Media.exit();
                    break;

                default:
                    System.out.print("!!!!! | Invalid choice | !!!!");
            }
            System.out.println();
        }
    }
}
