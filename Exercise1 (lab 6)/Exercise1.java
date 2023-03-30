
public class Exercise1 {
    private double length = 0.0; 
    private double width = 0.0; 
    private double rectangle;

    public void setLength(double length){
        this.length =length; 
    }

    public void setwidth(double width){
        this.width=width; 
    }

    public double getLength(){
        return length; 
    }

    public double getWidth(){
        return width; 
    }

    public double getArea(){
        return rectangle = getLength()*getWidth();
    }

    public void display(){
        System.out.printf("The area of rectangle is %.1f", getArea()); 
    }
}
