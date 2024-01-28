public class BmiService {
    public int calculate(int weightKg, int heightCm) {
        double indexBmi;
        double heightM;
        double heightMSq;
        heightM = (double) heightCm / (double) 100;
        heightMSq = heightM * heightM;
        indexBmi = (double) weightKg / heightMSq;
        return (int) indexBmi;

    }


}
