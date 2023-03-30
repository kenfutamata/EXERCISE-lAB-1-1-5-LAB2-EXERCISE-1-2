package Exercise1; 
import java.util.Scanner;

public class ExerciseTest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        char a1, a2; 
        int num1, num2; 

        System.out.print("Enter Lowercase letter: "); 
        a1 = input.next().charAt(0);
        
        System.out.print("Enter Uppercase letter: "); 
        a2 = input.next().charAt(0);

        System.out.print("Enter num1: "); 
        num1 = input.nextInt(); 

        System.out.print("Enter num2: "); 
        num2 = input.nextInt(); 

        Exercise1 j1 = new Exercise1(a1, a2, num1, num2); 
        j1.display();
    }
}