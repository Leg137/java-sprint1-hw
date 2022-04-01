import java.util.Scanner;

public class StepTracker {

    Scanner scanner = new Scanner(System.in);
    int[] january = new int[31];
    int[] february = new int[28];
    int[] march = new int[31];
    int[] april = new int[30];
    int[] may = new int[31];
    int[] june = new int[30];
    int[] july = new int[31];
    int[] august = new int[31];
    int[] september = new int[30];
    int[] october = new int[31];
    int[] november = new int[30];
    int[] december = new int[31];
    int goalSteps = 10000;

    void savingSteps(int numberMonth) {
        if (numberMonth == 1) {
            monthExample(january);
            savingStepsPerDay(scanner, january);
        } else if (numberMonth == 2) {
            monthExample(february);
            savingStepsPerDay(scanner, february);
        } else if (numberMonth == 3) {
            monthExample(march);
            savingStepsPerDay(scanner, march);
        } else if (numberMonth == 4) {
            monthExample(april);
            savingStepsPerDay(scanner, april);
        } else if (numberMonth == 5) {
            monthExample(may);
            savingStepsPerDay(scanner, may);
        } else if (numberMonth == 6) {
            monthExample(june);
            savingStepsPerDay(scanner, june);
        } else if (numberMonth == 7) {
            monthExample(july);
            savingStepsPerDay(scanner, july);
        } else if (numberMonth == 8) {
            monthExample(august);
            savingStepsPerDay(scanner, august);
        } else if (numberMonth == 9) {
            monthExample(september);
            savingStepsPerDay(scanner, september);
        } else if (numberMonth == 10) {
            monthExample(october);
            savingStepsPerDay(scanner, october);
        } else if (numberMonth == 11) {
            monthExample(november);
            savingStepsPerDay(scanner, november);
        } else if (numberMonth == 12) {
            monthExample(december);
            savingStepsPerDay(scanner, december);
        } else {
            System.out.println("В году 12 месяцев =)");
        }
    }
    void savingStepsPerDay(Scanner scanner, int[] month) {
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
                month[day - 1] = numberSteps;
                System.out.println("Введенное количество шагов: " + month[day - 1] + " сохранено.");
                for (int i = 0; i < month.length; i++) {
                    System.out.print((i + 1) + " день: " + month[i] + " шагов ");
                }


            }
        }
    }
    void monthExample(int[] month) {
        int[] monthExample = new int[month.length];
        for (int i = 1; i <= month.length; i += 7) {
            for (int j = i; j <= (i + 7) & (j <= month.length); j++) {
                monthExample[j - 1] = j;
                System.out.print("\t" + monthExample[j - 1] + "\t|");
            }
            System.out.println("");
        }
    }
    void statistics() {

    }
}