interface phone
{
public void sendSMS();
public int misscall();
}

 class mobile implements phone
{
public void sendSMS()
{
System.out.println("you have a new massage");
}
@Override
public int misscall(){
    return 5;
}
}

public class mobiletest {

    public static void main(String[] args) {
    
mobile m1=new mobile();
m1.sendSMS();
System.out.println("you have"+m1.misscall()+"missed calls");
}

}