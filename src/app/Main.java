package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to WordCorrector app");

        String output = Corrector.handleData(
                new DataProvider().getData()
        );

        getOutput(output);
    }
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
