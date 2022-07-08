package algorithm.dataStructure.level4;

/**
 * 
 * @author Administrator
 * 스택 + 재귀알고리즘-재귀의제거
 */
public class IntStack {
	private int[] stk; //스택용배열
	private int capacity; //스택용량
	private int ptr; // 스택포인터
	
	//재귀를 제거
	static void recur(int n) {
		IntStack s = new IntStack(n);
		
		while(true) {
			//n이 0보다 크면 s에 n을 푸시
			if(n>0) {
				s.push(n);
				n = n-1;
				continue;
			}
			//스택이 비어있지 않으면 저장하고 있던 스택값을 팝.
			if(s.isEmpty() != true) {
				n = s.pop();
				System.out.println(n);
				n = n-2;
				continue;
			}
			break;
		}
	}
	
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	public class OverflowintStackException extends RuntimeException{
		public OverflowintStackException() {}
	}
	
	public IntStack(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity];
		}catch(OutOfMemoryError e) {
			capacity = 0;
		}
	}
	public int push(int x) throws OverflowintStackException{
		if(ptr >= capacity) { 
			throw new OverflowintStackException();
		}
		return stk[ptr++] = x;
	}
	public int pop() throws EmptyIntStackException{
		if(ptr <= 0) { 
			throw new EmptyIntStackException();
		}
		return stk[--ptr];
	}
	public int peek() throws EmptyIntStackException{
		if(ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[ptr - 1];
	}
	
	public void clear() {
		ptr = 0;
	}
	public int indexOf(int x) {
		for(int i=ptr-1; i>=0; i--) {
			if(stk[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int size() {
		return ptr;
	}
	
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	public boolean isFull() {
		return ptr >= capacity;
	}
	
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
