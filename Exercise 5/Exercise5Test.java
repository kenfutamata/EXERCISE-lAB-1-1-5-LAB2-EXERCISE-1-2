
import java.util.Scanner;
 
public class Exercise5Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int choose; 
        double radius; 
        double width; 
        double length; 
        double base;
        double height; 
        Exercise5 j1 = new Exercise5();  
        System.out.println("1. Calculate the Area of a Circle ");
        System.out.println("2. Calculate the Area of a Rectangle ");
        System.out.println("3. Calculate the Area of a Triangle ");
        System.out.println("4. Quit "); 

        System.out.print("Enter your choice(1-4): "); 
        choose = input.nextInt();
        j1.setChoose(choose);

        if(choose ==1){
            System.out.print("Enter radius: "); 
            radius=input.nextDouble(); 
            double circle = j1.circle(radius);
            System.out.printf("The area of a circle of %.2f is %.2f",radius, circle); 
        }
        if(choose ==2){
            System.out.print("Enter length: "); 
            length=input.nextDouble(); 
            j1.setlength(length);
            System.out.print("Enter width: "); 
            width=input.nextDouble();
            j1.setWidth(width); 
            double rectangle = j1.rectangle(length, width); 
            System.out.printf("The area of a rectangle of %.2f and %.2f is %.2f", length, width, rectangle );
   }
        if(choose ==3){
            System.out.print("Enter base: "); 
            base=input.nextDouble();  
            System.out.print("Enter height: "); 
            height=input.nextDouble();
            double triangle = j1.triangle(base, height); 
            j1.setHeight(height);System.out.printf("The area of a triangle %.2f and %.2f is %.2f", base, height, triangle); 
      }
       
    }
}
