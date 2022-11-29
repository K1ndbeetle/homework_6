public class Main {
    public static void main(String[] args) {
        //homework1
        //task №1
        System.out.println("Задача №1");
        int partOfMoney = 15_000;
        int totalSavingsAmount = 0;
        int i = 0;
        while (totalSavingsAmount < 2_459_000) {
            totalSavingsAmount += totalSavingsAmount/100;
            totalSavingsAmount += partOfMoney;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSavingsAmount + " рублей");
        }
        System.out.println();

        //task №2
        System.out.println("Задача №2");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(" " + a);
        }
        System.out.println();
        for (int b = 10; b > 0; b--) {
            System.out.print(" " + b);
        }
        System.out.println();
        System.out.println();

        //task №3
        System.out.println("Задача №3");
        int populationCountryY = 12_000_000;
        int birthRatePer1000 = 17;
        int deathPer1000 = 8;
        int growthPopulation = birthRatePer1000 - deathPer1000;
        for (int populationYear = 1; populationYear <= 10; populationYear++) {
            populationCountryY += populationCountryY * growthPopulation / 1000;
            System.out.println("Год " + populationYear + ", численность населения составляет " + populationCountryY + " человек");
        }
        System.out.println();

        //homework2
        //task №1
        System.out.println("Задача №1");
        int deposit = 15_000;
        double monthlyPercentage = 0.07;
        int total = 12_000_000;
        int month = 1;
        for (; deposit < total; month++) {
            deposit += deposit*monthlyPercentage;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println();

        //task №2
        System.out.println("Задача №2");
        int contribution = 15_000;
        double monthPercent = 0.07;
        int full = 12_000_000;
        int m = 1;
        for (; contribution < full; m++) {
            contribution += contribution * monthPercent;
            if (m % 6 == 0) {
                System.out.println("Месяц " + m + ", сумма накоплений равна " + contribution + " рублей");
            }
        }
        System.out.println();

        //task №3
        System.out.println("Задача №3");
        int initialAmount = 15_000;
        double percent = 0.07;
        int month1 = 1;
        for (; month1 <= 9*12; month1++) {
            initialAmount += initialAmount * percent;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + ", сумма накоплений равна " + initialAmount + " рублей");
            }
        }
        System.out.println();

        //task №4
        System.out.println("Задача №4");
        int friday = 5;
        int daysMonth = 31;
        for (; friday < daysMonth; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println();
    }
}