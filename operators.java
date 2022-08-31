public class operators {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);
        {
        int a1 = 1;
        int b1 = 2;
        int c1 = 0;
        if (a1 > b1) c1 = a1;
        if (b1 > a1) c1 = b1;

        System.out.println(c1);
        }
        {
        int a2 = 1;
        int b2 = 2;
        int min = a2 < b2 ? a2 : b2;
        System.out.println(min);
        }
    }
    //Цикл while
    public static void main1(String[] args) {
        int value = 321;
        int count = 0;

        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);
        //Цикл Do while
        {
        int value1 = 321;
        int count1 = 0;

        do {
            value1 /= 10;
            count1++;
        } while (value1!= 0);
        System.out.println(count1);
    }
//Цикл for
    {

        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        System.out.println(s);
    }
    //Вложенный цикл
    {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//Работает только для коллекций; перебор коллекции
    {

        int arr[] = new int[10];
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }
}
}
