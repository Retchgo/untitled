
public class HelloWorld {

    private String string;

    public HelloWorld(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public static String returnString (String string) {
        return string;
    }

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld("Hello");
        for (int i = 0; i < 10; i++) {
            System.out.println(hw.getString());
        }
    }

}