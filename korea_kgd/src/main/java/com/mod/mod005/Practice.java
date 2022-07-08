package com.mod.mod005;

public class Practice {

	public static void main(String[] args) {
		int [] nums = new int[5];
		int [] number = new int[5];
		nums[0] = 1; nums[1] = 2; nums[2] = 3; nums[3] = 4;	nums[4] = 5;
		number[0] = 4; number[1] = 5; number[2] = 6; number[3] = 7; number[4] = 8;
		
			for(int i=0; i<nums.length; i++) {
				for(int j=0; j<number.length; j++) {
					if(nums[0] == number[j]) {
						System.out.println("nums 1은 number에 포함된다.");
					}else if(nums[1] == number[j]) {
						System.out.println("nums 2는 number에 포함된다");
					}else if(nums[2] == number[j]) {
						System.out.println("nums 3은 number에 포함된다");
					}else if(nums[3] == number[j]) {
						System.out.println("nums 4는 number에 포함된다");
					}else if(nums[4] == number[j]) {
						System.out.println("nums 5는 number에 포함된다");
					}else {
						System.out.println("아무것도 포함되지 않는다.");
					}
				}
			}			
		
	}
}
