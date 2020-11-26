package ThrowsDemo;
import java.io.IOException;
class M{
    void method() throws IOException{
        throw new IOException("device error");
    }
}





public class TestThrows2 {
    public static void main(String[] args) {
        M obj = new M();
        try {
            obj.method();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("normal flow");
    }
}
