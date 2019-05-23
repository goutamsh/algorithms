package com.gshepur.searching.binarysearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void search() {

        BinarySearch binarySearch = new BinarySearch();
        int[] array = new int[]{1,2,3,4,5,6};
        assertEquals(-1, binarySearch.search(array, -11));
        assertEquals(0, binarySearch.search(array, 1));
        assertEquals(1, binarySearch.search(array, 2));
        assertEquals(2, binarySearch.search(array, 3));
        assertEquals(3, binarySearch.search(array, 4));
        assertEquals(4, binarySearch.search(array, 5));
        assertEquals(5, binarySearch.search(array, 6));
        assertEquals(-1, binarySearch.search(array, 7));
    }

    @Test
    public void search2() {

        BinarySearch binarySearch = new BinarySearch();
        int[] array = new int[]{1,2,3,4,5,6,7};
        assertEquals(-1, binarySearch.search(array, -11));
        assertEquals(0, binarySearch.search(array, 1));
        assertEquals(1, binarySearch.search(array, 2));
        assertEquals(2, binarySearch.search(array, 3));
        assertEquals(3, binarySearch.search(array, 4));
        assertEquals(4, binarySearch.search(array, 5));
        assertEquals(5, binarySearch.search(array, 6));
        assertEquals(6, binarySearch.search(array, 7));
        assertEquals(-1, binarySearch.search(array, 8));
    }
}