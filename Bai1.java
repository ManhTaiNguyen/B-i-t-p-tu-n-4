import java.util.Scanner;

public class Bai1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        float a = sc.nextFloat();
        System.out.println("Nhập số thứ hai: ");
        float b = sc.nextFloat(); 
        
        float Tong = a + b;      System.out.println("Tổng của 2 số là: " + Tong); 
        float Hieu = a - b;      System.out.println("Hiệu của 2 số là: " + Hieu);
        float Tich = a * b;      System.out.println("Tích của 2 số là: " + Tich);
        float Thuong = a / b;    System.out.println("Thương của 2 số là: " + Thuong);
        float SoDu = a % b;      System.out.println("Số dư của 2 số là: " + SoDu);
         
        if (a > b){
            System.out.println("Kết quả so sánh giữa 2 số là: " + a + " > " + b);
        } else if (a < b) {
            System.out.println("Kết quả so sánh giữa 2 số là: " + a + " < " + b);
        } else {
            System.out.println("Kết quả so sánh giữa 2 số là: " + a + " = " + b);
        }
    }
}
