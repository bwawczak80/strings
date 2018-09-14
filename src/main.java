import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int totalCorrect = 0;
        int totalWrong = 0;

        String[] correctAnswers = { "lee", "purlicue", "columbia", "black", "australia" };

        String[] questions = {"What was the last name of the Confederate army commander at the battle of Gettysburg? ",
                "What is the name of the space between your thumb and fingers? ","Bogota is the capital of which country? ",
                "In the game of billiards, what color is the eight ball? ","Which country is also a continent? "};

        Scanner input = new Scanner(System.in);
        int numOfQuestions = 5;
        String[] userAnswers = new String[numOfQuestions];
        for(int counter = 0; counter < numOfQuestions; counter++){
            System.out.println(questions[counter]);
            userAnswers[counter] = input.next();
            if (userAnswers[counter].equalsIgnoreCase(correctAnswers[counter])){
                    System.out.println("That is correct!\n" );
                    totalCorrect++;
            }else{System.out.println("That is not correct.\n ");
            totalWrong++;}
        }
        System.out.println("You got " + totalCorrect + " answers correct. ");
        System.out.println("You got " + totalWrong + " answers wrong. ");
    }
}
