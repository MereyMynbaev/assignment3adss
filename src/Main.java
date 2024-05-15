import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();

        bst.put(9, "Value 9");
        bst.put(7, "Value 7");
        bst.put(17, "Value 17");
        bst.put(6, "Value 6");
        bst.put(1, "Value 1");

        System.out.println("Value with key 3: " + bst.get(3));
        bst.delete(3);
        System.out.println("Value with key 3 after removal: " + bst.get(3));

        System.out.println("Keys in ascending order:");
        for (BST<Integer, String>.Node node : bst) {
            System.out.println("key is " + node.getKey() + " and value is " + node.getValue());
        }


        MyHashTable<MyTestingClass, String> table = new MyHashTable<>();

        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            int id = rand.nextInt(1000);
            MyTestingClass object = new MyTestingClass(id);
            table.put(object, "Value " + i);
        }

        table.printBucketSizes();
    }
}
