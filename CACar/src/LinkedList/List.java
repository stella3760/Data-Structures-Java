package LinkedList;

/**
 *
 * @author seunghyekim
 */
public interface List<T> {

    /**
     * This method returns the size of the list
     *
     * @return the size of the list
     */
    public int size();

    /**
     * This method returns a boolean to indicate if the list is empty
     *
     * @return true if empty
     */
    public boolean isEmpty();

    /**
     * This method allows us to add to the end of the list
     *
     * @param elem - the element to added to the list
     */
    public void add(T elem);

    /**
     * This method allows us to add to a list at a given index
     *
     * @param index - the index where the element is to be inserted
     * @param elem - the element to be inserted
     */
    public void add(int index, T elem);

    /**
     * This method allows us to add to the start of the list
     *
     * @param elem - element to be added
     */
    public void addFirst(T elem);



    public T remove(int index);

    // existing methods omitted
    /**
     * This method adds an element to the list in the position  previous to
     * the first occurrence of the the target  element
     *
     * @param target
     * @param elem
*
     */
    public void addBefore(T target, T elem);



    public void addAfter(T target, T elem);


    public T remove(T target);

}
