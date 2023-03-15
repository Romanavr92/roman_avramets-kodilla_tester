import java.util.Random;

public class RandomNumbers {
    int max = 0;
    int min = 100;

    public void drawRandomNumber() {
        Random random = new Random();
        int sum = 0;

        while (sum <= 5000) {
            int temp = random.nextInt(31);
            sum += temp;

            getMaxNumber(temp);
            getMinNumber(temp);
            System.out.println(getMaxNumber(temp));
            System.out.println(getMinNumber(temp));
        }
    }

    public int getMaxNumber(int number) {
        if (number > max) {
            max = number;
        }

        return max;
    }

    public int getMinNumber(int number) {
        if (number < min) {
            min = number;
        }

        return min;
    }

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.drawRandomNumber();

    }
}



