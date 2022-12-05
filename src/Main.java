public class Main {
    public static void main(String[] args) {
        System.out.println("Доиащшнее задание № 3");
        System.out.println("Задача 1:");
        for (int i = 1; i < 11 && i > 0; i++)
            System.out.println("Итерация цикла " + i);

        System.out.println("Задача 2:");
        for (int i = 10; i < 11 && i > 0; i--)
            System.out.println("Итерация цикла " + i);

        System.out.println("Задача 3:");
        for (int i = 0; i >= 0 && i < 18; i = i + 2)
            System.out.println("Итерация цикла " + i);

        System.out.println("Задача 4:");
        for (int i = 10; i < 11 && i > -11; i--)
            System.out.println("Итерация цикла " + i);

        System.out.println("Задача 5:");
        for (int i = 1904; i > 1903 && i < 2097; i = i + 4)
            System.out.println(i + " год является високосным ");

        System.out.println("Задача 6:");
        for (int i = 7; i > 6 && i < 99; i = i + 7)
            System.out.println(i);

        System.out.println("Задача 7:");
        for (int i = 1; i > 0 && i < 513; i = i * 2)
            System.out.println(i);

        System.out.println("Задача 8:");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 13 && i >= 0; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна:  " + total + " рублей");
        }
        System.out.println("Сумма годовых накоплений: " + total);

        System.out.println("Задача 9:");
        int salary1 = 29000;
        int total1 = 0;
        for (int i = 1; i < 13 && i >= 0; i++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + i + " сумма накоплений равна: " + total1 + " рублей");
        }
        System.out.println("Сумма годовых накоплений: " + total1);

        System.out.println("Задача 10:");
        int a = 1;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 3; i <= 11; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
        System.out.println();

        System.out.println("Цикл While ");
        System.out.println("Задание 1: ");



    }
