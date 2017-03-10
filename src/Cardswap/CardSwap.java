/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cardswap;

import java.util.LinkedList;

/**
 *
 * @author Rune
 */
public class CardSwap {
    
    static LinkedList<Integer> dequeueSort(LinkedList<Integer> list) {

        int sorted = 0;

        while (sorted != list.size()) {

            for (int i = 0; i < list.size() - sorted - 1; i++) {
                final int first = list.pop();
                final int second = list.pop();

                if (first > second) {
                    list.addLast(first);
                    list.addFirst(second);
                } else {
                    list.addLast(second);
                    list.addFirst(first);
                }
            }

            final int t = list.pop();

            for (int i = 0; i < sorted; i++)
                list.addLast(list.pop());

            list.addLast(t);
            sorted++;
        }
        return list;
    }
}

