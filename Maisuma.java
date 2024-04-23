import java.util.Scanner;
public class Maisuma { 
    public static void main(String[]args) {
        Suma n1 = new Suma();
        Scanner reader = new Scanner(System.in);
        
        System.out.println("introduzca primer valor");
        n1.a = reader .nextInt();
        System.out.println("introduzca segundo valor");
        n1.b = reader .nextInt();
        System.out.println(n1.sumar());
    }
}