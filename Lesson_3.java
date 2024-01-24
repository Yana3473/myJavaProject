import java.util.Arrays;

public class Lesson_3 {
    
    public static void main(String[] args) {
        System.out.println(sumLimit());
        Lesson_3.polarity();
        System.out.println(polarityBool());
        Lesson_3.printString();
        System.out.println(leapYear());
        Lesson_3.arrayFlip();
        Lesson_3.array100();
        Lesson_3.array6();
        Lesson_3.arrayDiagonal();
        Lesson_3.arrayCreate();
    }
    
    // Задание №1
    public static boolean sumLimit() {
        int a = 10, b = 3;
        int sum = a + b;
        if (sum>=10 && sum<=20){
            return true;
        } 
        else return false;
    }
    
    //Задание №2
    public static void polarity () {
        int a = 3;
        if (a >= 0){
            System.out.println("Число положительное");
        } 
        else {
            System.out.println("Число отрицательное");
        }
    }
    
    //Задание №3
    public static boolean polarityBool() {
        int a = -5;
        if (a >= 0){
            return false;
        }
        else return true;
    }
    
    //Задание №4
    public static void printString (){
        String inputString = "Hello";
        int count = 3;
        for (int i = 0; i < count; i++) {
            System.out.println(inputString);
        }
    }
    
    //Задание №5
    public static boolean leapYear () {
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return true;
        } 
        else return false;
    }
    
    //Задание №6
    public static void arrayFlip() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
    //Задание №7
    public static void array100() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    System.out.println(Arrays.toString(arr));
    }
    
    //Задание №8
    public static void array6() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    System.out.println(Arrays.toString(arr));
    }
    
    //Задание №9
    public static void arrayDiagonal() {
        int size = 5;
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            arr[i][i] = 1;
            arr[i][size - 1 - i] = 1;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        }
    }
    
    //Задание №10
    public static void arrayCreate() {
        int len = 5;
        int initialValue = 7;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i]=initialValue;
        }
    System.out.println(Arrays.toString(arr));
    }
        
}