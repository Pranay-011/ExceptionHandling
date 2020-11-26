package Finally;

class TestFinallyBlock1 {
    public static void main(String[]args){
        try{
            int data=25/0;
            System.out.println("data: "+data);
        }
        catch(NullPointerException e){
            System.out.println("Exception: "+e);
        }
        finally{
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code....");
    }
}
