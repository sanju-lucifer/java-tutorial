public class studentdata{

public static void main(String[] args) {

student st1=new student();
student st2=new student();

st1.setname("isuru");
st1.settelno(0117100100);
st1.setgpa(3.55);

st2.setname("isuru");
st2.settelno(0117100100);
st2.setgpa(3.55);


System.out.println("student name :"+st1.getname());
System.out.println("student tel.no:"+st1.gettelno());
System.out.println("student gpa :"+st1.getgpa());

System.out.println("student name :"+st2.getname());
System.out.println("student tel.no:"+st2.gettelno());
System.out.println("student gpa :"+st2.getgpa());

}

}