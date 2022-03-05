package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class GenArrayList<T extends Comparable<? super T>> {
    private final ArrayList<T> list;

    public GenArrayList(int capacity) {
        int initCap = capacity > 0 ? capacity : 0;
        this.list = new ArrayList<>(initCap);
    }

    public void add(T val) {
        this.list.add(val);
    }

    public void remove(T val) {
        this.list.remove(val);
    }

    public void edit(T oldData, T newData) {
        int index = this.list.indexOf(oldData);
        this.list.set(index, newData);
    }

    public void print() {
        for (T e : this.list) {
            System.out.println(e + " ");
        }
        System.out.println();
    }

    public void sortedPrint() {
        Collections.sort(this.list);
        for (T e : this.list) {
            System.out.println(e + " ");
        }
        System.out.println();
    }
}
