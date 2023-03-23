import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! 
// (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

public class z1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.printf("enter n: ");
        int n = Scanner.nextInt();
        int sum = 0;
        int mult = 1;
    
        for (int i = 0; i <=n; i ++){
                sum += i;
        }
        for (int j = 1; j<=n; j++){
                mult*= j;
        }

        System.out.printf("summa = "+ sum + "; mult = "+ mult);
    }
}