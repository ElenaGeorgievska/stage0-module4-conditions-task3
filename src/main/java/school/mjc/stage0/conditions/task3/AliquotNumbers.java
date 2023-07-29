package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        if (second % first == 0) {   //whether second is divisor of first
            System.out.println("Aliquot");
        } else {
            System.out.println("Not aliquot");
        }
    }

    public static void main(String[] args) {
        AliquotNumbers an = new AliquotNumbers();
        an.isFirstAliquot(5, 25);
    }

    //Implement the program that will consume 2 numbers as method arguments and will print if the first number is Aliquot(prints:"Aliquot" is yes otherwise "Not aliquot") to the other:
}
