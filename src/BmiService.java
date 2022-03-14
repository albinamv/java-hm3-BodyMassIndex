public class BmiService {
    public String calculate(int mass, int height) {
        double bodyMassIndex = mass / (height * height * 0.0001);
        String result = String.format("%.1f", bodyMassIndex); // округление выводимого результата до 1 знака после запятой
        return result;
    }
}
