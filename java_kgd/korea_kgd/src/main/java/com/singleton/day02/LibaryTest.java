package com.singleton.day02;

/**
 * 
 * @author ksd49
 *
대학의 모든 도서정보는 하나의 도서관(저장소)에 보관 및 등록된다
각 학과(학부)에서 구매한 책들은 모두 이 도서관 도서정보에 등록되어야 한다
책을 대출할 때 책의 고유번호를 통해 검색되어 대출된다
도서관에서 책을 보관할 수 있는 정보의 최대치는 100권이며 초과시 자동으로 이전 저장소 크기의 2배로 증가된다

도서관 = Library
책 = Book
책 정보 등록 = addBook(Book book)
책 대출 = getBook(int serial)

- 도서관 보관 및 등록 = Library 클래스 + 한곳에 등록되어져야 한다.
- 구매한 책 모두 같은 곳을 참조해야한다.
- 보관정보 최대치는 100권 / 초과시 2배
 */

public class LibaryTest {
	public static void main(String[] args) {
		// Libary 객체를 생성한다.
		Libary lib = Libary.getLibary();
		Libary lib2 = Libary.getLibary();
		 
		// 반복문을 이용하여 동일값인 비교한다.
		for(int i = 0; i < 200; i++) {
			lib.addBook(new Book("어린왕자", i));	
			lib2.addBook(new Book("hello", 1234));
		}

		//동일값인지 확인하는 출력
		System.out.println(lib2.toString());
		System.out.println(lib.getBook(0));
		System.out.println(lib2.getBook(5));
		System.out.println(lib.toString());
	}
}
