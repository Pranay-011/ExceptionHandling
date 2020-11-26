public class ExceptionExample {
    public static void main(String[]args){
        try{
            int res=50/0;
        }
        catch(ArithmeticException e){
            System.out.println("e: "+e);

        }
        System.out.println("rest of the code.....");
    }
}
