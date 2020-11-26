package ThrowsDemo;
import java.io.IOException;
class M2{
    void method() throws IOException{
        throw new IOException();
    }
}

class TestThrows4 {
    public static void main(String[]args)throws IOException{
        M2 obj = new M2();
        obj.method();
        System.out.println("normal flow");
    }
}
