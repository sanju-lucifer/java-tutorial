public class AbstractDemo{
 public static void main(String[] args) {
rectangle s1=new rectangle();
circle s2=new circle();

s1.width=12;
s1.lenth=20;
s2.radious=14;
System.out.println("Rectangle Area is :"+s1.getArea());
System.out.println("Circle Area is :"+s2.getArea());
}
}