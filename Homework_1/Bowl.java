// создадим класс Bowl для миски с едой:

public class Bowl {
    private int food;

    public Bowl(int initialFood) {
        this.food = Math.max(0, initialFood);
    }

    public void addFood(int amount) {
        this.food += Math.max(0, amount);
    }

    public int getFood() {
        return food;
    }
}
