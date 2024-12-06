import java.util.Scanner;

//«Счётчик калорий»
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MonthData monthData = new MonthData();
        StepTracker stepTracker = new StepTracker();

        while (true) {
            //Выбор пункта меню
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                monthData.visualExampleYear();
                int month = scanner.nextInt();

                if (month < 1 | month > 12) {
                    System.out.println("Введен не правильный номер месяца");
                } else {
                    monthData.visualExampleMonth(month);
                    int day = scanner.nextInt();

                    if (day < 1 | day > 30) {
                        System.out.println("Введен не правильный номер дня");
                    } else {
                        System.out.println("Введите количество шагов:");
                        int steps = scanner.nextInt();
                        stepTracker.addNewNumberStepsPerDay(monthData, month, day, steps);                    }
                }
            } else if (command == 2) {
                monthData.visualExampleYear();
                int month = scanner.nextInt();

                if (month < 1 | month > 12) {
                    System.out.println("Введен не правильный номер месяца");
                } else {
                    stepTracker.printStatistic(monthData, month);
                }
            } else if (command == 3) {
                System.out.println("Введите новую цель:");
                int goalStepsNew = scanner.nextInt();
                stepTracker.changeStepGoal(goalStepsNew);
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    private static void printMenu() {
        //Вывод меню
        System.out.println("\nЧто вы хотите сделать?");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выход");
    }
}