import java.util.Scanner;

public class EmployeeSalary {

 public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);

 int[] salary = new int[5];

 int total = 0;

 int max = 0;

 System.out.println("Enter salary of 5 employees:");

 for (int i = 0; i < salary.length; i++) {

 System.out.print("Employee " + (i + 1) + ": ");

 salary[i] = sc.nextInt();

 total += salary[i];

 if (salary[i] > max) {

 max = salary[i];

 }

 }

 double average = total / 5.0;

 System.out.println("\n------------- OUTPUT -------------");

 System.out.println("Total Salary: " + total);

 System.out.println("Average Salary: " + average);

 System.out.println("Highest Salary: " + max);

 sc.close();

 }

}

Sample Output

Enter salary of 5 employees:

Employee 1: 25000

Employee 2: 30000

Employee 3: 28000

Employee 4: 35000

Employee 5: 40000

------------- OUTPUT -------------

Total Salary: 158000

Average Salary: 31600.0

Highest Salary: 40000
