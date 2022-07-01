package algorithm.dataStructure.level3;

public class IntStack {
	private int[] stk; //스택용배열
	private int capacity; //스택용량
	private int ptr; // 스택포인터
	
	//실행시 예외: 스택이 비어있음
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	// 실행시 예외: 스택이 가득 참
	public class OverflowintStackException extends RuntimeException{
		public OverflowintStackException() {}
	}
	
	//생성자 생성
	public IntStack(int maxlen) {
		//값 할당
		ptr = 0;
		capacity = maxlen;
		try {
			//스택 본체 배열
			stk = new int[capacity];
			//생성할 수 없음
		}catch(OutOfMemoryError e) {
			capacity = 0;
		}
	}
	//스택에 x를 푸시
	public int push(int x) throws OverflowintStackException{
		//스택이 가득찼을시 오류발생시키기
		if(ptr >= capacity) { 
			throw new OverflowintStackException();
		}
		return stk[ptr++] = x;
	}
	//스택에서 데이터를 팝(꼭대기에 있는 데이터를 꺼냄)
	public int pop() throws EmptyIntStackException{
		//스택이 가득찼을시 오류발생시키기
		if(ptr <= 0) { 
			throw new EmptyIntStackException();
		}
		return stk[--ptr];
	}
	//스택에서 데이터를 피크(꼭대기에 있는 데이터를 들여다봄)
	public int peek() throws EmptyIntStackException{
		//스택이 비어있음
		if(ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[ptr - 1];
	}
	
	//스택을 비움
	public void clear() {
		ptr = 0;
	}
	//스택에서 x를 찾아 인덱스를 반환
	public int indexOf(int x) {
		//꼭대기부터 선형검색 / 검색이 성공한다면 i를 리턴 실패한다면 -1을 리턴
		for(int i=ptr-1; i>=0; i--) {
			if(stk[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	//스택의 용량을 반환
	public int getCapacity() {
		return capacity;
	}
	
	//스택에 쌓여있는 데이터 갯수를 반환
	public int size() {
		return ptr;
	}
	
	//스택이 비어있는가?
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	//스택이 가득 찼을경우 
	public boolean isFull() {
		return ptr >= capacity;
	}
	
	//스택안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump() {
		if(ptr <= 0) {
			System.out.println("스택이 비어있습니다.");
		}else {
			for(int i=0; i<ptr; i++) {
				System.out.println(stk[i] + " ");
			}
			System.out.println();
		}
	}
}
