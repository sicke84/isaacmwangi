import java.util.Scanner;

public class Scores{
    public static void main(String[]args) {
         caculateAverageScore();
    }

    public static void caculateAverageScore(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Scores for java");
        double javaScores = scanner.nextDouble();

         System.out.println("Enter Scores for java");
        double HCIScores = scanner.nextDouble();

         System.out.println("Enter Scores for java");
         double ApIScores scanner.nextDouble();

         double averageScore = (javaScores + HCIScores +ApIScores ) /3;

         System.out.println(" Scores for java is:" +javaScores);
         System.out.println(" Scores for HCI is:" +HCIScoresScores);
         System.out.println(" Scores for API is:" +APIScores);
         
         scanner.close();

    }
}