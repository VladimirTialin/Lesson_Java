import java.util.Scanner;
public class inputstring {
    public static void main(String[] args)
    {
       Scanner iScanner = new Scanner(System.in);
       System.out.printf("name: ");
       String name = iScanner.nextLine();
       System.out.printf("Привет, %s!", name);
       iScanner.close();
       {
        Scanner iScanner1 = new Scanner(System.in);
        System.out.printf("int a: ");
        int x = iScanner1.nextInt();
        System.out.printf("double a: ");
        double y = iScanner1.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        iScanner1.close();
        }
//Проверка на соответствие получаемого типа
        {
       Scanner iScanner2 = new Scanner(System.in);
       System.out.printf("int a: ");
       boolean flag = iScanner2.hasNextInt();
       System.out.println(flag);       
       int i = iScanner2.nextInt();
       System.out.println(i);       
       iScanner2.close();
   }

//Форматированный вывод
        int a = 1, b = 2;
        int c = a + b;
        String res = a + " + " + b + " = " + c;
        System.out.println(res);
//Форматированный вывод вариант 2
        {
        int a1 = 1, b1 = 2;
        int c1 = a1 + b1;
        String res1 = String.format("%d + %d = %d \n", a1, b1, c1);
        System.out.printf("%d + %d = %d \n", a1, b1, c1);
        System.out.println(res1);
    }
/* Виды спецификаторов

%d: целочисленных значений

%x: для вывода шестнадцатеричных чисел

%f: для вывода чисел с плавающей точкой

%e: для вывода чисел в экспоненциальной форме, 
например, 3.1415e+01

%c: для вывода одиночного символа

%s: для вывода строковых значений
*/
{
       
        float pi = 3.1415f;
        System.out.printf("%f\n", pi);    // 3,141500
        System.out.printf("%.2f\n", pi);  // 3,14
        System.out.printf("%.3f\n", pi);  // 3,141
        System.out.printf("%e\n", pi);    // 3,141500e+00
        System.out.printf("%.2e\n", pi);  // 3,14e+00
        System.out.printf("%.3e\n", pi);  // 3,141e+00
    }

   }
}

