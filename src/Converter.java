public class Converter {
    public double convertToKm(int sumSteps) {
        //Преобразование шагов в км
        return (double) (sumSteps * 75) / 100000;
    }

    public double convertStepsToKilocalories(int sumSteps) {
        //Преобразование шагов в ккал
        return (double) (sumSteps * 50) / 1000;
    }
}