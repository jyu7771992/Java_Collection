package LeetCode;

import java.util.ArrayList;
import java.util.Iterator;
// class to implement iterable
public class GenericList<T> implements Iterable<T>{
    private T[] items = (T[]) new Object[10];
    private int count;
    public void add(T item) {
      items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
    //return iterable
    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }


    private class ListIterator implements Iterator<T>{
        private GenericList<T> list;
        private int index;
        //add constructor
        public ListIterator(GenericList<T> list){
            this.list = list;
        }
        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
