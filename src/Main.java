import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long n;
        long m;
        long maxSize = 1000000000000000000L;

        System.out.println("Введите стороны прямоугольника");
        while(true) {
            Scanner scanner = new Scanner(System.in);
            try {
                n = scanner.nextLong();
                m = scanner.nextLong();
                if (n <= maxSize && n >= 1 &&
                        m <=maxSize && m >=1)  {
                    break;
                }
                else {
                    throw new Exception("Вводите данные удовлетворяющие условиям задачи");
                }
            } catch (Exception e) {
                System.out.println("Вводите данные удовлетворяющие условиям задачи");
            }
        }

        long counter = 0;

        do {
            if (m > n) {
                long base = Double.valueOf(Math.ceil(m / n)).longValue();
                m = m - base * n;
                counter = counter + base;
            } else {
                long base = Double.valueOf(Math.ceil(n / m)).longValue();
                n = n - base * m;
                counter = counter + base;
            }
        } while (n > 0 && m > 0);

        System.out.println(counter);
    }
}