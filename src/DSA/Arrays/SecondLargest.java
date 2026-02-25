package DSA.Arrays;

import static java.util.EnumSet.range;

public class SecondLargest<arr> {
    public static void main(String[] args) {

    int [] arr = {-2,-4,-5,-6,-22};
        int ans  =  print2Largest(arr);
        System.out.println(ans);
    }

    static int print2Largest(int arr[]){
        if(arr.length<2){
            return -1;
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > first){
                second = first;
                first =arr[i];
            } else if (arr[i] >second && arr[i] != first) {
                second = arr[i];
            }

        }
        return (second == Integer.MIN_VALUE) ? -1 :second;
        /* above return statement can be written as
        *  if(second == INTEGER.MIN_VALUE){
        * return -1;
        * }else{
        * return second;
        * }
        * */
    }
}
