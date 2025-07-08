package collection.hashSet;

import java.util.HashMap;

public class MyHashSet<T> implements MyInterface<T> {

    private T[] array;

    private static final int DEFAULT_SIZE = 10;

    public MyHashSet() {
        array = (T[]) new Object[DEFAULT_SIZE];
    }

    @Override
    public void add(T value) {
        if(isCloneExists(value)) {
            System.out.println("Input value already exist!");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = value;
                break;
            }
        }
    }

    private boolean isCloneExists(T value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (array[i].equals(value)) {
                    return true;
                }
           
            }
        }
        return false;
    }


    @Override
    public void remove(T inputValue) {
       
    }
    
}
