import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(30) + 1;
                System.out.println(number);
                if (number>=30) {
                    System.out.println("Maksymalna liczba");
                }else if (number<=1) {
            System.out.println("Minimalna liczba");
        }

            }
        }



