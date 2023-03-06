import java.util.Scanner;

public class Bai2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bất kì: ");
        int n = sc.nextInt();
        if (n % 2 == 0) 
            System.out.println("Số " + n + " là số chẵn");
        else 
            System.out.println("Số " + n + " là số lẻ");
    }  
}
