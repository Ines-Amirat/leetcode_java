package main;

public class CalculatorImp implements Calculator  {
	@Override
	
	public int add(int a, int b) {
		int res = a;
		if (b > a) {
			while (b-- != 0) {
				res++;
			}
		} else if (b < 0) {

		}
		while (b++ != 0) {
			res--;
		}

		return res;
	}

	@Override
	public int multiply(int a, int b) {
		int res = a;
	    for(int i =0; i< b; i++) {
	    	 res = res+a ;
	    }
		
		return res;
	}

	@Override
	public int divide(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
