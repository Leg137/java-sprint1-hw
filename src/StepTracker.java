import java.util.Scanner;

public class StepTracker {
    public static void selectDay(Scanner scanner, int[] month) {
        int[] monthExample = new int[month.length];

        System.out.println("Выберите число:");
        for (int i = 1; i <= monthExample.length; i += 7) {
            for (int j = i; j < (i + 7) & (j <= monthExample.length); j++) {
                monthExample[j-1] = j;
                System.out.print("\t" + monthExample[j-1] + "\t|");
            }
            System.out.println("");
        }

        int day = scanner.nextInt();

        if (day < 1 | day > month.length) {
            System.out.println("В этом месяце нет такого дня =)");
            return;
        } else {
            System.out.println("Введите количество шагов:");
            int numberSteps = scanner.nextInt();
            if (numberSteps < 0) {
                System.out.println("Шаги задом на перёд не засчитываются =)");
                return;
            } else {
                month[day-1] = numberSteps;
                System.out.println("Введенное количество шагов: " + month[day-1] + " сохранено.");
                for (int i = 0; i < month.length; i++) {
                    System.out.print((i + 1) + " день: " + month[i] + " шагов ");
                }


            }
        }
    }
}