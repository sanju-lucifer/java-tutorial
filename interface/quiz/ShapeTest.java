 interface shape {
    public void display();
    
}
class circle implements shape
{

public void display()
{
System.out.println("this is a circle");
}
}
class triangle implements shape
{
    public void  display()
    {
        System.out.println("this is a triangle");
    }
} 

public class ShapeTest {

  
    public static void main(String[] args) {
        circle c1=new circle();
        triangle t1=new triangle();
        c1.display();
        t1.display();
        
        
    }
    
}