package Genericlearn;

public class Numericbox<T extends Number> {
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Numericbox<Double> content = new Numericbox<>();
        content.setName(90.00);
        double cont = content.getName();
        // Numericbox<String> contents = new Numericbox<>();
        System.out.println(cont);
    }

}
