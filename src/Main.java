import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myAge;
        final int NUM = -10;
        String world = "tree";
        myAge = NUM + world;
        System.out.println(myAge);
        System.out.println(NUM);
        System.out.println(world);
        String name = "ведите ваше имя ";


        if (NUM < 0) {
            System.out.println("Вы соxранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число ");
        } else {
            System.out.println(" вы сохранили ноль ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println(name);
        String name1 = scanner.next();
        System.out.println("привет " + name1);
    }
}