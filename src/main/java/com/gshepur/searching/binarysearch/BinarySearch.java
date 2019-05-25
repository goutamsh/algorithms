package com.gshepur.searching.binarysearch;


public class BinarySearch {

    /**
     * Search key in an array
     * @param array input array to be searched and should be in sorted order
     * @param key element to be searched
     * @return index of the key if found in the array else -1
     */
    public int search(int[] array, int key){
        if(array != null){
            return binarySearch(array, 0, array.length - 1, key);
        }else {
            return -1;
        }

    }

    private int binarySearch(int[] array, int from, int to, int key) {
        if(from > to){
            return -1;
        }
        int mid = (from + to) / 2;
        if(key < array[mid]){
            //search key in left half of the array
            return binarySearch(array, from, mid - 1, key);
        }else if(key > array[mid]){
            //search key in right half of the array
            return binarySearch(array, mid + 1, to, key);
        }else {
            return mid;
        }
    }
}
