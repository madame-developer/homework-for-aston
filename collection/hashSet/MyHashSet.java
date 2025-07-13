package collection.hashSet;

public class MyHashSet<T> implements MySet<T> {

    private T[] array;

    private static final int DEFAULT_SIZE = 10;

    private int currentSize;

    public MyHashSet() {
        array = (T[]) new Object[DEFAULT_SIZE];
        currentSize = 0;
    }

    //Получение текущего размера
    public int getCurrentSize() {
        return currentSize;
    }

    //Добавление элемента
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

    //Проверка на уникальность
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

    //Удаление элемента по значению
    @Override
    public void remove(T inputValue) {
        for (int i = 0; i < array.length; i++) {
            if (inputValue.equals(array[i])) {
                 array[i] = null;
                 currentSize--;
                 return;
                } else {
                    System.out.println("Input value doesn't exist!");
                }
            }
        }
    }