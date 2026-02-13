import java.util.Scanner;

class Employee {
    String name;
    int hours_worked;
    int hourly_rate;
    
    public Employee(String name, int hours, int rate) {
        this.name = name;
        this.hours_worked = hours;
        this.hourly_rate = rate;
    }
    
    int Base_Salary() {
        return this.hours_worked * this.hourly_rate;
    }
    
    double Bonus_Calculator() {
        int Salary = Base_Salary();
        return Salary > 10000 ? 0.2 : Salary > 5000 ? 0.1 : Salary > 3000 ? 0.05 : 0;
    }
    
    double Total_Salary() {
        return Base_Salary() * (1 + Bonus_Calculator());
    }
    
    public void Display_Information() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Base Salary: " + Base_Salary());
        System.out.println("Bonus: " + Bonus_Calculator());
        System.out.println("Total Salary: " + Total_Salary());
    }
}

public class SalarySystem {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[3];
        
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee number " + (i + 1) + " information");
            
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            
            System.out.println("Enter hours worked: ");
            int hours_worked = Integer.parseInt(sc.nextLine());
            
            System.out.println("Enter hourly rate: ");
            
            int hourly_rate = Integer.parseInt(sc.nextLine());
            
            employees[i] = new Employee(name, hours_worked, hourly_rate);
        }
        
        for (Employee em: employees) {
            em.Display_Information();
        }
       
    }
}
