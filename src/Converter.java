public class Converter {
    public double convertToKm(MonthData monthData, int month) {
        //Преобразование шагов в км
        double sumStepsDouble = monthData.sumStepsFromMonth(month);
        return sumStepsDouble * 75 / 100000;
    }

    public double convertStepsToKilocalories(MonthData monthData, int month) {
        //Преобразование шагов в ккал
        double sumStepsDouble = monthData.sumStepsFromMonth(month);
        return sumStepsDouble * 50 / 1000;
    }
}