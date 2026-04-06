
public class Validator {
	public String validateCoupon(Product p) throws InvalidCouponException{
		String data[] = p.coupon.split("-");
		int disc = Integer.parseInt(data[1]);
		String op;
		try {
			if(data[0].equals(p.name) && (disc >= 10 || disc <= 25)) {
				throw new InvalidCouponException("Valid Coupon");
			}
			throw new InvalidCouponException("Invalid Coupon");
		}catch(InvalidCouponException e) {
			op = e.getMessage();
		}
		return op;
	}
	public double netPrice(Product p) throws InvalidCouponException {
		double pr = 0.0;
		try{
			String test = validateCoupon(p);
			String data[] = p.coupon.split("-");
			double discount = Integer.parseInt(data[1]);
			if(test.endsWith("Valid Coupon")) {
				pr = p.price-((p.price*discount)/100);
			}else {
				pr = p.price-((p.price*0)/100);
			}
			
		}catch(InvalidCouponException e) {
			return 0.0;
		}
		return pr;
		
		
	}
}
