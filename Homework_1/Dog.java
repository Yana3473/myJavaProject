public class Dog extends Animal {
    private static int count; // Счетчик созданных собак

    public Dog() {
        super();
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Собака пробежала " + distance + " м.");
        } else {
            System.out.println("Собака не может пробежать так далеко.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Собака проплыла " + distance + " м.");
        } else {
            System.out.println("Собака не может проплыть так далеко.");
        }
    }

    public static int getCount() {
        return count;
    }
}
