package ThrowsDemo;

import java.io.*;

class M1{
    void method() throws IOException{
        System.out.println("device Operation Failed");
    }
}



class TestThrows3 {
    public static void main(String[]args) throws IOException{
        M1 obj = new M1();
        obj.method();
        System.out.println("normal flow...");
    }
}
