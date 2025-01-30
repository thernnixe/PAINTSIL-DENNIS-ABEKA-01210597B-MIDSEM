//. Develop a java application with Employee class with Emp_name, Emp_id, Address, Mail_id, Mobile_no as members. Inherit the classes, Programmer, Assistant Professor, Associate Professor and Professor from employee class. Add Basic Pay (BP) as the member of all the 74 inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff club fund. Generate pay slips for the employees with their gross and net salary. 


import java.util.Scanner;

class Employee {
    String empName;
    String empId;
    String address;
    String mailId;
    String mobileNo;
    double basicPay;

    
    public Employee(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
    }

    // Method to calculate and print pay slip
    public void generatePaySlip() {
        double da = 0.97 * basicPay; 
        double hra = 0.10 * basicPay; 
        double pf = 0.12 * basicPay; 
        double staffClubFund = 0.001 * basicPay; 
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - (pf + staffClubFund);

        System.out.println("\nPay Slip for " + empName + " (ID: " + empId + ")");
        System.out.printf("Basic Pay: %.2f\n", basicPay);
        System.out.printf("DA (97%%): %.2f\n", da);
        System.out.printf("HRA (10%%): %.2f\n", hra);
        System.out.printf("PF (12%%): %.2f\n", pf);
        System.out.printf("Staff Club Fund (0.1%%): %.2f\n", staffClubFund);
        System.out.printf("Gross Salary: %.2f\n", grossSalary);
        System.out.printf("Net Salary: %.2f\n", netSalary);
    }
}

// Programmer Class
class Programmer extends Employee {
    public Programmer(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

    @Override
    public void generatePaySlip() {
        System.out.println("\nProgrammer Pay Slip:");
        super.generatePaySlip();
    }
}

// Assistant Professor Class
class AssistantProfessor extends Employee {
    public AssistantProfessor(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

    @Override
    public void generatePaySlip() {
        System.out.println("\nAssistant Professor Pay Slip:");
        super.generatePaySlip();
    }
}

// Associate Professor Class
class AssociateProfessor extends Employee {
    public AssociateProfessor(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

    @Override
    public void generatePaySlip() {
        System.out.println("\nAssociate Professor Pay Slip:");
        super.generatePaySlip();
    }
}

// Professor Class
class Professor extends Employee {
    public Professor(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

    @Override
    public void generatePaySlip() {
        System.out.println("\nProfessor Pay Slip:");
        super.generatePaySlip();
    }
}

// Main Class
public class question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Employee Payroll System");
        System.out.println("Enter details for the employee.");

        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter Employee ID: ");
        String empId = scanner.nextLine();

        System.out.print("Enter Employee Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Employee Mail ID: ");
        String mailId = scanner.nextLine();

        System.out.print("Enter Employee Mobile Number: ");
        String mobileNo = scanner.nextLine();

        System.out.print("Enter Basic Pay: ");
        double basicPay = scanner.nextDouble();

        System.out.println("\nSelect Employee Type:");
        System.out.println("1. Programmer");
        System.out.println("2. Assistant Professor");
        System.out.println("3. Associate Professor");
        System.out.println("4. Professor");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        Employee employee;
        switch (choice) {
            case 1 -> employee = new Programmer(empName, empId, address, mailId, mobileNo, basicPay);
            case 2 -> employee = new AssistantProfessor(empName, empId, address, mailId, mobileNo, basicPay);
            case 3 -> employee = new AssociateProfessor(empName, empId, address, mailId, mobileNo, basicPay);
            case 4 -> employee = new Professor(empName, empId, address, mailId, mobileNo, basicPay);
            default -> {
                System.out.println("Invalid choice!");
                return;
            }
        }

        // Generate Pay Slip
        employee.generatePaySlip();

        scanner.close();
    }
}
