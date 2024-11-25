import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 * A custom collection implementation for managing Sweet objects.
 * Implements the Set interface and uses a singly linked list as its internal structure.
 */
public class GiftCollection implements Set<Sweet> {

    /**
     * Represents a node in the singly linked list.
     */
    private class Node {
        Sweet data; // The sweet data contained in the node
        Node next;  // Reference to the next node in the list

        Node(Sweet data) {
            this.data = data; 
        }
    }

    private Node head; 
    private int size;

    /**
     * Default constructor to create an empty collection.
     */
    public GiftCollection() {
        this.head = null; 
        this.size = 0; 
    }

    /**
     * Adds a sweet to the collection.
     *
     * @param sweet the sweet to be added
     * @return true if the sweet was added, false if it was already present
     */
    @Override
    public boolean add(Sweet sweet) {
        if (sweet == null) {
            throw new IllegalArgumentException("Sweet cannot be null."); 
        }
        if (contains(sweet)) {
            return false; 
        }
        Node newNode = new Node(sweet); 
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; 
            }
            current.next = newNode;
        }
        size++; 
        return true;
    }

    /**
     * Removes a sweet from the collection.
     *
     * @param o the sweet to be removed
     * @return true if the sweet was removed, false if it was not found
     */
    @Override
    public boolean remove(Object o) {
        if (head == null || !(o instanceof Sweet)) {
            return false; 
        }
        if (head.data.equals(o)) {
            head = head.next; 
            size--; 
            return true;
        }
        Node current = head;
        while (current.next != null && !current.next.data.equals(o)) {
            current = current.next; 
        }
        if (current.next == null) {
            return false; 
        }
        current.next = current.next.next; 
        size--; 
        return true;
    }

    /**
     * Checks if the collection contains a specific sweet.
     *
     * @param o the sweet to check for
     * @return true if the sweet is found, false otherwise
     */
    @Override
    public boolean contains(Object o) {
        if (!(o instanceof Sweet)) {
            return false; 
        }
        Node current = head;
        while (current != null) {
            if (current.data.equals(o)) {
                return true;
            }
            current = current.next; 
        }
        return false; 
    }

    /**
     * Returns the number of sweets in the collection.
     *
     * @return the size of the collection
     */
    @Override
    public int size() {
        return size; // Return the size
    }

    /**
     * Checks if the collection is empty.
     *
     * @return true if the collection is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return size == 0; // Return true if size is 0
    }

    /**
     * Clears the collection, removing all sweets.
     */
    @Override
    public void clear() {
        head = null; // Set head to null
        size = 0;    // Reset size to 0
    }

    /**
     * Returns an iterator over the sweets in the collection.
     *
     * @return an iterator for the collection
     */
    @Override
    public Iterator<Sweet> iterator() {
        return new Iterator<>() {
            private Node current = head; 

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Sweet next() {
                if (!hasNext()) {
                    throw new NoSuchElementException(); 
                }
                Sweet data = current.data;
                current = current.next; 
                return data;
            }
        };
    }

    /**
     * Adds all sweets from the specified collection to this collection.
     *
     * @param c the collection of sweets to add
     * @return true if the collection was modified
     */
    @Override
    public boolean addAll(Collection<? extends Sweet> c) {
        boolean modified = false;
        for (Sweet sweet : c) {
            if (add(sweet)) {
                modified = true; 
            }
        }
        return modified; 
    }

    /**
     * Checks if this collection contains all sweets in the specified collection.
     *
     * @param c the collection to check against
     * @return true if this collection contains all sweets, false otherwise
     */
    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Removes all sweets in the specified collection from this collection.
     *
     * @param c the collection of sweets to remove
     * @return true if the collection was modified
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object o : c) {
            if (remove(o)) {
                modified = true;
            }
        }
        return modified; 
    }

    /**
     * Retains only the sweets in this collection that are contained in the specified collection.
     *
     * @param c the collection to retain
     * @return true if the collection was modified
     */
    @Override
    public boolean retainAll(Collection<?> c) {
        boolean modified = false;
        Node current = head;
        Node prev = null;
        while (current != null) {
            if (!c.contains(current.data)) {
                if (prev == null) {
                    head = current.next; 
                } else {
                    prev.next = current.next; 
                }
                size--; 
                modified = true; 
            } else {
                prev = current;
            }
            current = current.next; 
        }
        return modified; 
    }

    /**
     * Returns an array containing all sweets in the collection.
     *
     * @return an array of sweets
     */
    @Override
    public Object[] toArray() {
        Object[] array = new Object[size]; 
        Node current = head;
        int index = 0;
        while (current != null) {
            array[index++] = current.data; 
            current = current.next;
        }
        return array; 
    }

    /**
     * Returns an array containing all sweets in the collection; the runtime type of the returned array is that of the specified array.
     *
     * @param a the array into which the elements of the collection are to be stored
     * @return an array containing the sweets
     */
    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            a = (T[]) java.lang.reflect.Array.newInstance(a.getClass().getComponentType(), size); // Create a new array if necessary
        }
        Node current = head;
        int index = 0;
        while (current != null) {
            a[index++] = (T) current.data; 
            current = current.next; 
        }
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }
}
