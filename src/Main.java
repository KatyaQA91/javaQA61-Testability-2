public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightM = 1.87;                          //рост
        double weightKg = 98;                               // вес
        int bmi = service.calculate(heightM, weightKg);
        System.out.println(bmi);

    }
}