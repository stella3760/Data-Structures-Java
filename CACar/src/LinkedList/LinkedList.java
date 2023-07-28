package LinkedList;

/**
 *
 * @author seunghyekim
 */
public class LinkedList implements List<T> {

    private Node<T> first;
    private Node<T> last;

    public LinkedList() {
        first = null;
        last = null;
    }

    @Override
    public int size() {
        int size = 0;

        Node<T> current = first;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public String toString() {
        String repr = "START\n";
        Node<T> current = first;
        while (current != null) {
            repr += current.toString() + "\n";
            current = current.next;
        }
        repr += "END";
        return repr;
    }

    @Override
    public void add(T elem) {
        if (isEmpty()) {
            Node<T> insertion = new Node<>(elem);
            first = insertion;
            last = first;
        } else {
            last.next = new Node<>(elem);
            last = last.next;
        }
    }

    @Override
    public void add(int index, T elem) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            first = new Node<>(elem, first);
            if (last == null) {
                last = first;
            }
            return;
        }
        Node<T> current = first;
        for (int i = 1; i <= index - 1; i++) {
            current = current.next;
        }
        Node<T> insert = new Node<>(elem, current.next);
        current.next = insert;
        if (current.next.next == null) {
            last = insert;
        }
    }

    @Override
    public void addFirst(T elem) {
        Node<T> insertion = new Node<>(elem, first);
        first = insertion;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        T element;  // The element to return
        if (index == 0) {
            // Removal of first item in the list
            element = first.element;
            first = first.next;
            if (first == null) {
                last = null;
            }
            return element;
        }
        // To remove an element other than the first
        // find the predecessor of the element to be removed.
        Node<T> pred = first;
        // Move pred forward index - 1 times
        for (int k = 1; k <= index - 1; k++) {
            pred = pred.next;
        }
        // Store the element to return
        element = pred.next.element;

        // Route link around the node to be removed
        pred.next = pred.next.next;
        // Check if pred is now last
        if (pred.next == null) {
            last = pred;
        }
        return element;
    }

    @Override
    public void addBefore(T target, T elem) {
        if (isEmpty()) {
            return;
        }
        Node<T> current = first;
        int index = 0;
        while (current != null && !current.element.equals(target)) {
            index++;
            current = current.next;
        }
        System.out.println("index=" + index);
        System.out.println("current=" + current);
        if (current != null && current.element.equals(target)) {
            add(index, elem);
        }
    }

    @Override
    public void addAfter(T target, T elem) {
        if (isEmpty()) {
            return;
        }
        Node<T> current = first;
        int index = 0;
        while (current != null &&!current.element.equals(target)) {
            index++;
            current = current.next;
        }
        System.out.println("index=" + index);
        System.out.println("current=" + current);
        if (current != null &&current.element.equals(target)) {
            add(index+1, elem);
        }
    }

    @Override
    public T remove(T target) {
        Node<T> current = first;
        int index = 0;
        while(current != null && !current.element.equals(target)){
            current = current.next;
            index++;
        }
        if (current != null && current.element.equals(target)){
            return remove(index);
        }
        return null;
    }

}
