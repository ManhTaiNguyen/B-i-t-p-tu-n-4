import java.util.Scanner;

public class Bai1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt(); System.out.println("Nhập số thứ nhất: ");
        float b = sc.nextInt(); System.out.println("Nhập số thứ hai: ");
        
        int Tong = a + b; System.out.println(a + " + " + b + " = " + Tong); 
        int Hieu = a - b; System.out.println(a + " - " + b + " = " + Hieu);
        int Tich = a * b; System.out.println(a + " * " + b + " = " + Tich);
        float Thuong = (float) a / b; System.out.println(a + " / " + b + " = " + Thuong);
        int SoDu = a % b; System.out.println(a + " % " + b + " = " + SoDu);
         
        System.out.println("So sánh bằng 2 số " + a + " và " + b + " là: " + (a == b));
        System.out.println("So sánh khác 2 số " + a + " và " + b + " là: " + (a != b));
        System.out.println("So sánh lớn hơn 2 số " + a + " và " + b + " là: " + (a > b));
        System.out.println("So sánh lớn hơn hoặc bằng 2 số " + a + " và " + b + " là: " + (a >= b));
        System.out.println("So sánh nhỏ hơn 2 số " + a + " và " + b + " là: " + (a < b));
        System.out.println("So sánh nhỏ hơn hoặc bằng 2 số " + a + " và " + b + " là: " + (a <= b));
    }
}
