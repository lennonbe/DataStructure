import java.util.*;

public class OptimizedLog<E> implements Collection<E>//, Iterator<E>
{

    private LogElement<E> endOfLog;
    private LogElement<E> startOfLog;
    private int size = 0;
    /**
     * Returns the number of elements in this list.      
     * @return the number of elements in this list
     */
    public int size()
    {
        return size;
    }

    public LogElement<E> getStartOfLog()
    {
        return startOfLog;
    }

    
    /**
     * Returns <tt>true</tt> if this list contains no elements.
     * @return <tt>true</tt> if this list contains no elements
     */
    public boolean isEmpty()
    {
        if(startOfLog == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    
    /**
     * Returns <tt>true</tt> if this list contains the specified element.
     * More formally, returns <tt>true</tt> if and only if this list contains
     * at least one element <tt>e</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>.
     *
     * @param o element whose presence in this list is to be tested
     * @return <tt>true</tt> if this list contains the specified element
     */
    public boolean contains(Object o)
    {

    }

    
    /**
     * Returns an iterator over the elements in this list in proper sequence.
     * @return an iterator over the elements in this list in proper sequence
     */
    public Iterator<Object> iterator()
    {

    }

    /**
     * Returns an array containing all of the elements in this list in proper
     * sequence (from first to last element).
     *
     * <p>The returned array will be "safe" in that no references to it are
     * maintained by this list.  (In other words, this method must
     * allocate a new array even if this list is backed by an array).
     * The caller is thus free to modify the returned array.
     *
     * <p>This method acts as bridge between array-based and collection-based
     * APIs.
     *
     * @return an array containing all of the elements in this list in proper
     *         sequence
     */
    public Object[] toArray()
    {
        
    }
    /**
     * Returns an array containing all of the elements in this list in
     * proper sequence (from first to last element); the runtime type of
     * the returned array is that of the specified array.  If the list fits
     * in the specified array, it is returned therein.  Otherwise, a new
     * array is allocated with the runtime type of the specified array and
     * the size of this list.
     *
     * <p>If the list fits in the specified array with room to spare (i.e.,
     * the array has more elements than the list), the element in the array
     * immediately following the end of the list is set to <tt>null</tt>.
     * (This is useful in determining the length of the list <i>only</i> if
     * the caller knows that the list does not contain any null elements.)
     * 
     * Note that <tt>toArray(new Object[0])</tt> is identical in function to
     * <tt>toArray()</tt>.
     *
     * @param a the array into which the elements of this list are to
     *          be stored, if it is big enough; otherwise, a new array of the
     *          same runtime type is allocated for this purpose.
     * @return an array containing the elements of this list
     */
    public <T> T[] toArray(T[] a)
    {
        
    }
    
    // Modification Operations

    /**
     * Appends the specified element to the end of this list (optional
     * operation).
     *
     * <p>Lists that support this operation may place limitations on what
     * elements may be added to this list.  In particular, some
     * lists will refuse to add null elements, and others will impose
     * restrictions on the type of elements that may be added.  List
     * classes should clearly specify in their documentation any restrictions
     * on what elements may be added.
     *
     * @param e element to be appended to this list
     * @return <tt>true</tt> (as specified by {@link Collection#add})
     */
    public boolean add(LogElement<E> e)
    {
        if(startOfLog == null)
        {
            startOfLog = e;
            endOfLog = e;
            size++;
        }
        else
        {
            LogElement<E> temp;

            temp = endOfLog;
            endOfLog = e;
            endOfLog.setPrev(temp);
            temp.setNext(endOfLog);

            size++;
        }

        return true;
    }
    
    /**
     * Removes the first occurrence of the specified element from this list,
     * if it is present (optional operation).  If this list does not contain
     * the element, it is unchanged.  More formally, removes the element with
     * the lowest index <tt>i</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>
     * (if such an element exists).  Returns <tt>true</tt> if this list
     * contained the specified element (or equivalently, if this list changed
     * as a result of the call).
     *
     * @param o element to be removed from this list, if present
     * @return <tt>true</tt> if this list contained the specified element
     */
    public boolean remove(Object o)
    {
        System.out.println("ERROR CANNOT REMOVE ELEMENTS FROM LOG");

        return false;
    }
    
    // Bulk Modification Operations

    /**
     * Returns <tt>true</tt> if this list contains all of the elements of the
     * specified collection.
     *
     * @param  c collection to be checked for containment in this list
     * @return <tt>true</tt> if this list contains all of the elements of the
     *         specified collection
     */
    public boolean containsAll(Collection<?> c)
    {

    }
    
    /**
     * Appends all of the elements in the specified collection to the end of
     * this list, in the order that they are returned by the specified
     * collection's iterator (optional operation).
     *
     * @param c collection containing elements to be added to this list
     * @return <tt>true</tt> if this list changed as a result of the call
     */
    public boolean addAll(Collection<? extends E> c)
    {
        
    }
    
    /**
     * Removes all of the elements from this list (optional operation).
     * The list will be empty after this call returns.
     *
     */
    public void clear()
    {
        System.out.println("ERROR - CANNOT REMOVE ELEMENTS FROM LOG");
    }

    // Comparison and hashing

    /**
     * Compares the specified object with this list for equality.  Returns
     * <tt>true</tt> if and only if the specified object is also a list, both
     * lists have the same size, and all corresponding pairs of elements in
     * the two lists are <i>equal</i>.  (Two elements <tt>e1</tt> and
     * <tt>e2</tt> are <i>equal</i> if <tt>(e1==null ? e2==null :
     * e1.equals(e2))</tt>.)  In other words, two lists are defined to be
     * equal if they contain the same elements in the same order.  This
     * definition ensures that the equals method works properly across
     * different implementations of the <tt>List</tt> interface.
     *
     * @param o the object to be compared for equality with this list
     * @return <tt>true</tt> if the specified object is equal to this list
     */
    public boolean equals(Object o)
    {
        if(o instanceof OptimizedLog<?>)
        {
            OptimizedLog<?> temp = (OptimizedLog<?>) o;

            if(temp.size() == this.size())
            {
                LogElement<E> element = startOfLog;
                LogElement<?> tempElement = temp.getStartOfLog();
                
                for(int i = 0; i < size; i++)
                {
                    if(element != tempElement)
                    {
                        return false;
                    }
                    element = element.getNext();
                    tempElement = tempElement.getNext();
                }
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Returns the hash code value for this list.  The hash code of a list
     * is defined to be the result of the following calculation:
     * <pre>{@code
     *     int hashCode = 1;
     *     for (E e : list)
     *         hashCode = 31*hashCode + (e==null ? 0 : e.hashCode());
     * }</pre>
     * This ensures that <tt>list1.equals(list2)</tt> implies that
     * <tt>list1.hashCode()==list2.hashCode()</tt> for any two lists,
     * <tt>list1</tt> and <tt>list2</tt>, as required by the general
     * contract of {@link Object#hashCode}.
     *
     * @return the hash code value for this list
     */
    public int hashCode()
    {
        int hashCode = 1;
        for (LogElement<E> lg : startOfLog)
        {
            hashCode = 31*hashCode + (lg == null ? 0 : lg.hashCode());
        }

        return hashCode;
    }
    
    /**
     * Removes from this list all of its elements that are contained in the
     * specified collection (optional operation).
     *
     */
    public boolean removeAll(Collection<?> c)
    {
        System.out.println("ERROR - CANNOT REMOVE ELEMENTS FROM LOG");

        return false;
    }
    
    /**
     * Retains only the elements in this list that are contained in the
     * specified collection (optional operation).  In other words, removes
     * from this list all of its elements that are not contained in the
     * specified collection.
     *
     * @param c collection containing elements to be retained in this list
     * @return <tt>true</tt> if this list changed as a result of the call
     * @throws UnsupportedOperationException if the <tt>retainAll</tt> operation
     *         is not supported by this list
     */
    public boolean retainAll(Collection<?> c)
    {
        System.out.println("ERROR - CANNOT REMOVE ELEMENTS FROM LOG");

        return false;
    }
}
