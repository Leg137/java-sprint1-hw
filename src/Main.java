import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StepTracker stepTracker = new StepTracker();

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Выберите месяц:  1-Янв |  2-Фев |  3-Мар |  4-Апр |  5-Май |  6-Июн \n\t\t\t\t" +
                        " 7-Июл |  8-Авг |  9-Сен | 10-Окт | 11-Ноя | 12-Дек");
                int month = scanner.nextInt();

                System.out.println("Выберите число:");
                stepTracker.savingSteps(month);



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