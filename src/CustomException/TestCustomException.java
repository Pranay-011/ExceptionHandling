package CustomException;
class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}

 class TestCustomException {
        static void  validate(int age) throws InvalidAgeException{
            if(age<18){
                throw new InvalidAgeException("not eligible to vote");
            }
            else{
                System.out.println("Welcome To Vote");
            }
        }
        public static void main(String[]args){
            try {
                validate(13);
            }
            catch(InvalidAgeException e){
                System.out.println("Exception Occured==>"+e);
                e.printStackTrace();
            }
            System.out.println("rest of the code..");
        }
}
