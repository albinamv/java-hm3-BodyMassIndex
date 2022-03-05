public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 78; // вес в килограммах
        int height = 164; // рост в сантиметрах

        String bodyMassIndex = service.calculate(mass, height);
        System.out.println("Индекс массы тела: " + bodyMassIndex + " кг/м2");
    }
}
