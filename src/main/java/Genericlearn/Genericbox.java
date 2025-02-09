package Genericlearn;

public class Genericbox<T> {
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Genericbox<String> box = new Genericbox<>();

        box.setName("faxi");
        String content = box.getName();
        System.out.println(content);

        Genericbox<Integer> box2 = new Genericbox<>();

        box2.setName(123);
        int cont = box2.getName();
        System.out.println(cont);
    }
}
