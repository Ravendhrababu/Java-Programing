package numbers;

public class CountOfNumbers {

    public static void main(String[] args) {
        // input : 123456  output : 6

        int number = 1122334455;
        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }

        System.out.println("Count of number : " + count);
    }
}

