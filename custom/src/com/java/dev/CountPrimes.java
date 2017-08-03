package com.java.dev;

public class CountPrimes {

	public static void main(String[] args) {
		int num = 10;
		System.out.println(countPrimes(num));
	}
	private static int countPrimes(int num) {
		int count=0;
		for(int i=2;i<num;i++){
			if(checkPrime(i)){
				count++;
			}
		}
		return count;
		
	}
	public static boolean checkPrime(int n) {
		int m = (int) Math.sqrt(n);
		//for(int i=2; i*i<=n; i++){
		for(int i=2; i<=m; i++){
			if(n%i==0)
				return false;
		}
        return true;
    }
}
