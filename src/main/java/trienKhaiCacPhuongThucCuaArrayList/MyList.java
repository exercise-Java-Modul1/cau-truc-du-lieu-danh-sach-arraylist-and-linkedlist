package trienKhaiCacPhuongThucCuaArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[] = new Object[DEFAULT_CAPACITY];

    public MyList() {

    }


    public void add( E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size] = element;
        size++;
    }

    public int getSize() {
        return size;
    }

    public void getlist(int index) {
        for (int i = 0; i < getSize(); i++) {
            if (index == i) {
                System.out.println(elements[i]);
            }
        }
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void remove(int index) {
        for (int i = 0; i < getSize(); i++) {
            if (index == i) {
                for (int j = i; j < getSize(); j++) {
                    elements[j] = elements[j + 1];
                }
                size--;
            }
        }
    }

    public void clear() {
        for (int i = getSize(); i > 0; i--) {
            for (int j = 0; j < getSize(); j++) {
                elements[j] = elements[j + 1];
            }
            size--;
        }
    }

    public void coverNumber(int index, int number) {
        for (int i = 0; i < getSize(); i++) {
            if (index == i) {
                elements[i] = number;
            }
        }
    }


}
