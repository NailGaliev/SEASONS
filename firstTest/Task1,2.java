import java.util.Scanner;
/**
  * Итого 5 баллов.
  */
class Task1_2 {

    /**
     * Массив не соответствует заданию, n это предел значения, а не количество элементов. Зачтено.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arr=");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);

            array[i] = i * 7 + 1;

            System.out.print(array[i] + " ");
        }
        getSecondLargest(array);

    }

    /**
     * Задача получить в параметре массив, и выдать его второе по величине значение.
     * У вас он генерирует новый. По крайней мере работает. Зачтено.
     */
    public static int getSecondLargest(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arr=");
        int c = sc.nextInt();
        int[] array2 = new int[c];
        int highest = 0;
        int secondH = 0;
        array2 = new int[]{3, 2, 5, 4, 1, 0};
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10);  // это тут зачем?
            System.out.println(array2[i] + " ");
            if (array2[i] > highest) {
                secondH = highest;
                highest = array2[i];

            } else if (array2[i] > secondH) {
                secondH = array2[i];
            }
        }
        System.out.println("max 2 = " + secondH);
        return 0;
    }


}

