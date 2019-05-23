package com.gshepur.sorting.heapsort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class HeapSortTest {

    @Test
    public void sort1() {

        HeapSort heapSort = new HeapSort();

        int[] array = new int[]{8,7,6,5,4,3,2};
        System.out.println("Before array sorted : "+Arrays.toString(array));
        heapSort.sort(array);
        System.out.println("After array sorted : "+Arrays.toString(array));

        int[] expectedArray = new int[]{8,7,6,5,4,3,2};
        Arrays.sort(expectedArray);
        Assert.assertArrayEquals(expectedArray, array);
    }

    @Test
    public void sort2() {
        HeapSort heapSort = new HeapSort();
        int[] array = new int[]{1,1,1,2,2};
        System.out.println("Before array sorted : "+Arrays.toString(array));
        heapSort.sort(array);
        System.out.println("After array sorted : "+Arrays.toString(array));

        int[] expectedArray = new int[]{1,1,1,2,2};
        Arrays.sort(expectedArray);
        Assert.assertArrayEquals(expectedArray, array);
    }

    @Test
    public void sort3() {
        HeapSort heapSort = new HeapSort();
        int[] array = new int[]{1,1,8,8,2,2,1,1};
        System.out.println("Before array sorted : "+Arrays.toString(array));
        heapSort.sort(array);
        System.out.println("After array sorted : "+Arrays.toString(array));

        int[] expectedArray = new int[]{1,1,8,8,2,2,1,1};
        Arrays.sort(expectedArray);
        Assert.assertArrayEquals(expectedArray, array);
    }

    @Test
    public void sort4() {
        HeapSort heapSort = new HeapSort();
        int[] array = new int[]{1,1,8,8,2,2,1};
        System.out.println("Before array sorted : "+Arrays.toString(array));
        heapSort.sort(array);
        System.out.println("After array sorted : "+Arrays.toString(array));

        int[] expectedArray = new int[]{1,1,8,8,2,2,1};
        Arrays.sort(expectedArray);
        Assert.assertArrayEquals(expectedArray, array);
    }

    @Test
    public void sort5() {
        HeapSort heapSort = new HeapSort();
        int[] array = new int[]{1,1,8,8,2,2};
        System.out.println("Before array sorted : "+Arrays.toString(array));
        heapSort.sort(array);
        System.out.println("After array sorted : "+Arrays.toString(array));

        int[] expectedArray = new int[]{1,1,8,8,2,2};
        Arrays.sort(expectedArray);
        Assert.assertArrayEquals(expectedArray, array);
    }

    @Test
    public void sort6() {
        HeapSort heapSort = new HeapSort();
        int[] array = new int[]{1,1,8,8,2};
        System.out.println("Before array sorted : "+Arrays.toString(array));
        heapSort.sort(array);
        System.out.println("After array sorted : "+Arrays.toString(array));

        int[] expectedArray = new int[]{1,1,8,8,2};
        Arrays.sort(expectedArray);
        Assert.assertArrayEquals(expectedArray, array);
    }

    @Test
    public void sort7() {
        HeapSort heapSort = new HeapSort();
        int[] array = new int[]{1,6,8,2};
        System.out.println("Before array sorted : "+Arrays.toString(array));
        heapSort.sort(array);
        System.out.println("After array sorted : "+Arrays.toString(array));

        int[] expectedArray = new int[]{1,6,8,2};
        Arrays.sort(expectedArray);
        Assert.assertArrayEquals(expectedArray, array);
    }
}