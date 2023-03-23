// Вывести все простые числа от 1 до 1000

public class z2 {
    public static void main(String[] args) {
        for (int n =2; n<1001; n++){
            boolean resl = false;
            for (int i = 2; i*i<=n; i++) {
                resl = (n%i==0);
                if (resl){
                    break;
                }
            }
            if (!resl){
                System.out.println(n+";");
            }  
        }
    }
}