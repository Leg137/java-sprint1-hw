import java.util.Scanner;
//«Счётчик калорий»
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        StepTracker.Converter converter = stepTracker.new Converter();

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Выберите месяц:  1-Янв |  2-Фев |  3-Мар |  4-Апр |  5-Май |  6-Июн \n\t\t\t\t" +
                        " 7-Июл |  8-Авг |  9-Сен | 10-Окт | 11-Ноя | 12-Дек");
                int month = scanner.nextInt();
                if (month < 1 | month > 12) {
                    System.out.println("Введен не правильный номер месяца");
                } else {
                    System.out.println("Выберите число:");
                    stepTracker.monthVisualExample(month); //Метод для визуального отображения 30 дней месяца
                    int day = scanner.nextInt();
                    if (day < 1 | day > 30) {
                        System.out.println("Введен не правильный номер дня");
                    } else {
                        System.out.println("Введите количество шагов:");
                        int steps = scanner.nextInt();

                        stepTracker.savingStepsPerDay(month, day, steps); //Метод для сохранения количества шагов за определённый день
                    }
                }
            } else if (command == 2) {
                System.out.println("Выберите месяц:  1-Янв |  2-Фев |  3-Мар |  4-Апр |  5-Май |  6-Июн \n\t\t\t\t" +
                        " 7-Июл |  8-Авг |  9-Сен | 10-Окт | 11-Ноя | 12-Дек");
                int month = scanner.nextInt();
                if (month < 1 | month > 12) {
                    System.out.println("Введен не правильный номер месяца");
                } else {
                    System.out.println("Количество пройденных шагов по дням за " + month + "й месяц: ");
                    stepTracker.numberSteps(month); //Метод для подсчета количества пройденных шагов по дням

                    System.out.println("Общее количество шагов за " + month + "й месяц: " + stepTracker.sumSteps(month) + " шаг.\n"); //Метод для подсчета общего количества шагов за месяц

                    System.out.println("Максимальное пройденное количество шагов за " + month + "й месяц: " + stepTracker.maxSteps(month) + " шагов\n"); //Метод для подсчета максимальног пройденного количества шагов в месяце

                    System.out.println("Среднее количество шагов за " + month + "й месяц: " + stepTracker.averageSteps(month) + " шагов\n"); //Метод для подсчета среднего количества шагов

                    System.out.println("Пройденная дистанция за " + month + "й месяц: " + converter.distanceSteps(month) + " км\n"); //Метод для подсчета пройденной дистанции (в км)

                    System.out.println("Количество сожжённых килокалорий за " + month + "й месяц: " + converter.caloriesSteps(month) + " килокалорий\n"); //Метод для подсчета количества сожжённых килокалорий

                    System.out.println("Лучшая серия: максимальное количество подряд идущих дней," +
                            "\nв течение которых количество шагов за день было равно или выше целевого: " + stepTracker.seriesSteps(month) + " подряд"); //Метод для подсчета лучшей серии: максимального количества подряд идущих дней, в течение которых количество шагов за день было равно или выше целевого
                }
            } else if (command == 3) {
                System.out.println("Введите новую цель:");
                int goalStepsNew = scanner.nextInt();
                stepTracker.goalSteps(goalStepsNew); //Метод для изменения целевого количества шагов

            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    private static void printMenu () {
        System.out.println("\nЧто вы хотите сделать?");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выход");
    }
}
