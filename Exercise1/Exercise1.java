package Exercise1; 
import static java.lang.Character.*; 
import static java.lang.Math.*; 

public class Exercise1{

    private char a1; 
    private char a11; 
    private char a2; 
    private char a22; 
    private int num1; 
    private double num11;
    private int num2; 
    private double num22; 

    public Exercise1(char a1, char a2, int num1, int num2){
        this.a1 = a1; 
        this.a2 = a2; 
        this.num1=num1; 
        this.num2=num2; 
    }

    public char getA1(){
        return a1; 
    }

    public char getA2(){
        return a2; 
    }

    public int getNum1(){
        return num1; 
    }

    public int getNum2(){
        return num2; 
    }



    public void display(){
        System.out.printf("The uppercase of %c is %c\n", getA1(), Character.toUpperCase(getA1()));
        System.out.printf("The lowercase of %c is %c\n", getA2(), Character.toLowerCase(getA2()));
        System.out.printf("Math.sqrt(%d) = %.2f\n", getNum1(), Math.sqrt(getNum1()));
        System.out.printf("Math.sqrt(%d) = %.2f\n", getNum2(), Math.sqrt(getNum2()));

    }


}
