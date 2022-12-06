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
        int salary3 = 15000;
        int total3 = 0;
        int i = 0;
        while (total3 < 2_459_000) {
            total3 = total3 + salary3;
            System.out.println("Месяц " + i++ + " сумма накоплений равна: " + total3 + " рублей");
        }
        System.out.println("Задание 2: ");
        int start = 1;
        while (start < 11 && start > 0) {
            System.out.print(" " + start + " ");
            start = start + 1;
        }
        System.out.println();
        for (int s = 10; s < 11 && s > 0; s--) {
            System.out.print(" " + s + " ");
        }

        {
            System.out.println();
            System.out.println("Задание 3:");
            int populationPeople = 12_000_000;
            int bornPeople = 17;
            int deathPeople = 8;
            int bd = bornPeople - deathPeople;
            for (int k = 1; k <= 10; k++) {
                populationPeople += populationPeople * bd / 1000;

                System.out.println("Год " + k + " численность населения составляет " + populationPeople);
            }

            System.out.println("Задание 4:");
            int salary5 = 15000;
            int total5 = 0;
            int month = 1;
            while (total5 < 12_000_000) {
                total5 = total5 + salary5;
                salary5 += salary5 * 0.07;
                System.out.println(month++ + " месяц , сумма накоплений равна: " + total5 + " рублей");
            }

            System.out.println("Задание 5:");
            int salary6 = 15000;
            int total6 = 0;
            int r = 1;
            for (; total6 < 12_000_000; r++) {
                total6 = total6 + salary6;
                salary6 = salary6 + salary6 / 100 * 7;
                if (r % 6 == 0 && r > 0) {
                    System.out.println(r + " месяц , сумма накоплений равна: " + total6 + " рублей");
                }
            }
            System.out.println("Задание 6:");
            double total8 = 15000;
            int month8 = 0;
            int day = 1;
            while (day <= 108) {
                total8 = total8 + (total8 / 100 * 7);
                month8 = month8 + 1;
                if (month8 % 6 == 0)
                    System.out.println("Месяц " + day++ + " накопленная сумма " + total8);

            }

            System.out.println("Задание 7");
            int friday = 2;
            int daysMonth = 31;
            int daysNweek = 7;
            while (friday <= daysMonth) {
                System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет.");
                friday = friday + daysNweek;
            }

            System.out.println("Задание 8");
            int fliesBy=79;
            int nowYear=2022;
            int wasYear= nowYear-200;
            int willBeYear=nowYear+100;
            for(int g=0;g<=willBeYear;g=g+fliesBy){
                if(wasYear<=g && willBeYear>=g)
                    System.out.println(g);
            }

        }
    }
}
