package assignment;

import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) { // salary of employee.

        int salary;
        double HRA,DA,TotalSalary;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary");
        salary = scanner.nextInt();

        if(salary<=10000){
            HRA = salary * 0.2;
            DA = salary *0.8;
            TotalSalary  = HRA + DA;
            System.out.println("HRA-> "+HRA);
            System.out.println("DA-> "+DA);
            System.out.println("total salary-> "+TotalSalary);
        }else if (salary<=20000){
            HRA = salary * 0.2;
            DA = salary *0.8;
            TotalSalary  = HRA + DA;
            System.out.println("HRA-> "+HRA);
            System.out.println("DA-> "+DA);
            System.out.println("total salary "+TotalSalary);
        }else if (salary>20000){
            HRA =(double) salary * 0.2;
            DA = salary *0.8;
            TotalSalary  = HRA + DA;
            System.out.println("HRA "+HRA);
            System.out.println("DA "+DA);
            System.out.println("total salary "+TotalSalary);
        }else{
            System.out.println("Enter valid salary");
        }

    }
}
