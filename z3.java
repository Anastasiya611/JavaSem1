// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->
import java.util.Scanner;
public class z3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a: ");
        double a = scanner.nextDouble(); 
        System.out.print("enter z: ");
        String z = scanner.next(); 
        System.out.print("enter b: ");
        double b = scanner.nextDouble(); 
        switch (z){
            case "-":
            System.out.println(a-b);
            break;
            case "+":
            System.out.println(a+b);
            break;
            case "*":
            System.out.println(a*b);
            break;
            case "/":
            System.out.println(a/b);
            break;
            }
    }
}
