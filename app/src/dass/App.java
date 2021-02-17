package dass;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            while(true) {
                Thread.sleep(1000);
                System.out.print(".");
            }
        }
        catch(InterruptedException ex) {
            System.err.println("Execution interrupted.");
        }
    }
}
