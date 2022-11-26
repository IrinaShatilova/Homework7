public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
        while (totalSavings < 2_459_000) {
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
    public static void task2() {
        //Задание 2.1
        System.out.println(" ");
        System.out.println("Задание 2.1");
        System.out.println(" ");
        int monthlySavings = 15000;
        int monthNumber = 0;
        while (monthlySavings < 12_000_000) {
            monthNumber++;
            monthlySavings = monthlySavings * 7 / 100 + monthlySavings;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + monthlySavings + " рублей");
        }

        //Задание 2.2
        System.out.println(" ");
        System.out.println("Задание 2.2");
        System.out.println(" ");
        int monthlySavings1 = 15000;
        int monthNumber1 = 0;
        while (monthlySavings1 < 12_000_000) {
            monthNumber1++;
            monthlySavings1 = monthlySavings1 * 7 / 100 + monthlySavings1;
            if (monthNumber1 % 6 == 0) {
                System.out.println("Месяц " + monthNumber1 + ", сумма накоплений равна " + monthlySavings1 + " рублей");
            }
        }
        //Задание 2.3
        System.out.println(" ");
        System.out.println("Задание 2.3");
        System.out.println(" ");
        int monthlySavings2 = 15000;
        int monthNumber2 = 0;
        while (monthNumber2 <= 9*12) {
            monthNumber2++;
            monthlySavings2 = monthlySavings2 * 7 / 100 + monthlySavings2;
            if (monthNumber2 % 6 == 0) {
            System.out.println("Месяц " + monthNumber2 + ", сумма накоплений равна " + monthlySavings2 + " рублей");
            }
        }
        //Задание 2.4
        System.out.println(" ");
        System.out.println("Задание 2.4");
        System.out.println(" ");
        int friday = 3;
        for (; friday <= 31; friday+=7) {
        System.out.println("Сегодня пятница - " + friday + "-е число. Необходимо сдать отчет");
        }
    }
    public static void task3() {
        //Задание 3.1
        System.out.println(" ");
        System.out.println("Задание 3.1");
        System.out.println(" ");
        int i = 0;
        while (i < 2022+100) {
            i += 79;
            if (i >= 2022-200 && i <= 2022+100) {
                System.out.println(i);
            }
        }
        //Задание 3.2
        System.out.println(" ");
        System.out.println("Задание 3.2");
        System.out.println(" ");
        int a = 0;
        while (a < 10) {
            a++;
            int b = 2 * a;
            System.out.println("2 * " + a + " = " + b);
        }
    }
}