package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month >= 1 && month <= 12) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println("31");
            } else if (month == 2) {
                System.out.println("28");
            } else {
                System.out.println("30");
            }

        } else {
            System.out.println("wrong number!");
        }
    }

    public static void main(String[]args){
        DaysInMonthPrinter dim = new DaysInMonthPrinter();
        dim.amountOfDays(6);
    }

    //Implement the program that will consume a number month from method argument
    // and print amount of days in that month,
    // if number is not a month number -> print: "wrong number!":
}
