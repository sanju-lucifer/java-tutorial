abstract class shape{
abstract public int getArea();
}
class rectangle extends shape{
int lenth,width;


public int getArea(){
return(lenth*width);
}
}

class circle extends shape{
int radious;

public int getArea(){
return(int)(3.14*radious*radious);
}}