package WRI;
import java.util.Scanner;
public class Selection2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int score1, score2;
        System.out.print("Enter a score1: ");
        score1 = input.nextInt();
        System.out.print("Enter a number score2: ");
        score2 = input.nextInt();
        double rata_rata;
        rata_rata = (score1 + score2) / 2;
        if (rata_rata >= 100) {
            rata_rata -= 5;
        } else {
            System.out.println(rata_rata);
        
        }
        System.out.println(rata_rata);
    

    }
}
