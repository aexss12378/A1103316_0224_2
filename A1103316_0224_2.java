import java.util.Scanner;

public class A1103316_0224_2 {

    public static void main(String[] args) {
        double celsius, fahrenheit;
        System.out.println("請輸入攝氏溫度的值:");
        Scanner num =new Scanner(System.in);
        celsius = num.nextDouble();
        fahrenheit=celsius*1.8+32;
        System.out.printf("華氏溫度為:%f",fahrenheit);
    }
}    
