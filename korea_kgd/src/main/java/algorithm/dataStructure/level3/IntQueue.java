package algorithm.dataStructure.level3;

/**
 * 
 * @author Administrator
 * 필드que는 실제로는 배열본체가 아니라 본체를 참조하는 배열변수이다. 
 * 배열본체는 생성자로 한다.
 */
public class IntQueue {
	private int[] que; // 큐 배열
	private int capacity; // 큐 용량
	private int front; // 맨앞의 요소 커서
	private int rear; // 맨뒤의 요소 커서
	private int num; //현재데이터 갯수
	
	//실행시 예외: 큐가 비어있음
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	
	// 실행시 예외: 큐가 가득 참
	public class OverflowintQueueException extends RuntimeException{
		public OverflowintQueueException() {}
	}
	
	public IntQueue(int maxlen) {
		num = front = rear = 0;
		capacity = maxlen;
		try {
			que = new int [capacity]; //큐 본체용 배열 생성
		}catch(OutOfMemoryError e){
			capacity = 0; //생성할 수 없음.
		}
	}
	//큐에 데이터를 인큐
	public int enque(int x) throws OverflowintQueueException{
		//큐가 가득참.
		if(num >= capacity) {
			throw new OverflowintQueueException(); 
		}
		que[rear++] = x;
		num++;
		if(rear == capacity) {
			rear = 0;
		}
		return x;
	}
	
	//큐에서 데이터를 디큐
	public int deque() throws EmptyIntQueueException{
		//큐가 비어있음.
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		int x = que[front++];
		num--;
		if(front == capacity) {
			front = 0;
		}
		return x;
	}
	
	//큐에서 데이터를 피크(프런트데이터를 들여다봄)
	public int peek() throws EmptyIntQueueException{
		//큐가 비어있음
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		return que[front];
	}
	//큐를 비움
	public void clear() {
		num = front = rear = 0;
	}
	
	//큐에서 x를 검색하여 인덱스를 반환 / 찾지못하면 -1반환
	public int indexOf(int x) {
		for(int i=0; i<num; i++) {
			int idx = (i+front) % capacity;
			if(que[idx] == x) { //검색성공
				return idx;
			}
		}
		return -1; //검색실패
	}
	//큐의 용량을 반환
	public int getCapacity() {
		return capacity;
	}
	//큐에 쌓여있는 데이터 갯수를 반환
	public int size() {
		return num;
	}
	//큐가 비어있는지
	public boolean isEmpty() {
		return num <= 0;
	}
	//큐가 가드찼는지
	public boolean isFull() {
		return num >= capacity;
	}
	//큐 안에 모든 데이터를 프런트 -> 리어 순으로 출력
	public void dump() {
		if(num <= 0) {
			System.out.println("큐가 비어있습니다.");
		}else {
			for(int i=0; i < num; i++) {
				System.out.println(que[(i + front) % capacity] + " ");
			}
			System.out.println();
		}
	}
}
