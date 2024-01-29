public class Person {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Kochetkova Yana", "QA", "yana_3473@mail.ru", "89151949430", 500000, 33);
        persArray[2] = new Person("Olgina Olga", "Singer", "olga@example.com", "123412344", 70000, 32);
        persArray[3] = new Person("Opyat Oleg", "Analitik", "kozel@example.com", "00000000", 5000, 28);
        persArray[4] = new Person("Super Cat", "Pushistik", "meow@example.com", "1357908642", 1500000, 5);

        for (Person person : persArray) {
            person.displayInfo();
        }
    }
}