package OOPs.ExceptionHandling;

public class Main {
    
    public static void main(String[] args) {
        int a = 5;
        int b =0;
        try{
            int c= a/b;
            System.out.println(c);
        }catch(ArithmeticException e){ //  ArithmeticException can also be used for arthematic exception handling
            System.out.println("Error" + e.getMessage());
        }catch(Exception e){ //  ArithmeticException can also be used for arthematic exception handling
            System.out.println("Error" + e.getMessage());
        }finally{
            System.out.println("THIS WILL ALWAYS RUN");
        }

        


    }

}
