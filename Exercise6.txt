import java.util.Scanner;

public class EmpTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] salaries = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Salary of Employee " + (i + 1) + ": ");
            salaries[i] = scanner.nextDouble();
        }

        double TotSalary = 0;
        for(double sal : salaries){
            TotSalary += sal;
        }
        double avgSalary = TotSalary/5;

        int aboveAvg = 0;
        int belowAvg = 0;
        for(double sal : salaries){
            if(sal > avgSalary){
                aboveAvg++;
            }
            else if(sal < avgSalary){
                belowAvg++;
            }
        }

        System.out.println("\nAverage Salary: " + avgSalary);
        System.out.println("Employees with salary above average: " + aboveAvg);
        System.out.println("Employees with salary below average: " + belowAvg);

    }
}

// OUTPUT

// Salary of Employee 1: 10000
// Salary of Employee 2: 32837
// Salary of Employee 3: 23767
// Salary of Employee 4: 28377
// Salary of Employee 5: 36763

// Average Salary: 26348.8
// Employees with salary above average: 3
// Employees with salary below average: 2