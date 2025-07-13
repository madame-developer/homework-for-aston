package collection.myArrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class MyArrayList<T> implements MyList<T> {
    
    private T[] values;

    private int currentSize;

    private static final int DEFAULT_CAPACITY = 15;

    public MyArrayList() {
        values = (T[]) new Object[DEFAULT_CAPACITY];
        currentSize = 0;
    }

    //Получение текущего размера
    public int getCurrentSize() {
        return currentSize;
    }

    //Добавление элемента в конец
    @Override
    public void add(T inputValue) {
        if (currentSize >= values.length * 0.8) {
            expand();
        }
        for (int i = 0; i < values.length; i++) {
            if(values[i] == null) {
                values[i] = inputValue;
                currentSize++;
                return;
            }
        }
    }

    //Удаление элемента по значению
    @Override
    public void remove(T inputValue) {
        int elementIndexExist = -1;
        for (int i = 0; i < currentSize; i++) {
            if (values[i].equals(inputValue)) {
                elementIndexExist = i;
                break;
            } else {
                System.out.println("Input value doesn't exist!");
            }
        }
        T[] newValues = (T[]) new Object[currentSize - 1];
        for (int i = 0; i < elementIndexExist; i++) {
            newValues[i] = values[i];
        }
        for (int i = elementIndexExist + 1; i < currentSize; i++) {
            newValues[i - 1] = values[i];
        }
        values = newValues;
        currentSize--;
    }

    //Расширение вместимости
    private void expand() {
        int newCapacity = values.length + values.length / 5;
        T[] newValues = (T[]) new Object[newCapacity];
        for (int i=0; i < currentSize; i++) {
            newValues[i] = values[i];
        }
        values = newValues;
    }

    //Получение элемента по индексу
    @Override
    public T get(int index) {
        int valuesCapacity = values.length;
        if(index <= valuesCapacity && values[index] != null) {
            return values[index];
        }
        return null;
    }

    //Добавление всех элементов коллекции
    @Override
    public void addAll(Collection<? extends T> collection) {
        if(collection == null) {
            throw new NullPointerException("Complete the collection!");
        }
        for (T el : collection) {
            add(el);
        }  
    }

    public Stream<T> stream() {
        return Arrays.stream(values, 0, currentSize);
    }
}
