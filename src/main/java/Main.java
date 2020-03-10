public class Main {

    private static final int TEN = 10;
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld("Hello");
        for (int i = 0; i < TEN; i++) {
            System.out.println(hw.getString());
        }

    }
}
