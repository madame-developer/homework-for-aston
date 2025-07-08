package collection.myArrayList;


public interface MyInterface<T> {

    public abstract void add(T inputValue);

    public abstract void remove(T inputValue);

    public abstract T get(int index);

    public abstract void addAll();
}
