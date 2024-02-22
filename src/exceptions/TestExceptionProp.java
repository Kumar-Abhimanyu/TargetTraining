package exceptions;
import java.io.IOException;
public class TestExceptionProp {
    void m() throws IOException{
        int c = 3+2;
        someMethod();
        throw new IOException("Device error"); //Checked exception
    }

    private void someMethod() {
        //Random function execution
    }

    void n() throws IOException{
        m(); //higher up handles it
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handled by p function");}
    }
    public static void main(String args[]){
        TestExceptionProp obj=new TestExceptionProp();
        obj.p();
        System.out.println("normal flow");
    }
}
