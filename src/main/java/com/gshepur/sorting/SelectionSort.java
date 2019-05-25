package com.gshepur.sorting;

public class SelectionSort {


    public void sort(int[] array){
        if(array != null){
            int max;
            for(int i = array.length-1 ; i > 0 ; i--){
                max = 0;
                for(int j = 1 ; j <= i ; j++){
                    if(array[j] > array[max]){
                        max = j;
                    }
                }
                if(max != i){
                    swap(array, i, max);
                }
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
