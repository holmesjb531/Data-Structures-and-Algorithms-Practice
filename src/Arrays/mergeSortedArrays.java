package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;


//first we want to make sure that if the arrays are unsorted, we automatically sort them
//after the arrays are sorted, we want to merge array2 onto array1
//we create a new array to store the merge of array1 and array2
//then we return the new merged array

public class mergeSortedArrays {
    public static void main(String[] args){

        int[] array1 = {0,3,4,31};
        int[] array2 = {4, 6, 30};

        System.out.println(Arrays.toString(mergedArrays(array1, array2)));

    }

    //Using the Arrays.sort method to sort the arrays
    public static int[] mergedArrays(int[] array1, int[] array2){
        Arrays.sort(array1);
        Arrays.sort(array2);

        int[] newMergedArray = new int[(array1.length + array2.length)];

        int j = 0;
        int k = 0;
        for(int i = 0; i < newMergedArray.length; i++){
            if((k == array2.length || array1[j] < array2[k]) && j != array1.length){
                newMergedArray[i] = array1[j];
                j++;
            } else{
                newMergedArray[i] = array2[k];
                k++;
            }
        }

        return newMergedArray;

    }
}
