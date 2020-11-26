package MultipleCatchBlock;

public class MultipleCatchBlock1 {
    public static void main(String[]args){
        try{
            int[]arr= new int[5];
            arr[5]=30/0;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occurs");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound Exception Occurs");
        }
        catch(Exception e ){
            System.out.println("Parent Exception Occurs");
        }
        System.out.println("rest of the code...");
    }
}
