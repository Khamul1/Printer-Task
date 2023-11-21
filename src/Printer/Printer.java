package Printer;

public class Printer implements  IPrinter{


    public Printer() {
    }

    public Printer(int paintVolume) {
        this.paintVolume = paintVolume;
    }

    private int paintVolume;
    private int textleft(String text ) {
        return text.length();
    }

    public void print(String text) {
        int textLength = textleft(text);

        if (paintVolume >= textLength) {
            paintVolume -= textLength;
            System.out.println("На печать отправлен " + text + ", длина: " + textLength);
            System.out.println("Текст распечатан: " + text + ", у принтера осталось краски: " + paintVolume);
        } else {
            System.out.println("Не хватило краски: " + (textLength - paintVolume) + " (всего краски в принтере " + paintVolume + ")");
        }
    }
    @Override
    public void charge(int additionalPaint) {
        paintVolume += additionalPaint;
        System.out.println("Принтер пополнен на длину текста " + additionalPaint + " (всего краски в принтере: " + paintVolume + ")");
    }

    @Override
    public int getPainVolume() {
        return 0;
    }

    @Override
    public int getPaintVolume() {
        return paintVolume;
    }
    @Override
    public void setPaintVolume(int paintVolume) {
        this.paintVolume = paintVolume;
    }
}