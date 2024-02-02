public class Cat extends Animal {
    private static int count; // Счетчик созданных котов
    private boolean satiety; // Сытость кота
    private int foodInBowl; // Количество еды в миске

    public Cat() {
        super();
        count++;
        satiety = false;
        foodInBowl = 0;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("Кот пробежал " + distance + " м.");
        } else {
            System.out.println("Кот не может пробежать так далеко.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }

    public void eat(int amount) {
        if (amount <= foodInBowl) {
            foodInBowl -= amount;
            satiety = true;
            System.out.println("Кот поел и теперь сыт.");
        } else {
            System.out.println("В миске не хватает еды для кота.");
        }
    }

    public void setFoodInBowl(int foodInBowl) {
        this.foodInBowl = Math.max(0, foodInBowl);
    }

    public boolean isSatiety() {
        return satiety;
    }

    public static int getCount() {
        return count;
    }
}
