public class Animal {
    private static int count; // Счетчик созданных животных

    public Animal() {
        count++;
    }

    public void run(int distance) {
        System.out.println("Животное пробежало " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println("Животное проплыло " + distance + " м.");
    }

    public static int getCount() {
        return count;
    }
}
