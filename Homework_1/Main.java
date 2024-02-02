public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        System.out.println("Создано животных: " + Animal.getCount());
        System.out.println("Создано собак: " + Dog.getCount());
        System.out.println("Создано котов: " + Cat.getCount());

        dog.run(400);
        dog.swim(8);

        cat1.run(150);
        cat1.swim(5);

        cat2.run(250);
        cat2.swim(2);

        Bowl bowl = new Bowl(20);
        cat1.setFoodInBowl(10);
        cat2.setFoodInBowl(5);

        cat1.eat(15);
        cat2.eat(3);

        System.out.println("Остаток еды в миске: " + bowl.getFood());
        System.out.println("Кот 1 сыт: " + cat1.isSatiety());
        System.out.println("Кот 2 сыт: " + cat2.isSatiety());
    }
}