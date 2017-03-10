/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cardswap;

/**
 *
 * @author Rune
 */
import java.util.LinkedList;

public class main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(13);
        list.addFirst(4);
        list.addFirst(12);
        list.addFirst(2);
        list.addFirst(20);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(9);
        list.addFirst(0);

        CardSwap.dequeueSort(list);
    }
}
