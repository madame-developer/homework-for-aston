package collection.myArrayList;

import java.util.Collection;

public interface MyList<T> {

    public abstract void add(T inputValue);

    public abstract void remove(T inputValue);

    public abstract T get(int index);

    public abstract void addAll(Collection<? extends T> collection);
    
}
