public class Main {

    public static void main(String[] args) {

        Temperature one = new Temperature();
        Temperature two = new Temperature(10);
        Temperature three = new Temperature('C');
        Temperature four = new Temperature(10,'F');

        one.setValue(30);
        four.setValue(34);
        four.setScale('F');

        System.out.println(four.getValue()+", "+ four.getScale());
    }
}
