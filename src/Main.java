public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        System.out.println("Homework 7");
        //Задание 1.1
        System.out.println(" ");
        System.out.println("Задание 1.1");
        System.out.println(" ");
        int monthlySavings = 15000;
        int totalSavings = 0;
        int monthNumber = 0;
        while (totalSavings < 1_000_000) {
            totalSavings = totalSavings + monthlySavings;
            monthNumber++;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + totalSavings + " рублей");
        }
        //Задание 1.2
        System.out.println(" ");
        System.out.println("Задание 1.2");
        System.out.println(" ");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        //Задание 1.3
        System.out.println("\n ");
        System.out.println("Задание 1.3");
        System.out.println(" ");
        int population = 12_000_000;
        int year = 0;
        while (year < 10) {
            year++;
            population = population + (population * 17 / 1000 - population * 8 / 1000);
            System.out.println("Год " + year + ", население страны составит " + population + " человек");
        }
    }
}