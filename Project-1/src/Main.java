public class Main {

    public static void main(String[] args) {

        Temperature one = new Temperature();
        Temperature two = new Temperature(10);
        Temperature three = new Temperature('C');
        Temperature four = new Temperature(10,'F');

        one.setValue(30);
        one.setScale('F');
        four.setValue(34);
        four.setScale('F');

        System.out.println("Temp in C is "+ four.getTempC());
        System.out.println("Temp in F is "+ four.getTempF());

        Temperature.compare(one, four);
    }
}
