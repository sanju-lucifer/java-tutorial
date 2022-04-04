/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucifer Lap
 */
public class mobiletest {

    public static void main(String[] args) {
    
mobile m1=new mobile();
m1.sendSMS();
System.out.println("you have"+ m1.misscall() +"missed calls");
System.out.println("you have"+ m1.notification() +"missed calls");

    }

}
    
    

