package Interface;

public class Dog implements Animal {

    @Override
    public void sounda() {
        System.out.println("AAA");
    }

    @Override
    public void eat() {
        System.out.println("BB");
    }
}
