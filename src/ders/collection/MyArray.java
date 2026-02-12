package ders.collection;

import java.util.Arrays;

public class MyArray<T> {  // Menim array listim.

    private Object[] array = new Object[100];
    private int i = 0;

    public MyArray() {
    }

    public MyArray(int initialSize) {
        this.array = new Object[initialSize];
    }

    public void add(T obj) {
        if (i == array.length){
            this.array = Arrays.copyOf(array, array.length + (array.length/2));
        }
        array[i++] = obj;
    }

    public T get(int i){
        return (T) array[i];
    }
}
