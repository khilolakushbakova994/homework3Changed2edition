public class Main {
    public static void main(String[] args) {

        System.out.println("Task Number 1\n");
        // Объявите переменные типа int, byte, short, long, float, double. Название переменных может быть любым,
        // но если состоит из двух слов и более, должно придерживаться правила camelCase.
        //Выведите в консоль значение каждой переменной в формате “Значение переменной … с типом … равно …”

        int a =200;
        System.out.println ("Значение переменной  a " + "с типом  int равно  " + a);
        byte b = 15;
        System.out.println ("Значение переменной  b " + "с типом  byte равно  " + b);
        short c = -2500;
        System.out.println ("Значение переменной  c " + "с типом  short равно  " + c);
        long d = 55000L;
        System.out.println ("Значение переменной  d " + "с типом  long равно  " + d);
        double e = 2.555333999111888;
        System.out.println ("Значение переменной  e " + "с типом  double равно  " + e);
        float f = 15.1112223f;
        System.out.println ("Значение переменной  f " + "с типом  float равно  " + f);
        System.out.println("\n");

        System.out.println(" Task Number 2\n");
        //Ниже дан список различных значений. Инициализируйте переменные, используя изученные ранее типы переменных.
        //Значения: 27.12 ,  987 678 965 549 , 2, 786 , false, 569 , -159 , 27897 , 67.
        //Объявите переменные всех типов, присвойте им любые значения (инициализируйте их).

        byte g = 2;
        System.out.println("Значение переменной  g " + "с типом  byte равно  " + g);
        short h = -159;
        System.out.println("Значение переменной  h " + "с типом  short равно  " + h);
        int i = 786;
        System.out.println("Значение переменной  i " + "с типом  int равно  " + i);
        long j = 987678965549L;
        System.out.println("Значение переменной  j " + "с типом  long равно  " + j);
        float k = 27.12f;
        System.out.println("Значение переменной  k " + "с типом  float равно  " + k);
        double l = 67;
        System.out.println("Значение переменной  l " + "с типом  double равно  " + l);
        boolean m = false;
        System.out.println("Значение переменной  m " + "с типом  boolean равно  " + m);
        short n = 569;
        System.out.println("Значение переменной  n " + "с типом  short равно  " + n);
        int o = 27897;
        System.out.println("Значение переменной  o " + "с типом  int равно  " + o);
        System.out.println("\n");


        System.out.println("Task Number 3\n");
        //Трое школьных учителей, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        //У Людмилы Павловны 23 ученика , у Анны Сергеевны 27 учеников и у Екатерины Андреевны – 30 учеников.
        //Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте,
        // сколько достанется листов каждому ученику.
        //Результат задачи выведите в консоль в формате “На каждого ученика рассчитано … листов бумаги”.
        //Для объявления переменных не используйте тип var.


        byte numberOfSudentsofLP = 23;
        System.out.println(numberOfSudentsofLP);
        short numberOfStudentsOfAS = 27;
        System.out.println(numberOfStudentsOfAS);
        int numberOfStudentsYA = 30;
        System.out.println(numberOfStudentsYA);
        int studentsAmount = numberOfSudentsofLP + numberOfStudentsOfAS + numberOfStudentsYA;
        System.out.println("Всего   " + studentsAmount + "  участников");
        int bought = 480;
        System.out.println("Всего купили  " + bought + "   листов на всех");
        double sheetsPerstudent = bought / studentsAmount;
        System.out.println("На каждого ученика расчитано  " + sheetsPerstudent + "  листов бумаги");
        System.out.println("\n");

        System.out.println("Task number 4\n");
        //Производительность машины для изготовления бутылок - 16 бутылок за 2 минуты.
        // Какая производительность машины будет:
        //- за 20 минут
        //- в сутки
        //- за 3 дня
        //- за 1 месяц
        //Рассчитывайте продолжительность работы машины в том случае, если она работает без перерыва заданный
        // промежуток времени.
        //Результаты подсчетов выведите в консоль в формате “За … машины произвела бутылок … штук “
        //Для объявления переменных не используйте тип var.


        int efficiencyPerTwoMinutes = 16;
        System.out.println(efficiencyPerTwoMinutes + "   бутылок за 2 минуты");
        int efficiencyPerMinute = efficiencyPerTwoMinutes/ 2;
        System.out.println(efficiencyPerMinute + "  бутылок за минуту");
        int efficiencyPerTwentyMinutes = efficiencyPerMinute * 20;
        System.out.println(efficiencyPerTwentyMinutes + "  бутылок за 20 минут");
        int minutesPerday = 60 * 24;
        System.out.println(minutesPerday + "   минут в сутки");
        int efficiencyPerDay = efficiencyPerMinute * minutesPerday;
        System.out.println(efficiencyPerDay + "  бутылок за сутки");
        int efficencyPerThreeDays = efficiencyPerDay * 3 * efficiencyPerMinute;
        System.out.println(efficencyPerThreeDays + "   бутылок за 3 дня");
        int efficiencyPerMonth = minutesPerday * 30 * efficiencyPerMinute;
        System.out.println(efficiencyPerMonth + "   бутылок  за 1 месяц");
        System.out.println("\n");


        System.out.println("Task Number 5\n");
        //На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        // На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
        //Выведите результат задачи в консоль в формате “В школе, где … классов, нужно … банок белой краски и …
        // банок коричневой краски”.

        double total = 120;
        System.out.println("Всего   " +  total + "   банок");
        double oneClass = 2 + 4;
        System.out.println("На один класс  " + oneClass + "   банок");
        double classTotal = total / oneClass;
        System.out.println("Всего   " + classTotal + "   классов");
        double white = 2 * classTotal;
        double brown = 4 * classTotal;
        System.out.println("В школе, где   " + classTotal + "  классов, нужно   " + white + "  банок белой краски и  "+ brown + "   банок коричневой краски");
        System.out.println("\n");


        System.out.println("Task Number 6\n");
        //Повар, когда готовит еду, взвешивает все продукты, чтобы добиться нужной консистенции.
        //То же делают и спортсмены, которые сидят на правильном питании и тщательно относятся к тому,
        // что и сколько они едят. Вот один из рецептов, который использует наш спортсмен перед тренировкой:
        //– Бананы – 5 штук (1 банан - 80 грамм);
        //– Молоко – 200 мл (100 мл = 105 грамм);
        //– Мороженое пломбир – 2 брикета по 100 грамм;
        //– Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
        //Смешать всё в блендере и готово.
        //Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
        // Результат напечатайте в консоль.


        int bananaNumber = 5;
        int bananaWeight = 80;
        int bananasWeight = bananaNumber * bananaWeight;
        System.out.println("Общий вес бананов   " + bananasWeight + "  гр");

        int gram = 105;
        int milkWeight = gram * 2;
        System.out.println("Общий вес молока   " + milkWeight + "   гр");

        int iceCream = 2;
        int oneWeight = 100;
        int iceCreamweight = iceCream * oneWeight;
        System.out.println( "Общий вес мороженного  " + iceCreamweight + "  гр");

        int eggs = 4;
        int oneEgg = 70;
        int eggWeight = oneEgg * eggs;
        System.out.println( "Общий вес яиц   " + eggWeight + "  гр");

        int totalWeight = bananasWeight + milkWeight + iceCreamweight + eggWeight;
        System.out.println("Общий вес продуктов  " + totalWeight + "  грамм");

        float oneKilo = 1000f;
        float inkilo = totalWeight / oneKilo;
        System.out.println("Общий вес продуктов  " + inkilo + "  кг");
        System.out.println("\n");


        System.out.println("Task Number 7\n");
        //Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг,
        // чтобы оставаться в своей весовой категории.
        //Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        //Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и
        // сколько, если каждый день будет худеть на 500 грамм.
        //Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        //Результаты всех подсчетов выведите в консоль.

        int needLoose = 7;
        int kilo = needLoose *1000;
        System.out.println("Нужно сбросить 7 кг, что в граммах равен   " + kilo);
        int firstOption = 250;
        int firstVersiom = kilo / firstOption;
        System.out.println("Если терять по 250 гр в день, то похудеет за  " + firstVersiom + "  дней");
        int secondOption = 500;
        int secondVersiom = kilo / secondOption;
        System.out.println("Если терять по 500 гр в день, то похудеет за  " + secondVersiom + "  дней");
        System.out.println("\n");

        System.out.println(" Task Number 8\n");
        //Отойдем от спорта и представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен
        // сотрудников. В компании есть правило, что чем дольше сотрудник работает в компании, тем ценнее он
        // для бизнеса. Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты
        // раз в год. Каждый год повышение составляет 10% от текущей зарплаты.
        //К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет
        // для следующих сотрудников:
        //Маша получает 67 760 рублей в месяц
        //Денис получает 83 690 рублей в месяц
        //Кристина получает 76 230 рублей в месяц
        //Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил
        // посчитать разницу между годовым доходом с нынешней зарплатой и после повышения. Посчитайте, сколько
        // будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
        //Выведите в консоль информацию по каждому сотруднику.
        //Например, “Маша теперь получает **** рублей. Годовой доход вырос на **** рублей”.

        int mashaCurrentSalary = 67760;
        System.out.println(mashaCurrentSalary);
        int denisCurrentSalary = 83690;
        System.out.println(denisCurrentSalary);
        int kristinaCurrentSalary = 76230;
        System.out.println(kristinaCurrentSalary);

        float mashaSalryIncrease = mashaCurrentSalary * 1.1f * 12f;
        System.out.println("У Маши годовая зарплата стала  " + mashaSalryIncrease + "  рублей");
        float denisSalryIncrease = denisCurrentSalary * 1.1f * 12f;
        System.out.println("У Дениса годовая зарплата стала  " + denisSalryIncrease + "  рублей");
        float kristinaSalryIncrease = kristinaCurrentSalary * 1.1f * 12f;
        System.out.println("У Кристины годовая зарплата стала  " + kristinaSalryIncrease + "  рублей");

        int mashaSalaryPerYear = mashaCurrentSalary * 12;
        int denisSalaryPerYear = denisCurrentSalary * 12;
        int kristinaSalaryPerYear = kristinaCurrentSalary * 12;

        float mashaSalarydifference = mashaSalryIncrease - mashaSalaryPerYear;
        System.out.println("Годовой доход вырос у Маши на   " + mashaSalarydifference + "   рублей");
        float denisSalaryDifference = denisSalryIncrease - denisSalaryPerYear;
        System.out.println("Годовой доход вырос у Дениса на   " + denisSalaryDifference + "   рублей");
        float kristinaSalaryDifference = kristinaSalryIncrease - kristinaSalaryPerYear;
        System.out.println("Годовой доход вырос у Дениса на   " + kristinaSalaryDifference + "   рублей");


    }
}
