/* Cracking the coding interview
 * Pre-work 
 * Pow(x,n)
 *
 * Method: get the x de n cifang
 */

public class Solution {
    public double pow(double x, int n) {
    	if(x == 0) {return 0;}

    	if(n < 0) {
    		return 1/power(x, -n);
    	} else {
    		return power(x,n);
    	}
    }

    public double power(double x, int n) {
    	if(n == 0) {
    		return 1;
    	}

    	double value = power(x, n/2);
    	if(n % 2 == 0) {
    		return value * value;
    	} else {
    		return value * value * x;
    	}
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */