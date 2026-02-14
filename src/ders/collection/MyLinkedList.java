package ders.collection;

import java.util.Arrays;

public class MyLinkedList<T> {

    private Object[] array = new Object[100];
    private int i = 0;

    public MyLinkedList() {
    }

    public MyLinkedList(int initialSize) {
        this.array = new Object[initialSize];
    }

    public void add(T value){
        if (i == array.length){
            this.array = Arrays.copyOf(array, array.length + (array.length/2));
        }
        this.array[i++] = value;
    }

    public void addFirst(T value) {
        Object[] arrayNew = new Object[1];
        arrayNew[0] = value;
        i++;
        Object[] arrayAll = new Object[arrayNew.length + array.length];
        System.arraycopy(arrayNew,0,arrayAll,0,arrayNew.length);
        System.arraycopy(array,0,arrayAll,arrayNew.length,array.length);
        if (arrayAll.length >= array.length){
            this.array = Arrays.copyOf(array, array.length + (array.length/2));
        }
        System.arraycopy(arrayAll,0,array,0,arrayAll.length);
    }

    public void addLast(T value) {
        if (i == array.length){
            this.array = Arrays.copyOf(array, array.length + (array.length/2));
        }
        this.array[i++] = value;
    }

    public T get(int value){
        return (T) this.array[value];
    }

    @Override
    public String toString() {
        return '[' +
                "array=" + Arrays.toString(array) +
                ']';
    }
}
