// multiple inheritance in java

interface A{

int a = 65;
}
interface B{
int b=5;
}

public class Q3 implements A,B{

    public static void main(String[] args) {
        
        int x = a+b;
    System.out.println("a + b = "+x);

    } 
    
}
