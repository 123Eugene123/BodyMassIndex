public class BmiService {
    public int calculate(int weight, double height) {
        int index;
        index = (int) (weight / (height * height));
        return index;
    }
}