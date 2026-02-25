package DSA.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {-551,-3,-6,-99,-876};
        int max = Integer.MIN_VALUE;
        if (arr.length == 0){
            max = arr[arr.length];
        }else{
            for ( int i = 0 ; i < arr.length ; i++ ) {
                if( arr[i] > max ){
                    max = arr[i];
                }
            }
        }

        System.out.println(max);
    }
}
