import java.util.List;

public class Main {
    public static void main(String[] args) {

        Box<Fruit> box = BoxCreate.getFruitBox();
        BoxPrinter.printBox(box);

    }
}