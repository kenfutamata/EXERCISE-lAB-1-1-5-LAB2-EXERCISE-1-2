package Exercise4;
import java.util.Scanner; 
public class Exercise4 {
    static int maxNum(int num1, int num2){
    return Math.max(num1, num2);
   } 
   static double maxNum(double num1, double num2){
    return Math.max(num1, num2);

   }

   public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    int num1; 
    int num2; 
    double num11; 
    double num22; 
    int choose; 

    System.out.println("Enter data type: ");
    System.out.println("1. integer ");
    System.out.println("2. double ");
    System.out.print("Choose 1 datatype: "); 
    choose = input.nextInt();

    if(choose == 1){
         System.out.println("You choose integer datatype");
         System.out.print("Enter num1: "); 
        num1 = input.nextInt(); 
        System.out.print("Enter num2: "); 
        num2 = input.nextInt();
        System.out.printf("Maximum number is %d\n", maxNum(num1, num2)); 
    
    }
    else if(choose ==2){
        System.out.println("You choose double datatype");
        System.out.print("Enter num1: "); 
        num11 = input.nextDouble(); 
        System.out.print("Enter num2: "); 
        num22 = input.nextDouble();
       System.out.printf("Maximum number is %.2f\n", maxNum(num11, num22)); 

        

    }
   } 
}
