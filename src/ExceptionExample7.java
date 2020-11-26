public class ExceptionExample7{
    public static  void main(String[]args){
        try{
            int data1=50/0;
            System.out.println("uparwala e:");
        }
        catch(Exception e){
            int data2=50/0;
            System.out.println("neechewala e:"+e);
        }
        System.out.println("rest of the code.....");
    }
}