import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Введите целое число, больше 3: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a > 3) {
            int[] someArr = new int[a];
            int even = 0;
            for (int i = 0; i < someArr.length; i++) {
                someArr[i] = (int) (Math.random() * a);

                System.out.println(Arrays.toString(someArr));

               if (someArr[i]%2 == 0) {
                   even ++;
              }
                int[] someArr2 = new int[even];


               int b = 0;
                for (int i1 = 0; i1 < a; i1++) {
                    if (someArr[i] % 2 == 0) {

                        someArr2[b] = someArr[i];
                        b++;


                        System.out.println(Arrays.toString(someArr2));
                    }
                }}
                } else {
            System.out.println("Вы ввели неверное число! Попробуйте ещё раз!");
        }
    }
}

       /*
            System.out.println(i);

        }
        int[] oneArr;

        oneArr = new int[i];
        System.out.println(Arrays.toString(oneArr));*/





