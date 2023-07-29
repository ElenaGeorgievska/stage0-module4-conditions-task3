package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {

        if (month >= 3 && month <= 5) {
            System.out.println("Spring");
        }

        if (month >= 6 && month <= 8) {
            System.out.println("Summer");
        }

        if (month >= 9 && month <= 11) {
            System.out.println("Autumn");
        }

        if ((month >= 1 && month <= 2) || month == 12) {
            System.out.println("Winter");
        }

        if (month >= 13 || month < 1) {
            System.out.println("wrong number!");
        }
    }

    public static void main(String[] args) {
        Seasons s = new Seasons();
        s.tellTheSeasonByMonthNumber(3);
    }
    //Print the name of a season by number of a month(e.g. if number is 6 => "Summer").
    // Number of the month will be coming from parameter of the method(if number is not a month number e.g. 13 => print: "wrong number!" ):
}
