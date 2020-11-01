import java.util.*;

public class LogElement<E> implements Iterator<E>
{
    private LogElement<E> next;
    private LogElement<E> prev;
    private E data;

    public LogElement(E input)
    {
        data = input;
    }

    public LogElement<E> getNext()
    {
        return this.next;
    }

    public LogElement<E> getPrev()
    {
        return this.prev;
    }

    public E getData()
    {
        return this.data;
    }

    public void setNext(LogElement<E> input)
    {
        this.next = input;
    }

    public void setPrev(LogElement<E> input)
    {
        this.prev = input;
    }

    public void setData(E input)
    {
        this.data = input;
    }

    public boolean hasNext()
    {
        if(this.next != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public E next()
    {
        return this.next.data;
    }
}