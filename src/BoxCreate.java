//Для принципа единственной ответственности выносим функционал наполнения
// коробки в отдельный класс

public class BoxCreate {
    public static Box<Fruit> getFruitBox() {
        Box<Fruit> fruitBox = new Box<>();

        // Добавление фруктов в коробку

        fruitBox.put(new Orange());
        fruitBox.put(new Apple());
        fruitBox.put(new Apple());
        fruitBox.put(new Orange());
        fruitBox.put(new Apple());
        fruitBox.put(new Orange());
        fruitBox.put(new Apple());

        return fruitBox;
    }
}
