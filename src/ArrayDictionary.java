import java.util.Collection;
import java.util.ArrayList;

public class ArrayDictionary<E,T> {
    /*  A Java dictionary should use generics for the
     *  types of both key and value. E and T here. */
    private ArrayList<E> keys; // creating an array list for the keys
    private ArrayList<T> values; // creating an ArrayList for the values
    private int size; // creating a size variable to keep track of the size

    public ArrayDictionary(){ // creating an empty constructor
        keys = new ArrayList<E>(); // initializing all the variables
        values = new ArrayList<T>();
        size = 0;
    }

    // adds a key and value to the ArrayDictionary
    void put(E key, T value){ // creating the put method
        keys.add(key); // adding the key variable to the keys ArrayList
        values.add(value); // adding the value variable to the values ArrayList
        size++; // updating the size
    }

    //get the value associated with a given key
    T get(E key){ // creating the get method for a key
        for (int i = 0; i < size; i++){ // creating a for loop to run through the array
            if (keys.get(i).equals(key) && keys.get(i) != null){ // making an if statement to access the key
                return values.get(i); // returning the value at the instance
            }
        }
        return null; // otherwise return null
    }

    //remove a key-value pair and return its value
    T remove(E key){ // making the remove method
        for (int i = 0; i < size; i++){ // creating a for loop to loop through the array
            T temp = values.get(i); // creating a temp variable
            keys.remove(i); // removing the key from the array
            values.remove(i); // removing the value from the array
            size --; // updating size
            return temp; // returning the temp variable
        }
        return null; // otherwise returning null
    }

    //returns true if the given key has an associated value
    boolean contains(E key){ // creating the contains method
        for (int i = 0; i < size; i++){ // creating a for loop to loop through the array
            if (keys.get(i).equals(key) && keys.get(i) != null){ // creating an if statement
                return true; // returning true
            }
        }
        return false; // otherwise returning false
    }

    //returns true if the dictionary is empty
    boolean isEmpty(){ // creating an is empty method
        return size == 0; // returning true if size = 0
    }

    //returns the number of key-value pairs in the dictionary
    int size(){ // creating a get size method
        return size; // returning the size
    }

    //returns a Collection¹ of keys
    Collection<E> keys(){ // creating a keys method
        return keys; // returning the collection of keys
    }

    //returns a Collection of values
    Collection<T>  values(){ // creating a values method
        return values; // returning the collection of values
    }
}
