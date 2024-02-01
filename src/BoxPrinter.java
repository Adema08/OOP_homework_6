//Для принципа единственной ответственности выносим функционал вывода в отдельный
// класс
import java.util.List;

public class BoxPrinter {
    public static <T extends Fruit> void printBox(Box<T> box) {
        List<T> items = box.get();

        System.out.println("В коробке:");
        for (T item : items) {
            System.out.println(item);
        }
    }
}
