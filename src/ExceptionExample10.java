public class ExceptionExample10 {
    public static void main(String[]args){
        try{
            int a=30/0;
        }
        catch(Exception e){
            System.out.println("Exception:   "  +e);
        }
        System.out.println("rest of the code....");
    }
}
