import java.util.Collection;
import java.util.ArrayList;

public class ArrayDictionary<E,T> {
    /*  A Java dictionary should use generics for the
     *  types of both key and value. E and T here. */
    private ArrayList<E> keys;
    private ArrayList<T> values;
    private int size;

    public ArrayDictionary(){
        keys = new ArrayList<E>();
        values = new ArrayList<T>();
        size = 0;
    }
    //add an key-value pair to the dictionary
    void put(E key, T value){
        keys.add(key);
        values.add(value);
        size++;
    }

    //get the value associated with a given key
    T get(E key){
        for (int i = 0; i < size; i++){
            if (keys.get(i).equals(key) && keys.get(i) != null){
                return values.get(i);
            }
        }
        return null;
    }

    //remove a key-value pair and return its value
    T remove(E key){
        for (int i = 0; i < size; i++){
            T temp = values.get(i);
            keys.remove(i);
            values.remove(i);
            size --;
            return temp;
        }
        return null;
    }

    //returns true if the given key has an associated value
    boolean contains(E key){
        for (int i = 0; i < size; i++){
            if (keys.get(i).equals(key) && keys.get(i) != null){
                return true;
            }
        }
        return false;
    }

    //returns true if the dictionary is empty
    boolean isEmpty(){
        return size == 0;
    }

    //returns the number of key-value pairs in the dictionary
    int size(){
        return size;
    }

    //returns a Collection¹ of keys
    Collection<E> keys(){
        return keys;
    }

    //returns a Collection of values
    Collection<T>  values(){
        return values;
    }
}
