public class Main {

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld("Hello");
        for (int i = 0; i < 10; i++) {
            System.out.println(hw.getString());
        }

    }
}
