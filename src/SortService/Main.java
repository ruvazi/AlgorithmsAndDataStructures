/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortService;



public class Main {

    public static void main(String[] args) {

        testInsertionSort(10000, 10);
        testInsertionSort(20000, 10);
        testInsertionSort(40000, 10);
        testInsertionSort(80000, 10);
        testInsertionSort(160000, 10);

        testSelectionSort(10000, 10);
        testSelectionSort(20000, 10);
        testSelectionSort(40000, 10);
        testSelectionSort(80000, 10);
        testSelectionSort(160000, 10);

        testMergeSort(100000, 10);
        testMergeSort(200000, 10);
        testMergeSort(400000, 10);
        testMergeSort(800000, 10);
        testMergeSort(1600000, 10);

    }

    private static void testInsertionSort(int length, int nTimes) {

        long t1, t2;
        long sum = 0;
        double result;

        for (int i = 0; i < nTimes; i++) {
            SortService s = new SortService(length);
            s.insertData();
            t1 = System.currentTimeMillis();
            s.insertionSort();
            t2 = System.currentTimeMillis();
            sum += (t2 - t1);
        }

        result = sum / nTimes;

        System.out.println("Insertion Sort (" + length + "): " + result + " ms");
    }

    private static void testSelectionSort(int length, int nTimes) {

        long t1, t2;
        long sum = 0;
        double result;

        for (int i = 0; i < nTimes; i++) {
            SortService s = new SortService(length);
            s.insertData();
            t1 = System.currentTimeMillis();
            s.selectionSort();
            t2 = System.currentTimeMillis();
            sum += (t2 - t1);
        }

        result = sum / nTimes;

        System.out.println("Selection Sort (" + length + "): " + result + " ms");
    }

    private static void testMergeSort(int length, int nTimes) {

        long t1, t2;
        long sum = 0;
        double result;

        for (int i = 0; i < nTimes; i++) {
            SortService s = new SortService(length);
            s.insertData();
            t1 = System.currentTimeMillis();
            s.realMergeSort();
            t2 = System.currentTimeMillis();
            sum += (t2 - t1);
        }

        result = sum / nTimes;

        System.out.println("Merge Sort (" + length + "): " + result + " ms");
    }
}
