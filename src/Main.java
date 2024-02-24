import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        double itog = main.priceCalculation();
        System.out.println("Цена товара" + itog );
    }
    public double priceCalculation(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цену: ");
        double price = scanner.nextDouble();
        System.out.print("Введите кол-во товаров : ");
        double count = scanner.nextInt();
        double itog = price * count;
        return  itog;
    }
}