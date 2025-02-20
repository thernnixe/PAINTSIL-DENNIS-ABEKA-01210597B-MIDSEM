import java.util.Scanner;
public class speedOfMotor {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  double voltage, backEMF, motorConstant;

  while (true) {
      System.out.print("Enter Input Voltage (V): ");
      voltage = scanner.nextDouble();
      if (voltage > 0) break;
      System.out.println("Error: Voltage must be greater than zero. Please try again.");
  }
  
  while (true) {
      System.out.print("Enter Back EMF (V): ");
      backEMF = scanner.nextDouble();
      if (backEMF >= 0 && backEMF < voltage) break;
      System.out.println("Error: Back EMF must be non-negative and less than the input voltage.");
  }

  
  while (true) {
      System.out.print("Enter Motor Constant (V/rad/s): ");
      motorConstant = scanner.nextDouble();
      if (motorConstant > 0) break;
      System.out.println("Error: Motor Constant must be greater than zero.");
  }

  double speedRadPerSec = (voltage - backEMF) / motorConstant;

  double speedRPM = speedRadPerSec * 9.5493;

  System.out.printf("The speed of the DC motor is: %.2f RPM%n", speedRPM);

  scanner.close();
}
}










