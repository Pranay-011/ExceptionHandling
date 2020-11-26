package NestedTry;

class Excep6 {
    public static void main(String[]args){
        try{
            try{
                System.out.println("going to divide");
                int b=39/0;
            }
            catch(ArithmeticException e){
                System.out.println("1--->"+e);
            }
            try{
                System.out.println("array indexing");
                int[] a= new int[5];
                a[5]=4;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("2--->"+e);
            }
            System.out.println("other statement");
        }
        catch(Exception e){
            System.out.println("ex------>"+e);
        }
        System.out.println("rest of the code...");
    }
}
