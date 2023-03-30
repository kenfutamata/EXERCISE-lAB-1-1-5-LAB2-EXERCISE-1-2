

public class Exercise2 {
    private String id;
    private String desc; 
    private double unitPrice; 
    private int qty; 
    private double total; 

    public Exercise2(String id, String desc, double unitPrice, int qty){
        this.id=id; 
        this.desc=desc; 
        this.unitPrice=unitPrice; 
        this.qty=qty; 
    }

    public void setqty(int newqty){
        this.qty=newqty; 
    }

    public void setunitPrice(double newunitPrice){
        this.unitPrice=newunitPrice; 
    }

    public String getId(){
        return id; 
    }

    public int getQty(){
        return qty; 
    }

    public String getDesc(){
        return desc; 
    }

    public double getunitPrice(){
        return unitPrice; 
    }

    public double getTotal(){
        return total = getunitPrice()*getQty();
    }

    public String toString(){
        return "ID \t\t\t\t:"+getId()+"\n"+"DESCRIPTION \t: "+getDesc()+"\n"+"Price \t\t\t: "+getunitPrice()+"\n"+ "Quantity \t\t: "+getQty()+"\n"+"Total \t\t\t: "+getTotal();

    }


    
}
