public class Main {
    public static void main(String[] args) throws Exception {
        Display d1 = new Display(new StringDisplayImpl("Hello Japan!"));
        Display d2 = new Display(new StringDisplayImpl("Hello World!"));
        countDisplay d3 = new countDisplay(new StringDisplayImpl("Hello University!"));
        d1.display();
        d2.display();
        d3.display();
        // d3.multiDisplay(5);
        d3.randomDisplay();
    }
}
