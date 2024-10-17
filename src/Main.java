import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 10; // int - тип данных целое чсило, а - имя переменное, = - присвоить, 10 - занчение
        int c = 25;
        int d = 45;

        System.out.println(a);
        System.out.println(c);
        System.out.println(d);

        int sum = a + c;
        int sub = a - c;
        int mul = a * c;
        int div = a / c;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);

        double a1 = 10.2;
        double a2 = 15.3;

        double sum1 = a1 + a2;
        System.out.println(sum1);

        float a3 = 10.2f;
        float a4 = 15.3f;
        double sum2 = a3 + a4;
        System.out.println(sum2);

        double test = a2 + a3;

        boolean trueVar = true;
        boolean falseVar = false;

        char digit = '1';

        String digits = "123456";

        boolean sumBool = true && false; // логические и &&, логическое или ||;
        boolean antiTrueVar = !trueVar;

        String str1 = "hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;
        System.out.println(a1 + str3);

        int calculation = (1 + 2) * 3 * (4 + 8);
        System.out.println(calculation);

        int result = 1 + 2 / (3 * 4) + 6;
        System.out.println(result);

        // проверить, можно ли продать вино чедловеку. Если ему есть 18, тогда можно

        System.out.print("введите возраст: ");
        Scanner cs = new Scanner(System.in);
        int age = cs.nextInt();

        // если брльше 18, но меньше 25, продаем с докуменатми. больше или равно 25 но меньше 60, продаем без документов
        // больше 65, но меньше 100, продаем с лекарствами
        if (age >= 18 && age < 25) {
            System.out.println("предъяви документы и я тебе продам");
        } else if (age >= 25 && age < 65) {
            System.out.println("продаем");
        } else if (age >= 65 && age < 100) {
            System.out.println("продаем и не забываем лекарства");
        }else{
            System.out.println("продать нельзя");
        }
    }
}