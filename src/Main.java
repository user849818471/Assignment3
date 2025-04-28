public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();
        for (int i = 0; i < 10000; i++) {
            table.put(new MyTestingClass(i), new Student("Student " + i));
        }
        table.printBucketSizes();

        BST<Integer, String> tree = new BST<>();
        tree.put(5, "Five");
        tree.put(3, "Three");
        tree.put(7, "Seven");

        for (var elem : tree.iterator()) {
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
        }
    }
}