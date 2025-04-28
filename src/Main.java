public class Main {
    public static void main(String[] args) {
        // 1. Testing MyHashTable
        System.out.println("=== Testing MyHashTable ===");
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();

        // Put elements
        for (int i = 0; i < 10000; i++) {
            table.put(new MyTestingClass(i), new Student("Student " + i));
        }
        System.out.println("Added 10000 elements");

        // Print bucket distribution
        table.printBucketSizes();

        // Test get()
        MyTestingClass testKey = new MyTestingClass(500);
        Student testValue = table.get(testKey);
        System.out.println("\nValue for key 500: " + testValue);

        // Test contains()
        Student searchStudent = new Student("Student 9999");
        boolean contains = table.contains(searchStudent);
        System.out.println("Contains 'Student 9999': " + contains);

        // Test getKey()
        MyTestingClass foundKey = table.getKey(searchStudent);
        System.out.println("Key for 'Student 9999': " + foundKey);

        // Test remove()
        Student removed = table.remove(testKey);
        System.out.println("Removed value: " + removed);
        System.out.println("Get after remove: " + table.get(testKey));

        // 2. Testing BST
        System.out.println("\n=== Testing BST ===");
        BST<Integer, String> tree = new BST<>();

        // Put elements
        tree.put(5, "Five");
        tree.put(3, "Three");
        tree.put(7, "Seven");
        tree.put(2, "Two");
        tree.put(4, "Four");
        tree.put(6, "Six");
        tree.put(8, "Eight");

        // Test size()
        System.out.println("BST size: " + tree.size());

        // Test get()
        System.out.println("Value for key 4: " + tree.get(4));
        System.out.println("Value for key 10: " + tree.get(10));

        // Test iterator
        System.out.println("\nIn-order traversal:");
        for (var elem : tree.iterator()) {
            System.out.println("key: " + elem.getKey() + ", value: " + elem.getValue());
        }

        // Test delete
        tree.delete(5);
        System.out.println("\nAfter deleting root (5):");
        for (var elem : tree.iterator()) {
            System.out.println("key: " + elem.getKey() + ", value: " + elem.getValue());
        }
        System.out.println("New size: " + tree.size());

        // Edge case testing
        System.out.println("\nEdge case testing:");
        BST<String, Integer> emptyTree = new BST<>();
        System.out.println("Empty tree size: " + emptyTree.size());
        System.out.println("Get from empty tree: " + emptyTree.get("test"));
    }
}