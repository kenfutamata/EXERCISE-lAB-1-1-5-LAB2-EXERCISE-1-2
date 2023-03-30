
import java.util.Scanner;

public class Exercise2Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        String id; 
        String desc; 
        double unitPrice; 
        int qty; 
        
        id = input.next(); 
        desc=input.next(); 
        unitPrice = input.nextDouble(); 
        qty=input.nextInt(); 

        Exercise2 j1 = new Exercise2(id, desc, unitPrice, qty); 
        System.out.print(j1.toString());  
    }
}
