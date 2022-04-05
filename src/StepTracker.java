public class StepTracker {

    int goalSteps = 10_000;
    int[][] monthToData = new int[12][30];

    void visualExampleMonth(int month) {
        //Метод для визуального отображения 30 дней месяца
        int[] monthExample = new int[monthToData[month - 1].length];
        for (int i = 1; i <= monthToData[month - 1].length; i += 7) {
            for (int j = i; j < (i + 7) & (j <= monthToData[month - 1].length); j++) {
                monthExample[j - 1] = j;
                System.out.print("\t" + monthExample[j - 1] + "\t|");
            }
            System.out.print("\n");
        }
    }

    public void savingStepsPerDay(int month, int day, int steps) {
        //Метод для сохранения количества шагов за определённый день
        if (steps < 0) {
            System.out.println("Введите положительное число.");
        } else {
            monthToData[month - 1][day - 1] = steps;
            System.out.println(steps + " шагов сохранено в " + day + "й день " + month + "го месяца");
        }
    }

    public void numberSteps(int month) {
        //Метод для подсчета количества пройденных шагов по дням
        for (int i = 0; i < monthToData[month - 1].length - 1; i++) {
            System.out.print((i + 1) + " день: " + monthToData[month - 1][i] + ", ");
        }
        System.out.print(monthToData[month - 1].length + " день: " + monthToData[month - 1][monthToData[month - 1].length - 1] + "\n\n");
    }

    public int sumSteps(int month) {
        //Метод для подсчета общего количества шагов за месяц
        int sumSteps = 0;
        for (int i = 0; i < monthToData[month - 1].length; i++) {
            sumSteps = sumSteps + monthToData[month - 1][i];
        }
        return sumSteps;
    }

    public int maxSteps(int month) {
        //Метод для подсчета максимальног пройденного количества шагов в месяце
        int maxSteps = 0;
        for (int i = 0; i < monthToData[month - 1].length; i++) {
            if (monthToData[month - 1][i] > maxSteps) {
                maxSteps = monthToData[month - 1][i];
            }
        }
        return maxSteps;
    }

    public double averageSteps(int month) {
        //Метод для подсчета среднего количества шагов
        double sumStepsDouble = sumSteps(month);
        double monthToDataLengthDouble = monthToData[month - 1].length;
        return sumStepsDouble / monthToDataLengthDouble;
    }

    public int seriesSteps(int month) {
        //Метод для подсчета лучшей серии
        int seriesSteps = 1;
        int maxSeriesStep = 0;
        for (int i = 1; i < monthToData[month - 1].length; i++) {
            if ((monthToData[month - 1][i] >= goalSteps) & (monthToData[month - 1][i - 1] >= goalSteps)) {
                seriesSteps = seriesSteps + 1;
                if (seriesSteps > maxSeriesStep) {
                    maxSeriesStep = seriesSteps;
                }
            } else {
                seriesSteps = 1;
            }
        }
        return maxSeriesStep;
    }

    public void goalSteps(int goalStepsNew) {
        //Метод для изменения целевого количества шагов
        if (goalStepsNew < 0) {
            System.out.println("Введите положительное число.");
        } else {
            goalSteps = goalStepsNew;
            System.out.println("Новая цель по количеству шагов в день: " + goalSteps + " шагов");
        }
    }

    public class Converter {
        //Внутренний класс класса StepTracker
        public double distanceSteps(int month) {
            //Метод для подсчета пройденной дистанции (в км)
            double sumStepsDouble = sumSteps(month);
            return sumStepsDouble * 75 / 100000;
        }

        public double caloriesSteps(int month) {
            //Метод для подсчета количества сожжённых килокалорий
            double sumStepsDouble = sumSteps(month);
            return sumStepsDouble * 50 / 1000;
        }
    }
}
