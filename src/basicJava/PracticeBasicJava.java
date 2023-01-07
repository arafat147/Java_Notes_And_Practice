package basicJava;

import java.util.Scanner;

public class PracticeBasicJava {
    N_Methods n_methods;

    String stName = "Alex";
    int age = 25;

    static String employeeName;
    static double salary = 12000.50;
    static char gender = 'M';

    public void studentInfo() {
        stName = "Hunter";
        System.out.println(stName);
    }

    public static void employeeInfo(){
        employeeName = "Williams";
        System.out.println("Employee name is " + employeeName);
        System.out.println("salary is " + salary);
        System.out.println("Gender is " + gender);
    }



    public static void main(String[] args) {
//        PracticeBasicJava pc = new PracticeBasicJava();
//        pc.studentInfo();
//        PracticeBasicJava.employeeInfo();
//
//        //casting:
//        int TvSize = 50;
//        double newtvSize = (double) TvSize;
//        System.out.println(newtvSize);
//
//        double salary = 1200.558;
//        int newSalary = (int) salary;
//        System.out.println(newSalary);
//
//        String ssn = "123456789";
//        int newSsn = Integer.parseInt(ssn);
//        int newSsn2 = Integer.valueOf(ssn);
//        System.out.println(newSsn);
//        System.out.println(newSsn2);

        PracticeBasicJava.ageCalculator();
    }

    public static void ageCalculator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age! ");
        int age = sc.nextInt();
        if (age>18 || age<65){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("get out of here !!");
        }
    }


}
