package com.gshepur.sorting.heapsort;

public class HeapSort {

    public void sort(int[] array){

        /**
         * 1. Heapify an array (form Max heap)
         *
         * 2. for each element from last to 1 swap 0th element which is max with last element
         *
         * 3. percolate the root element all the way down to last-1
         */
        int size = array.length;
        heapify(array);

        for(int i = size - 1 ; i > 0 ; i--){
            swap(array, 0, i);
            percolateDown(array, 0, i);
        }

    }

    private void percolateDown(int[] array, int root, int size) {
        int leftChild, rightChild;
        leftChild = leftChild(root);
        rightChild = rightChild(root);

        if(leftChild >= size && rightChild >= size){
            return;
        }

        int max = leftChild;
        if(rightChild < size && array[rightChild] > array[leftChild]){
            max = rightChild;
        }
        if(array[max] > array[root]){
            swap(array, root, max);
            percolateDown(array,max,size);
        }
    }

    private void heapify(int[] array) {
        int size = array.length;
        int leftChild, rightChild;
        for (int i = (size - 2)/2 ; i >= 0 ; i--){
            leftChild = leftChild(i);
            rightChild = rightChild(i);

            int max = leftChild;
            if(rightChild < size && array[rightChild] > array[leftChild]){
                max = rightChild;
            }
            if(array[max] > array[i]){
                swap(array, i, max);
                percolateDown(array, max, size);
            }
        }
    }

    private void swap(int[] array, int i, int max) {
        int temp = array[i];
        array[i] = array[max];
        array[max] = temp;
    }

    private int leftChild(int index){
        return (2*index) + 1;
    }

    private int rightChild(int index){
        return (2*index) + 2;
    }

    private int parent(int index){
        return (index - 1)/2;
    }

}
