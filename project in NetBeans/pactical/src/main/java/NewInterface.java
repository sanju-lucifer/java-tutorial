
interface phone
{
public void sendSMS();
public int misscall();
public int notification();
}

 class mobile implements phone
{
@Override
public void sendSMS()
{
System.out.println("you have a new massage");
}
@Override
public int misscall(){
    return 5;
}
@Override
public int notification(){
     return 3;
      
}
}





