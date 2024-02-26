import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цену: ");
        double price = scanner.nextDouble();

        System.out.print("Введите кол-во товаров: ");
        int count = scanner.nextInt();

        Main main = new Main();
        double itog = main.priceCalculation(price, count);
        System.out.println("Цена товара: " + itog);
    }

    public double priceCalculation(double price, int count) {
        return price * count;
    }
}
