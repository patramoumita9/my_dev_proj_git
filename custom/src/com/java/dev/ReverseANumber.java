package com.java.dev;

public class ReverseANumber {

	public static void main(String[] args) {
		int num = 153423646;
		reverse(num);
	}
		
	public static int reverse(int num) {
		int r=0;
		long sum=0;
		while(num!=0) {
			r=num%10;
			sum=sum*10+r;
			num=num/10;
	  }
		if(sum>Integer.MAX_VALUE)
			return 0;
		if(sum<Integer.MIN_VALUE)
			return 0;
		return (int) sum;
	}

}
