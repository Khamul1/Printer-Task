package Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(10);
        printer.print("Hello word");
        printer.charge(5);
        printer.print("Hello word");

    }
}