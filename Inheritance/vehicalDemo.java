public class vehicalDemo{
public static void main(String[] args) {
System.out.println("\n"+"\n");
supVehivcal veh=new supVehivcal();
subc_bike bike=new subc_bike();
subc_Car car=new subc_Car();
subc_van van=new subc_van();



bike.bikedetails();
System.out.println("\n");

car.cardetails();
System.out.println("\n");
van.vanDetails();

System.out.println("\n");

van.lordvan();

System.out.println("\n");
 veh.start();
 veh.accelerate();
veh.vehicalbrake();
}
}