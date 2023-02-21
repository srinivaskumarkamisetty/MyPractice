package practice;

public class ReverseNumberTest {
	public static void main(String[] args) {
		ReverseNumber obj=new ReverseNumber();
		int n=obj.ScanNvalue();
		int value=obj.GetReverseValue(n);
		int Number=obj.DisplayValue(value);
		boolean status=obj.IsPalindrome(n, value);
		obj.DisplayPalindrome(status);

}
}