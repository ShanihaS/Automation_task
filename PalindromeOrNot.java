package week1.day3;

public class PalindromeOrNot {
	public static void main(String[] args) {
		int num = 34343;
		int temp = num ;
		int reversed= 0;
		
		while(num!=0) {
		int digit= num % 10;
		reversed= reversed * 10 + digit;
		num=num/10;
		}
		
		if(temp==reversed) {
			System.out.println(temp+" is a palindrome.");
		}
		else {
			System.out.println(temp+" is not a palindrome.");
		}
		
}

}
