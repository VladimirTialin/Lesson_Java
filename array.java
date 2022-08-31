public class array
{
   public static void main(String[] args)
   {
        int[] arr = new int[10];
        System.out.println(arr.length); // 10
        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); // 5
        {
            int[] arr1[] = new int[3][5];
            for (int[] line : arr1)
            {
                for (int item : line)
                {
                    System.out.printf("%d ", item);
                }
                System.out.println();
            } 
        }
        {
            int[][] arr2 = new int[3][5];
            for (int i = 0; i < arr2.length; i++)
            {
                for (int j = 0; j < arr2[i].length; j++)
                {
                    System.out.printf("%d ", arr2[i][j]);
                }
                System.out.println();
            }
        }
    } 
}