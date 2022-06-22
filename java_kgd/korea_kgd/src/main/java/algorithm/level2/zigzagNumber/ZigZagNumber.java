package algorithm.level2.zigzagNumber;

public class ZigZagNumber {
	public static void main(String[] args) {
		// 4칸 5열의 배열을 작성한다.
		int a[][]= new int [4][5];
		
		// count: 
		int count = 0, start = 0, end = 4, sw = 1;
		
		//반복문을 사용하여 
		for(int i=0; i<4; i++) { 
				for(int j=start; j != end + sw; j+= sw) {  
					a[i][j] = ++count;
				}
				//정렬
				int temp = start;
				start = end;
				end = temp;
				sw *= -1;
		}			
		
		// 각 열과 행에 입력값을 주는 로직을 작성한다.
		for(int i=0; i<4; i++) { 
			for(int j=0; j<5; j++) {
				System.out.printf("%2d ", a[i][j]);
			}
			System.out.println();
		}
	}
}
