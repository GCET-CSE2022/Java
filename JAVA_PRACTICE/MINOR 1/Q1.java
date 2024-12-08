import java.lang.*;//for Math.PI

interface Shape{
    //methods and vars are static
    //final and constant fields
    //abstract methods
    void area();
}

class Circle implements Shape{
    int radius = 67;
    double area = Math.PI*radius*radius;
    
    @Override
    public void area(){
        
        System.out.println("Area is "+area);
    }
}

class Rectangle implements Shape{
    int l=8,b=87;
    int area = l*b;
        @Override
        public void area(){
            System.out.println("Area is "+area);
        }
        
}

class Q1{
 public static void main(String []args)   
    {
        Rectangle R= new Rectangle();
        Circle C = new Circle();
        
    C.area();
    R.area();
        
    }
}