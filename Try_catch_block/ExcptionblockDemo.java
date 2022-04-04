import java.util.*;
public class ExcptionblockDemo {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int x=1;
	do {
		try {
			System.out.println("enter number 1");
			int n1=input.nextInt();
			System.out.println("enter number 2");
			int n2=input.nextInt();
			double sum=n1/n2;
			System.out.println(sum);
			 x=2;
		}
		catch(Exception e) {
			System.out.println("cannot devide by zero");
			
		}
	}while(x==1);

}
}