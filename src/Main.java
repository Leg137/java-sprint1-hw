import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        StepTracker stepTracker = new StepTracker();
        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Выберите месяц:  1-Янв |  2-Фев |  3-Мар |  4-Апр |  5-Май |  6-Июн \n\t\t\t\t" +
                        " 7-Июл |  8-Авг |  9-Сен | 10-Окт | 11-Ноя | 12-Дек");
                int month = scanner.nextInt();
                if (month == 1) {
                    stepTracker.selectDay(scanner, january);
                } else if (month == 2) {
                    stepTracker.selectDay(scanner, february);
                } else if (month == 3) {
                    stepTracker.selectDay(scanner, march);
                } else if (month == 4) {
                    stepTracker.selectDay(scanner, april);
                } else if (month == 5) {
                    stepTracker.selectDay(scanner, may);
                } else if (month == 6) {
                    stepTracker.selectDay(scanner, june);
                } else if (month == 7) {
                    stepTracker.selectDay(scanner, july);
                } else if (month == 8) {
                    stepTracker.selectDay(scanner, august);
                } else if (month == 9) {
                    stepTracker.selectDay(scanner, september);
                } else if (month == 10) {
                    stepTracker.selectDay(scanner, october);
                } else if (month == 11) {
                    stepTracker.selectDay(scanner, november);
                } else if (month == 12) {
                    stepTracker.selectDay(scanner, december);
                } else {
                    System.out.println("В году 12 месяцев =)");
                }


            } else if (command == 2) {
                //
            } else if (command == 3) {
                //
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }


    private static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выход");
    }
}