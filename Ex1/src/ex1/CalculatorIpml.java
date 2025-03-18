package ex1;

public class CalculatorIpml implements Calculator{

	@Override
	public int add(int a, int b) {
		int res = a;
		if(b > 0) {
			while(b-- != 0)
				res++;
			
		} else if (b < 0) {
			while(b++ != 0)
				res--;
		}
		
		return res;
	}

	@Override
	public int multiply(int a, int b) {
		if (a == 0 || b == 0) return 0;
	    
		boolean isNegative = false;
		if (a < 0) {
			 isNegative = !isNegative;
	        a = -a;
	    }
	    if (b < 0) {
	    	isNegative = !isNegative;
	        b = -b;
	    }
        
	    int res = 0;

	    for (int i = 0; i < b; i++) 
	        res += a;

	    if (isNegative) {
	        res = -res;
	    }
	    
	    return res;
	}

	@Override
	public int divide(int a, int b) {
	    if (b == 0) {
	        throw new ArithmeticException();
	    }

	    boolean resEstNegatif = false;
	    int res = 0;

	    if (a < 0) {
	        resEstNegatif = !resEstNegatif;
	        a = -a;
	    }
	    if (b < 0) {
	        resEstNegatif = !resEstNegatif;
	        b = -b;
	    }

	    while (a >= b) { // Correction : a > 0 devient a >= b
	        a = substract(a, b); // Correction : "substract" devient "subtract"
	        res++;
	    }

	    if (resEstNegatif) {
	        res = -res;
	    }

	    return res;
	}


	@Override
	public int substract(int a, int b) {
		if (b > 0) {
	        while (b != 0) {
	            a = add(a, -1);
	            b = add(b, -1);
	        }
	    } else {
	        while (b != 0) {
	            a = add(a, 1);
	            b = add(b, 1);
	        }
	    }
	    return a;
	}
}
