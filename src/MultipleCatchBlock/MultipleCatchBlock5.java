package MultipleCatchBlock;
class MultipleCatchBlock5{
    public static void main(String[]args){
        try{
            int[] a = new int[5];
            a[5]=30/0;
        }
        catch(Exception e){
            System.out.println("common task completed--->"+e);
        }
        /*catch(ArithmeticException e){
            System.out.println("task 1 completed--->"+e);
        }*/
        /*catch(ArrayIndexOutOfBoundsException e){
            System.out.println("task 2 completed--->"+e);
        }*/
        System.out.println("rest of the code...");
    }
}