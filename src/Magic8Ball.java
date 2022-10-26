import java.util.Scanner;

public class Magic8Ball
{
    public static void main(String[] args)
    {
        /* Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.print("Enter a yes-no question and I will answer it: ");
        String question = scan.nextLine();

        String response = "";
        int randomResponse = (int) (Math.random() * 6) + 1;
        if (randomResponse == 1) {
            response = "Cannot predict now.";
        }   else if
        (randomResponse == 2) {
            response = "Better not tell you now.";
        }   else if
        (randomResponse == 3) {
            response = "It is decidedly so.";
        }   else if
        (randomResponse == 4) {
            response = "You may rely on it.";
        }   else if
        (randomResponse == 5) {
            response = "My reply is no.";
        }   else    {
            response = "Very doubtful.";
        }

        System.out.println(response);  // print response
    }
} */


        SelectionMadness madness = new SelectionMadness();

        // test flipcoin -- these will return true or false randomly
        System.out.println(madness.flipCoin());
        System.out.println(madness.flipCoin());
        System.out.println(madness.flipCoin());

        // test largest
        System.out.println(madness.largest(5, 8, 3));
        System.out.println(madness.largest(8, 5, 3));
        System.out.println(madness.largest(3, 5, 8));
        System.out.println(madness.largest(-5, -8, -3));
        System.out.println(madness.largest(11, 11, 10));

        // test rightTriangle
        System.out.println(madness.rightTriangle(3, 4, 5));
        System.out.println(madness.rightTriangle(5, 4, 3));
        System.out.println(madness.rightTriangle(6, 8, 10));
        System.out.println(madness.rightTriangle(8, 10, 6));
        System.out.println(madness.rightTriangle(3, 6, 5));
        System.out.println(madness.rightTriangle(1, 2, 3));



    }
}