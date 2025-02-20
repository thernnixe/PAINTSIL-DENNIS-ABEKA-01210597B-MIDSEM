import java.util.Scanner;
public class ohmsLaw {
 public static void main(String[]arg){
double  voltage,current,resistance;
Scanner data=new Scanner(System.in);
System.out.println("enter the value for current");
current=data.nextDouble();
System.out.println("enter the value for resistance");
resistance=data.nextDouble();
voltage=current*resistance;
System.out.println("the value for the voltage is " +voltage +" V");
 }

}
