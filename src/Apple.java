public class Apple implements Fruit {
    @Override
    public String getName() {
        return "Apple";
    }
    @Override
    public String toString() {
        return getName();
    }
}