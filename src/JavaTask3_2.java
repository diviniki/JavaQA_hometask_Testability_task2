public class JavaTask3_2 {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 98;
        int heightCm = 187;
        int indexBmi = service.calculate(weightKg, heightCm);
        System.out.println(indexBmi);

    }
}
