package CustpmList.naztech3;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CustomArrayListTest {

	@Test
	public void addFunctionTest() {
		CustomArrayList<Book> lst = new CustomArrayList<Book>();

		lst.add(new Book("rahim", "plant Story", 1585, LocalDate.of(2012, 03, 24), 800));
		assertEquals(new Book("rahim", "plant Story", 1585, LocalDate.of(2012, 03, 24), 800), lst.get(0));

	}

	@Test
	public void addAtFunctionTest() {
		CustomArrayList<Book> lst = initialList();

		lst.addAt(0, new Book("rahim", "plant Story", 1585, LocalDate.of(2012, 03, 24), 800));
		assertEquals(new Book("rahim", "plant Story", 1585, LocalDate.of(2012, 03, 24), 800), lst.get(0));

	}
//	@Test
//	public void addAllFunctionTion() {
//		
//		CustomArrayList<Book> lst = initialList();
//		Book[] book= new Book[2];
//		book[0]= new Book("rahim", "plant Story", 1585, LocalDate.of(2012, 03, 24), 800);
//		book[1]= new Book("Jahid", "Story", 1356, LocalDate.of(1995, 05, 20), 500);
//		int changedLength=lst.size()+2;
//		lst.addAll(book);
//		
//		assertEquals(changedLength, lst.size());
//				
//	}
	
	@Test
	public void replaceFunctionTest() {
		CustomArrayList<Book> lst = initialList();
		lst.replace(2,new Book("Jahid", "Story", 1356, LocalDate.of(1995, 05, 20), 500));
		assertEquals(new Book("Jahid", "Story", 1356, LocalDate.of(1995, 05, 20), 500), lst.get(2));

	}

	@Test
	public void findFunctionTest() {
		CustomArrayList<Book> lst = initialList();

		assertEquals(1, lst.find(new Book("faisal", "Animal Story", 1258, LocalDate.of(1995, 05, 20), 300)));

	}

	@Test
	public void getFunctionTest() {
		CustomArrayList<Book> lst = initialList();
		lst.find(new Book("faisal", "Animal Story", 1258, LocalDate.of(1995, 05, 20), 300));
		assertEquals(new Book("faisal", "Animal Story", 1258, LocalDate.of(1995, 05, 20), 300), lst.get(1));

	}

	@Test
	public void removeFunctionTest() {
		CustomArrayList<Book> lst = initialList();
		lst.remove(new Book("faisal", "Animal Story", 1258, LocalDate.of(1995, 05, 20), 300));
		assertEquals(false, lst.contains(new Book("faisal", "Animal Story", 1258, LocalDate.of(1995, 05, 20), 300)));

	}

	@Test
	public void removeAtFunctionTest() {
		CustomArrayList<Book> lst = initialList();
		lst.removeAt(1);
		assertEquals(false, lst.contains(new Book("faisal", "Animal Story", 1258, LocalDate.of(1995, 05, 20), 300)));
	}
	
	@Test
	public void removeAllFunctionTion() {
		
	}

	public static CustomArrayList<Book> initialList() {

		CustomArrayList<Book> list = new CustomArrayList<Book>();
		list.add(new Book("shoab", "Human Story", 1256, LocalDate.of(1995, 03, 24), 500));
		list.add(new Book("faisal", "Animal Story", 1258, LocalDate.of(1995, 05, 20), 300));
		list.add(new Book("toma", "Hunger Story", 1268, LocalDate.of(2011, 05, 20), 1100));
		list.add(new Book("muna", "Brew Story", 1548, LocalDate.of(2011, 05, 20), 400));
		
		return list;

	}

}
