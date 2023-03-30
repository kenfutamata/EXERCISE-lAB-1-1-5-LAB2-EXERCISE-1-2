public class Exercise3{

    private int num = 5; 

    public int getNum(){
        return num; 
    }

    public void counter(){
        for(int i = 1; i <=getNum(); i++){
            for(int j = 1; j <=getNum(); j++){
                System.out.println(j);
            }
            System.out.print(""); 
        }
    }
}