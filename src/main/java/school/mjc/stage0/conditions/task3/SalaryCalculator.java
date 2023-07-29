package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 10000 && salary > 0) System.out.println(salary * 85 / 100d);    //100-15% =85%

        if (salary > 10000 && salary <= 20000) System.out.println(salary * 82 / 100d);  //100-18% = 82%

        if (salary > 20000) System.out.println(salary * 80 / 100d);  //100-20% = 80%

        if (salary < 0) System.out.println("wrong input!");
    }

    public static void main(String[] args) {
        SalaryCalculator sc = new SalaryCalculator();
        sc.calculateSalary(-1);
    }

    //Implement the program that will consume salary from method argument as input of an employee
    // and calculate its salary after taxes according to the following:
    // Basic Salary <= 10000: taxes - 15%. 10000 < Basic Salary <= 20000: taxes - 18% Basic Salary > 20000 : taxes - 20% Basic salary < 0 -> "wrong input!"
}
