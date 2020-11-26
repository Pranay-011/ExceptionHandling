package MultipleCatchBlock;
public class MultipleCatchBlock4{
    public static void main(String[]args){
        try{
            String s = null;
            System.out.println(s.length());
        }
        catch(ArithmeticException e){
            System.out.println("Arithemtic Exception occurs----->"+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("arrayindex out of bounds exception occurs---->"+e);
        }
        catch (Exception e){
            System.out.println("Parent Exception Occurs---->"+e);
        }
        System.out.println("rest of the code....");
    }
}