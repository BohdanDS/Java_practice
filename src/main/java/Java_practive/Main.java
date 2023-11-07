package Java_practive;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int a = 55;
        int b = 20;

        System.out.println("Сложение : " + (a + b));
        System.out.println("Вычитание : " + (a - b));
        System.out.println("Умножение : " + (a * b));
        System.out.println("Деление : " + (a / b));
        System.out.println("Остаток деления : " + (a % b));


        System.out.println("Равно: " + (a == b));
        System.out.println("Не равно: " + (a != b));
        System.out.println("Больше или равно или меньше или равно: " + (a >= b || a <= b));
        System.out.println("Больше и меньше: " + (a > b && b < a));


        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        int z = x*y;
        System.out.println("z value is : "+z);


        int numberInt = 50;
        double numberDouble = 10.5;
        System.out.println("Сложение : "+(numberInt+numberDouble));
        System.out.println("Вычитание : "+(numberInt-numberDouble));
        System.out.println("Деление : "+(numberInt/numberDouble));
        System.out.println("Умножение : "+(numberInt*numberDouble));
        System.out.println("Остаток деления : "+(numberInt%numberDouble));
        String message = numberInt>numberDouble ? "Int" : "Double";
        System.out.println(message);
    }
}