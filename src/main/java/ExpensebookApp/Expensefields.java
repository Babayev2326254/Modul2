package ExpensebookApp;

public class Expensefields {
    private String name;
    private double amount;
    private boolean importance;
    private String category;

    public Expensefields() {
        this.name = name;
        this.amount = amount;
        this.importance = importance;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isImportance() {
        return importance;
    }

    public void setImportance(boolean importance) {
        this.importance = importance;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Expensefields{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", importance=" + importance +
                ", category='" + category + '\'' +
                '}';
    }
}
