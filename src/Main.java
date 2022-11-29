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
    }
}