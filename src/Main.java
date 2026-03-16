import java.util.Scanner;
class main{
   // Write a program to calculate and print the original selling price if the discounted selling
   // price and discount percentage is entered by the user
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter discounted price:");
        double dp = sc.nextDouble();
        System.out.println("enter discount percentage:");
        double dpp = sc.nextDouble();
        double op = dp * 100 / dpp;
        System.out.print("original price:");
        System.out.println(op);
        // discount price = original * percent / 100

    }
}