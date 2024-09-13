import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите стоимость работ: ");
        double workCost = scanner.nextDouble();
        System.out.print("Введите стоимость материалов: ");
        double materialsCost = scanner.nextDouble();
        System.out.print("Введите скидку в процентах: ");
        double discount = scanner.nextDouble();
        System.out.print("Введите бюджет заказчика: ");
        double customerBudget = scanner.nextDouble();
        double discountedCost = calculateProjectCost(workCost, materialsCost, discount);
        System.out.println("Итоговая стоимость проекта со скидкой: " + discountedCost);
        if (customerBudget >= discountedCost) {
            System.out.println("У заказчика хватит денег на проект!");
        } else {
            System.out.println("У заказчика не хватит денег на проект!");
        }

    }

    public static double calculateProjectCost(double workCost, double materialsCost, double discount) {
        double totalCost = workCost + materialsCost;
        double discountedCost = totalCost * (1.0 - discount / 100.0);
        return discountedCost;
    }
}