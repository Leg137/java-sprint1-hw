public class MonthData {
    //Хранение данных конкретного месяца
    int[][] monthDataArray = new int[12][30];

    void visualExampleMonth(int month) {
        //Метод для визуального отображения 30 дней месяца
        int[] monthExample = new int[monthDataArray[month - 1].length];
        System.out.println("Выберите число:");
        for (int i = 1; i <= monthDataArray[month - 1].length; i += 7) {
            for (int j = i; j < (i + 7) & (j <= monthDataArray[month - 1].length); j++) {
                monthExample[j - 1] = j;
                System.out.print("\t" + monthExample[j - 1] + "\t|");
            }
            System.out.print("\n");
        }
    }

    void visualExampleYear() {
        //Метод для визуального отображения 12 месяцев года
        System.out.println("Выберите месяц:  1-Янв |  2-Фев |  3-Мар |  4-Апр |  5-Май |  6-Июн \n\t\t\t\t" +
                " 7-Июл |  8-Авг |  9-Сен | 10-Окт | 11-Ноя | 12-Дек");
    }

    public void printDaysAndStepsFromMonth(int month) {
        System.out.println("Количество пройденных шагов за " + month + "й месяц: ");
        //Метод для подсчета количества пройденных шагов по дням
        for (int i = 0; i < monthDataArray[month - 1].length; i++) {
            System.out.println((i + 1) + " день: " + monthDataArray[month - 1][i]);
        }
    }

    public int sumStepsFromMonth(int month) {
        //Метод для подсчета общего количества шагов за месяц
        int sumSteps = 0;
        for (int i = 0; i < monthDataArray[month - 1].length; i++) {
            sumSteps = sumSteps + monthDataArray[month - 1][i];
        }
        return sumSteps;
    }

    public int maxSteps(int month) {
        //Метод для подсчета максимального пройденного количества шагов в месяце
        int maxSteps = 0;
        for (int i = 0; i < monthDataArray[month - 1].length; i++) {
            if (monthDataArray[month - 1][i] > maxSteps) {
                maxSteps = monthDataArray[month - 1][i];
            }
        }
        return maxSteps;
    }

    public double averageSteps(int month) {
        //Метод для подсчета среднего количества шагов
        double sumStepsDouble = sumStepsFromMonth(month);
        double monthToDataLengthDouble = monthDataArray[month - 1].length;
        return sumStepsDouble / monthToDataLengthDouble;
    }

    public int bestSeries(int goalSteps, int month) {
        //Метод для подсчета лучшей серии
        int seriesSteps = 1;
        int maxSeriesStep = 0;

        for (int i = 1; i < monthDataArray[month - 1].length; i++) {
            if ((monthDataArray[month - 1][i] >= goalSteps) & (monthDataArray[month - 1][i - 1] >= goalSteps)) {
                seriesSteps = seriesSteps + 1;
                if (seriesSteps > maxSeriesStep) {
                    maxSeriesStep = seriesSteps;
                }
            } else if (maxSeriesStep == 0 && monthDataArray[month - 1][i] == goalSteps) {
                maxSeriesStep = 1;
            }
        }
        return maxSeriesStep;
    }
}