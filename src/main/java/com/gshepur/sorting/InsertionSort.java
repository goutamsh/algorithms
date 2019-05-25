package com.gshepur.sorting;

public class InsertionSort {
    public void sort(int[] array){
        if(array != null){
            int val;
            for(int i = 1 ; i < array.length ; i++){
                val = array[i];
                int j;
                for(j = i - 1 ; j >= 0 ; j-- ){
                    if(val < array[j]){
                        array[j+1] = array[j];
                    }else {
                        break;
                    }
                }
                if(j < 0){
                    array[0] = val;
                }else {
                    array[j+1] = val;
                }
            }

        }
    }
}
