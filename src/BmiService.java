public class BmiService {
    public int calculate(int a, int b) {
        double indexBmi;
        double heightM;
        double heightMSq;
        heightM =  (double)b / (double)100;
        heightMSq =  heightM*heightM;
        indexBmi = (double)a / heightMSq;
        return (int)indexBmi;

    }



}
