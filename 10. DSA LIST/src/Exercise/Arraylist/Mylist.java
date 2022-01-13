package Exercise.Arraylist;

import java.util.Arrays;

public class Mylist<E> {
    private int size = 0;
    private static final int DAFAULT_CAPACITY = 10;
    private  E[] data;

    public Mylist() {
        data = (E[]) new Object[DAFAULT_CAPACITY];
    }

    public Mylist(int size) {
        data = (E[]) new Object[size];
    }

    public E[] getData() {
        return this.data;
    }

    private void ensupreCapa(){
        if(size > data.length){
            int newSize = size*2;
            data = Arrays.copyOf(data, newSize);
        }
    }

    public void add(E e){
        size += 1;
        ensupreCapa();
        data[size -1] = e;
    }

    public void add(int index, E e){
        if (size >= 0 & size <= size){
            size += 1;
            ensupreCapa();
            for (int i = size - 2; i >= index; i--) {
                data[i + 1] = data[i];
            }
            data[index] = e;
        }
    }

    public int size() {
        return size;
    }

    public E[] get(int index) {
        if (index >= 0 & index < size){
            return (E[]) data[index];
        }
        return null;
    }

    public void clear() {
        data = (E[]) new Object[DAFAULT_CAPACITY];
        size = 0;
    }

    public E remove(int index) {
        if (index >= 0 & index < size) {
            for (int i = index; i < size; i++) {
                data[i] = data[i + 1];
            }
            size -= 1;
        }
        return (E) data;
    }

    public boolean contains(E e){
        for (E x : data){
            if (e.equals(x)){
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e){
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }


    @Override
    public String toString() {
        return "MyList{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
