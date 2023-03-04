import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        n = sc.nextInt();
        if (n % 2 == 0) 
            System.out.println(n + " là số chẵn");
        else 
            System.out.println(n + " là số lẻ");
    }  
}
