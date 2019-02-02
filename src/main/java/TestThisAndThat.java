public class TestThisAndThat {
    public double addAToB(double a, double b) {
        return a + b;
    }

    public double substractAFromB(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {

        TestThisAndThat Calculator = new TestThisAndThat();

        double result = Calculator.addAToB(2.5, 2.45);
        System.out.println("Its Work and result is : " + result);

    }
}