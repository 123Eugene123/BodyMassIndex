public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int myIndex = service.calculate(58, 1.59);
        System.out.println(myIndex);
    }
}