package Printer;

public interface IPrinter {
    // методы-действия
    void print(String text); // печать переданного текста
    void charge(int symbolsCount); // заправить принтер краской (на нужное кол-во символов)

    // методы-свойства
    int getPainVolume(); // доступное количество краски в принтере

    int getPaintVolume();

    void setPaintVolume(int paintVolume);
}
