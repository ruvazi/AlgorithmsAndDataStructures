/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortService;

import java.util.Random;

/**
 *
 * @author Rune
 */
public class SortService {
    private int length;
    private int maxRange = 1000;
    private Random random = new Random();
    private int[] list;
    private int[] helper;

    SortService(int length) {
        this.length = length;
        this.list = new int[length];
    }

    void insertData() {
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(maxRange);
        }
    }

    void insertionSort() {
        int temp;

        for (int i = 1; i < length; i++) {
            temp = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > temp; j--)
                list[j + 1] = list[j];
            list[j + 1] = temp;
        }
    }

    void selectionSort() {
        for (int i = 0; i < length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < length; j++)
                if (list[j] < list[index])
                    index = j;

            int smallerNumber = list[index];
            list[index] = list[i];
            list[i] = smallerNumber;
        }
    }

    void realMergeSort() {
        this.helper = new int[length];
        mergesort(0, length - 1);
    }

    // check if low is smaller then high, if not then the array is sorted
    // Get the index of the element which is in the middle
    // Sort the left side of the array
    // Sort the right side of the array
    // Combine them both
    
    void mergesort(int low, int high) {
        
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergesort(low, mid);
            mergesort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    
    // Copy both parts into the helper array
    // Copy the smallest values from either the left or the right side back
    // to the original array
    // Copy the rest of the left side of the array into the target array
    
    void merge(int low, int mid, int high) {

        for (int i = low; i <= high; i++) {
            helper[i] = list[i];
        }

        int i = low;
        int j = mid + 1;
        int k = low;
        
        while (i <= mid && j <= high) {
            if (helper[i] <= helper[j]) {
                list[k] = helper[i];
                i++;
            } else {
                list[k] = helper[j];
                j++;
            }
            k++;
        }
        
        while (i <= mid) {
            list[k] = helper[i];
            k++;
            i++;
        }

}
}
