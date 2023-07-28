package LinkedList;

/**
 *
 * @author seunghyekim
 */
public class LinkedListApp {

    public static void main(String[] args) {
        List<String> list = new LinkedList<> ();
        list.add("A");
        list.add("B");
        list.add("C");

        list.addBefore("B", "B-");
        list.addAfter("A", "A+");
        list.remove("C");
        System.out.println(list);
    }
}
