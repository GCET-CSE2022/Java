//Divide by Zero Exception
import java.util.*; // for scanner class

public class Q4 {

    public static void main(String[] args) {
       int x,y;
       
       Scanner s = new Scanner(System.in);
       System.out.println("Enter a and b for a/b");
       x = s.nextInt();
        y = s.nextInt();
        try {
                int quo = x/y ;
                System.out.println("Result: " + quo); 
        }
        catch(ArithmeticException e ){
            System.out.println("Division By ZEro not defined");
        }

            s.close();

    }



}
