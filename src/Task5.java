import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int [][] firstTwoDimensionalArr = new int [5][8];
        int max,min;
        for (int i=0;i < firstTwoDimensionalArr.length;i++){
            for (int j=0;j < firstTwoDimensionalArr[i].length;j++){
                firstTwoDimensionalArr[i][j]=(int)((Math.random()*199) - 99);
            }
        }
        for (int i=0;i <firstTwoDimensionalArr.length;i++,System.out.println()){
            for (int j=0;j < firstTwoDimensionalArr[i].length;j++){
                System.out.print(firstTwoDimensionalArr[i][j]+" ");
            }}
    }}


     /*   System.out.println(Arrays.deepToString(firstTwoDimensionalArr));

    }
}*/
