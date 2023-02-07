public class ArrayDictionaryDriver {
    public static void main(String[] args) {
        ArrayDictionary<Integer, String> player = new ArrayDictionary<>(); // making a ArrayDictionary variable
        System.out.println(player.isEmpty()); // testing the isEmpty method with an empty ArrayDictionary (should return true)
        System.out.println(player.values()); // testing an empty values method (should return null)
        System.out.println(player.keys()); // testing an empty keys method (should return null)
        player.put(1,"Bob"); // testing the put method
        player.put(2,"Sally"); // testing the put method
        player.put(3,"Fred"); // testing the put method
        System.out.println(player.size()); // testing the size when the ArrayDictionary is not null
        System.out.println(player.isEmpty()); // testing the isEmpty method when the ArrayDictionary is not empty (should return false)
        System.out.println(player.contains(2)); // testing the contains method (should print true)
        player.remove(2); // testing the remove method
        System.out.println(player.contains(2)); // testing the contains method on a non-existent key (should print false)
        System.out.println(player.keys()); // testing the keys method with a filled ArrayDictionary (should print [2, 3]
        System.out.println(player.values()); // testing the values method with a filled ArrayDictionary (should print [Sally, Fred]
        player.remove(1); // removing all the buckets
        player.remove(3);
        System.out.println(player.size()); // testing the size method on an empty ArrayDictionary

    }
}
