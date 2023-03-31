
public class Exercise5 {
    private int choose; 
    private double length; 
    private double width;
    private double radius; 
    private double base; 
    private double height;
  
    
    public void setChoose(int choose){
        this.choose=choose; 
    }
    public  void setRadius(double radius){
        this.radius=radius;
    }
    public void setlength(double length){
        this.length=length; 
    }
    public void setWidth(double width){
        this.width=width; 
    }

    public void setBase(double base){
        this.base=base; 
    }

    public void setHeight(double height){
        this.height=height; 
    }
    public int getChoose(){
        return choose; 
    }
    
    public double getRadius(){
        return radius; 
    }

    public double getLength(){
        return length; 
    }

    public double getWidth(){
        return width; 
    }

    public double getBase(){
        return base; 
    }

    public double getHeight(){
        return height; 
    }

    public static double circle(double radius){
     double area; 
        return area = Math.PI*(radius)*2; 
    }

    public static double rectangle(double length, double width){
        double area; 
            return area = length*width; 
        
    }

    public static double triangle(double base, double height){
        double area; 
        return area = (double)base*height; 
    }

    
    
}
