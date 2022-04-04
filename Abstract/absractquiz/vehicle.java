public abstract class vehicle {
public void maxspeed()
{
}
abstract public void displayModel();

}
class toyota extends vehicle{
@override
public void maxspeed(){
System.out.println("this is max speed");
}

}



class mainclass {
public static void main(String args[]){
toyota corolla =new toyota();
toyota crown=new toyota();
coralla.maxspeed();
toyota.maxspeed();


}
}