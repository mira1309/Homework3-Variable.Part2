public class Main {
    public static void main(String[] args) {
        int apple = 1;
        byte book = 7;
        short cat = 15;
        long dog = 18;
        float flour = 1.5F;
        double orange = 3.5;
        System.out.println("Значение переменной apple с типом int равно " + apple);
        System.out.println("Значение переменной book с типом byte равно " + book);
        System.out.println("Значение переменной cat с типом short равно " + cat);
        System.out.println("Значение переменной dog с типлм long равно " + dog);
        System.out.println("Значение переменной flour с типом flout равно " + flour);
        System.out.println("Значение переменной orange с типом double равно " + orange);

        float a = 27.12F;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        int e = -159;
        short f = 27897;
        byte g = 67;

        byte LP = 23;
        byte AC = 27;
        byte EA = 30;
        short paper = 480;
        int totalStudents = LP + AC + EA;
        System.out.println(totalStudents);
        int forOne = paper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + forOne + " листов бумаги");

        byte capacityIn2Minutes = 16;
        int capacityIn20Minutes = capacityIn2Minutes * 10;
        System.out.println("За 20 минут машина произвела " + capacityIn20Minutes + " штук бутылок");
        int capacityPerDay = capacityIn2Minutes * 720;
        System.out.println("За сутки машина произвела " + capacityPerDay + " штук бутылок");
        int capacityIn3Days = capacityPerDay * 3;
        System.out.println("За 3 дня машина произвела " + capacityIn3Days + " штук бутылок");
        int capacityIn1Month = capacityIn3Days * 10;
        System.out.println("За месяц машина произвела " + capacityIn1Month + " штук бутылок");

        byte totalTins = 120;
        byte tinsOfWhitePaint = 2;
        byte tinsOfBrownPaint = 4;
        int totalTinsForOneClass = tinsOfWhitePaint + tinsOfBrownPaint;
        System.out.println("Всего банок на один класс " + totalTinsForOneClass);
        int totalClassroom = totalTins / totalTinsForOneClass;
        System.out.println("Всего классов в школе " + totalClassroom);
        int totalTinsOfWhite = tinsOfWhitePaint * totalClassroom;
        int totalTinsOfBrown = tinsOfBrownPaint * totalClassroom;
        System.out.println("В школе, где " + totalClassroom + " классов, нужно " + totalTinsOfWhite + " банок белой краски и " + totalTinsOfBrown + " банок коричневой краски");

        byte weightOfBanana = 80;
        byte weightOfMilk = 105;
        byte weightOfIceCream = 100;
        byte weightOfEgg = 70;
        int weightOfBreakfast = weightOfBanana * 5 + weightOfMilk * 2 + weightOfIceCream * 2 + weightOfEgg * 4;
        System.out.println("Вес завтрака " + weightOfBreakfast + " граммов");
        float weightOfBreakfastInKilo = (float) weightOfBreakfast / 1000;
        System.out.println("Вес завтрака " + weightOfBreakfastInKilo + " килограмм");

        byte totalWeight = 7;
        float lostWeight1 = 0.25F;
        float lostWeight2 = 0.5F;
        float totalDays1 = totalWeight / lostWeight1;
        System.out.println(totalDays1 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        float totalDays2 = totalWeight / lostWeight2;
        System.out.println(totalDays2 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        float daysOnAverage = (totalDays1 + totalDays2) / 2;
        System.out.println(daysOnAverage + " дней в среднем уйдет на похудение");

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        double mashaIncreasePay = masha * 0.1 + masha;
        double mashaPresentPayForYear = masha *12;
        double mashaFuturePayFotYear = mashaIncreasePay * 12;
        double mashaDifference = mashaFuturePayFotYear - mashaPresentPayForYear;
        System.out.println("Маша теперь получает " + mashaIncreasePay + " рублей. Годовой доход вырос на " + mashaDifference + " рублей");
        double denisIncreasePay = denis * 0.1 + denis;
        double denisDifference = denis * 0.1 * 12;
        System.out.println("Денис теперь получает " + denisIncreasePay + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
        double kristinaIncreasePay = kristina * 0.1 + kristina;
        double kristinaDifference =  kristina * 0.1 * 12;
        System.out.println("Кристина теперь получает " + kristinaIncreasePay + " рублей. Годовой доход вырос на " + kristinaDifference + " рублей");
    }
}