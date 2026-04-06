
public class Solution {
	public static void main(String[] args) throws InvalidCouponException{
		Product obj = new Product("Iphone", 25000, "Iphone-10");
		Validator val = new Validator();
		System.out.println(val.validateCoupon(obj));
		System.out.println(val.netPrice(obj));
	}
}
