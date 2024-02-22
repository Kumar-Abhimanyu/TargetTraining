package exceptions;

public class JavaExceptionExample {
    public static void main(String[] args) {
        try{
            String s = null;
            System.out.println(s.length());
        }
        catch(NullPointerException e){
            System.out.println("The error is : "+e);
        }
    }
}
