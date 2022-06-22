package algorithm.level3.Libraryan;

public class BookManager {
	Book[] bList;
	int numberOfBooks;
	
	public BookManager(int numberOfBooks) {
		bList = new Book[numberOfBooks];
	}
	public int getNumberOfBooks() {
		return numberOfBooks;
	}
	public void insertBook(Book newBook) {
		for(int i=0; i<bList.length; i++) {
			if(bList[i] == null) {
				bList[i] = newBook;
				numberOfBooks++;
				break;
			}
		}
	}
public Book[] getAllBook() {
	Book[] temp = new Book[numberOfBooks];
	int i=0;
	for(Book b: bList) {
		if(b==null) {
			continue;
		}
		else if(b.equals(bList[i])) {
			temp[i] = b;
		}
		i++;
	}
	return temp;
}
public Book searchBook(String isbn) {
	Book temp = null;
	for(Book b:bList) {
		if(b != null) {
			if(b.getIsbn().equals(isbn)) {
				temp = b;
			}
		}
	}
	return temp;
}
public Book[] searchBookByTitle(String title) {
	int count = 0;
	int i = 0;
	Book[] temp1 = new Book[numberOfBooks];
	for(Book b : bList) {
		if(b !=null) {
			if(b.getTitle().equals(title)) {
				temp1[i++] = b;
				count++;
			}
		}
	}
	Book[] temp2 = new Book[count];
	for(int j=0; j<count; j++) {
		if(temp1[j] != null) {
			temp2[j] = temp1[j];
		}
	}
	return temp2;
}
public Book[] searchBookBypublisher(String publisher) {
	int count =0;
	int i = 0;
	Book[] temp1 = new Book[numberOfBooks];
	for(Book b: bList) {
		if(b != null) {
			if(b.getPublisher().equals(publisher)) {
				temp1[i++] =b;
				count++;
			}
		}
	}
	Book[] temp2 = new Book[count];
	for(int j=0; j<count; j++) {
		if(temp1[j] != null) {
			temp2[j] = temp1[j];
		}
	}
	return temp2;
}
public Book[] searchBook(double price) {
	int count = 0;
	int i=0;
	Book[] temp1 = new Book[numberOfBooks];
	for(Book b:bList) {
		if(b != null) {
			if(b.getPrice() == price) {
				temp1[i++] = b;
				count++;
			}
		}
	}
	Book[] temp2 = new Book[count];
	for(int j=0; j<count; j++) {
		temp2[j] = temp1[j];
	}
	return temp2;
}

public double getSumPriceOfBooks() {
	int total = 0;
	for(Book b : bList) {
		if(b != null) total += b.getPrice();
	}
	return total;
}
public double getAveragePriceOfBooks() {
	return getSumPriceOfBooks() / numberOfBooks;
}
}
