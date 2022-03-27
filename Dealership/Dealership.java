import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello my friend, and welcome into your first java project\n");
        System.out.println("I would like to ask you some question, can you please answer to me trully?\n");

        String isAnswerTruly = scan.nextLine();

        if (isAnswerTruly.equals("yes")) {
            System.out.println("What would oyu prefer:\n");
            
            System.out.println("a: Eat chokolade\n");
            System.out.println("b: Eat burgers\n");

            String answer = scan.nextLine();

            switch (answer) {
                case "a": System.out.println("Good choise, this is what I prefer!!!\n"); break;
                case "b": System.out.println("Hm ..... I dont understand you .....\n"); break;
                default: System.out.println("You need to choose between a and b\n"); break;
            }
        } else {
            System.out.println("Sorry, wrong choise, I need honest answers....");
        }

        System.out.println("Thank you for answers, see ya!)\n");
        scan.close();
    }
}