import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int a;
        int nguesses = 0;
        int randNum = rand.nextInt(100);
        System.out.println("***Number guessing Game***");
        System.out.println("Please Enter number in between 1 to 100 only");
        //System.out.println(randNum);
        do {
            System.out.println("Enter Your Number");
            a = sc.nextInt();
            if(a<randNum){
                System.out.println("Go Higher!!! and choose a higher Number");
            }else if(a>randNum){
                System.out.println("Choose a Smaller Number Please!!!");
            }else{
                System.out.println("Hurrah:)");
            }
            nguesses++;
        }while (a!=randNum);
        System.out.println("You Guessed it right:)");
        System.out.println("You take "+nguesses+" rounds to guess a right  number");
    }
}
