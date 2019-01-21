package CustpmList.naztech3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

public class CustomArrayList<E> {
	int size;
	int position;
	Object[] myList;
	final int allocateSize = 10;
	
	public CustomArrayList() {
		size = 5;
		position = 0;
		myList = new Object[size];
	}

	public CustomArrayList<E> add(E e) {
		if (position == size) {
			newAllocation(allocateSize);
		}
		myList[position] = e;
		position++;
		return this;
	}

	public CustomArrayList<E> addAt(int a, E e) {
		position++;
		if (myList[a] != null) {
			for (int i = a; i <= position; i++) {
				myList[a + 1] = myList[a];
			}
			myList[a] = e;
		}

		myList[a] = e;
		return this;
	}
	
	public CustomArrayList<E> addAll(Book[] book){
		if (book.length + position > size) {
            newAllocation(book.length + position - size);
        }
//		for(int i=position;i<=position+book.length;i++)
//		{
//			add(book);
//		}
//        
        position += book.length;
		return this;
	}

	public int find(E object) {
		int pos = -1;
		for (int i = 0; i < position; i++)
			if (myList[i].equals(object))
				return i;
		return pos;
	}
	public CustomArrayList<E> replace(int i,E e){
		myList[i]=e;
		return this;
		
	}

	public E get(int i) {
		return (E) myList[i];
	}

	public Object remove(E object) {
		int pos = find(object);
		if (pos < 0) {
			return NullPointerException.class;
		} else if (pos > position) {
			return ArrayIndexOutOfBoundsException.class;
		} else if (pos == -1) {

		} else {
			System.arraycopy(myList, pos + 1, myList, pos, position - pos - 1);
			position--;
			myList[position] = null;
		}
		return true;
	}

	public CustomArrayList<E> removeAt(int a) {
		position--;
		if (myList[a] != null) {
			for (int i = a; i <= position; i++) {
				myList[a] = myList[a + 1];
			}
		}
		return this;
	}

	private boolean newAllocation(int allocateSize) {
		size += allocateSize;
		myList = Arrays.copyOf(myList, size);
		return true;
	}

	public int size() {
		return position;
	}

	public boolean contains(E e) {
		for (int i = 0; i < position; i++)
			if (myList[i].equals(e))
				return true;
		return false;

	}

	public void clear() {

		position = 0;
		size = 5;
		myList = (Book[]) new Object[5];
	}

}
