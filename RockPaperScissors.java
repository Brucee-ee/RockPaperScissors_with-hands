import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors
{
    private static final String ROCK_PAPER = """
            _______
        ---'   ____)
              (_____)
              (_____)
              (____)
        ---.__(___)
        """;
    private static final String PAPER = """
            _______
        ---'   ____)____
                  ______)
                  _______)
                 _______)
        ---.__________)
        """;

    private static final String SCISSORS = """
            _______
        ---'   ____)____
                  ______)
               __________)
              (____)
        ---.__(___)
        """;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //Choices (Array Form)
        String[] Choices = {"Rock", "Paper", "Scissors"};

        //Get CHOICE
        System.out.print(" Type 0 for Rock, 1 for Paper, or 2 for Scissors ");
        System.out.print("Enter Choice: ");
        int choice = Integer.parseInt(sc.nextLine());

        //Validation
        if (choice < 0 || choice >= 3)
        {
            System.out.println("Invalid Choice");
        }
        else
        {
            //Your Choice
            System.out.println("You chose " + Choices[choice - 1]);

            //Computer Choice
            int randomChoice = rand.nextInt(3);
            System.out.println("Computer chose " + Choices[randomChoice - 1]);

            //Winner CODE
            if (choice == randomChoice)
            {
                System.out.println("Draw!");
            } else if (((choice == 0 && randomChoice == 2) ||
                    (choice == 1 && randomChoice == 0) ||
                    (choice == 2 && randomChoice == 1)))
            {
                System.out.println("Congratulations!");
            } else
            {
                System.out.println("Unlucky!");
            }
        }
        sc.close();
    }
}
