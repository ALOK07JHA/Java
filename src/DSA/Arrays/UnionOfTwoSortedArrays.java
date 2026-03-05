package DSA.Arrays;

import java.util.Arrays;

public class UnionOfTwoSortedArrays {

    public static void main(String[] args) {

        int arr1[] = {1,2,4,5,6};
        int arr2[] = {1,2,3,4,5,6,7};

        int[] result = union(arr1, arr2);   // store returned array

        System.out.println(Arrays.toString(result)); // print result
    }

    public static int[] union(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int[] result = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {

            int val;

            if (arr1[i] < arr2[j]) {
                val = arr1[i++];
            }
            else if (arr1[i] > arr2[j]) {
                val = arr2[j++];
            }
            else {
                val = arr1[i];
                i++;
                j++;
            }

            if (k == 0 || result[k - 1] != val) {
                result[k++] = val;
            }
        }

        while (i < n) {
            if (k == 0 || result[k - 1] != arr1[i]) {
                result[k++] = arr1[i];
            }
            i++;
        }

        while (j < m) {
            if (k == 0 || result[k - 1] != arr2[j]) {
                result[k++] = arr2[j];
            }
            j++;
        }

        return Arrays.copyOf(result, k);
    }
}