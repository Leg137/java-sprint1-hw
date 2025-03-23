public class StepTracker {
    int goalByStepsPerDay = 10_000;
    Converter converter = new Converter();

    public void addNewNumberStepsPerDay(MonthData monthData, int month, int day, int steps) {
        //Метод для сохранения количества шагов за определённый день
        if (1 <= month & month <= 12) {
            if (1 <= day & day <= 30) {
                if (steps < 0) {
                    System.out.println("Введите положительное число.");
                } else {
                    monthData.monthDataArray[month - 1][day - 1] = steps;
                    System.out.println(steps + " шагов сохранено в " + day + "й день " + month + "го месяца");
                }
            } else {
                System.out.println("номер вводимого дня должен быть от 1 до 30 включительно.");
            }
        } else {
            System.out.println("номер вводимого месяца должен быть от 1 до 12 включительно.");
        }
    }

    public void changeStepGoal(int goalStepsNew) {
        //Метод для изменения целевого количества шагов
        if (goalStepsNew <= 0) {
            System.out.println("Введите положительное число.");
        } else {
            goalByStepsPerDay = goalStepsNew;
            System.out.println("Новая цель по количеству шагов в день: " + goalByStepsPerDay + " шагов");
        }
    }

    public void printStatistic(MonthData monthData, int month) {
        monthData.printDaysAndStepsFromMonth(month);

        System.out.println("Общее количество шагов за " + month + "й месяц: " +
                monthData.sumStepsFromMonth(month) + " шаг.\n");
        System.out.println("Максимальное пройденное количество шагов за " + month + "й месяц: " +
                monthData.maxSteps(month) + " шагов\n");
        System.out.println("Среднее количество шагов за " + month + "й месяц: " +
                monthData.averageSteps(month) + " шагов\n");
        System.out.println("Пройденная дистанция за " + month + "й месяц: " +
                converter.convertToKm(monthData.sumStepsFromMonth(month)) + " км\n");
        System.out.println("Количество сожжённых килокалорий за " + month + "й месяц: " +
                converter.convertStepsToKilocalories(monthData.sumStepsFromMonth(month)) + " килокалорий\n");
        System.out.println("Лучшая серия: максимальное количество подряд идущих дней," +
                "\nв течение которых количество шагов за день было равно или выше целевого: " +
                monthData.bestSeries(goalByStepsPerDay, month) + " подряд");
    }
}