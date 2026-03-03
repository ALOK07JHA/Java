package DSA.Arrays;

public class Moveszeroes {

    public static void main(String[] args) {
        int []arr = {0,1,3,0,12};

        Brute(arr);
        System.out.println();

        optimal(arr);
    }

    public static void Brute(int [] arr){
        int [] result = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] != 0){
                result[count++] = arr[i];
            }
        }
        while (count < arr.length){
            result[count++] = 0;
        }

        for (int num:result) {
            System.out.print(num +" ");
        }
    }

    public static void optimal(int []arr){
        int index = 0 ; //where nonzeroes will be placed
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0 ){
                arr[index++] = arr[i];
            }
        }

        while (index < arr.length){
            arr[index++] = 0;
        }

        for(int num : arr){
            System.out.print(num +" ");
        }
    }
}
