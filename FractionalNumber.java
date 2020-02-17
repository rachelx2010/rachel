package cmsc355;
/**
 * Rachel Xing
 * CMSC 355
 * Individual Assignment 3
 * 2/11/20
 */
public class FractionalNumber {
    private int numerator;
    private int denominator;

    /*
    *   Sets default values for numerator & denominator */
    public FractionalNumber(){
        numerator = 1;
        denominator = 1;
    }
    
    public int getNumerator(){
        return this.numerator;
    }

    public int getDenominator(){
        return this.denominator;
    }

    public void setNumerator(int num){
    	this.numerator = num;

    }

    public void setDenominator(int denom) throws IllegalArgumentException {
    	if (denom == 0) {
    		throw new IllegalArgumentException("Denominator cannot be 0.");
    	}
    	this.denominator = denom;
    }

    /*
        Precondition: denominator cannot be 0
        @param num      the numerator of the fraction
        @param denom    the denominator of the fraction, may not be 0 */
    public FractionalNumber(int num, int denom){
        if(denom == 0)
            throw new IllegalArgumentException("Denominator cannot be 0.");
        numerator = num;
        denominator = denom;
    }

    /*
    *   Adjusts the sign of the numerator and denominator so the
    *   denominator is positive, if necessary */
    private void normalize(){
    	if (denominator < 0 && numerator > 0) {
    		numerator *= -1;
    		denominator *= -1;
    	} 
    	if (denominator < 0 && numerator < 0) {
    		numerator *= -1;
    		denominator *= -1;
    	}

    }

    /*
    *   Adds the paramter to this fractional number
    *   Precondition: this and otherNum are valid FractionalNumbers
    *   Postcondition: this is the sum of the two fractions
    *   Class Invariant: otherNum is not changed
    *   @param  otherNum    a FractionalNumber*/
    public void add(final FractionalNumber otherNum){
//        a/b + c/d = (a*d + b*c) / b*d
    	//a = numberator and b = denominator and etc
    	this.numerator = (this.numerator * otherNum.getDenominator() + this.denominator * otherNum.getDenominator());
    	this.denominator = this.denominator * otherNum.getDenominator();
    }

    public void subtract(final FractionalNumber otherNum){
    	//a/b – c/d = (a*d – b*c) / b*d
    	this.numerator = (this.numerator * otherNum.getDenominator() - this.denominator*otherNum.getNumerator());
    	this.denominator = this.denominator * otherNum.getDenominator();

    }

    public void multiply(final FractionalNumber otherNum){
    	//a/b * c/d = a*c / d*b
    	this.numerator = this.numerator * otherNum.getNumerator();
    	this.denominator = this.denominator * otherNum.getDenominator();

    }

    public void divide(final FractionalNumber otherNum) throws IllegalArgumentException{
    	//(a/b) / (c/d) = a*d / b*c, where c/d ≠ 0
    	if (otherNum.getNumerator() == 0 || otherNum.getDenominator() == 0) {
    		throw new IllegalArgumentException("Numerator and/or denominator cannot be 0.");
    	}
    	this.numerator = this.numerator * otherNum.getDenominator();
    	this.denominator = this.denominator * otherNum.getNumerator();
    }

    /*
    *   @return     true if this fraction and other would reduce to the
    *               same numerator and denominator, false otherwise
    *   @param      other       a FractionalNumber  */
    @Override
    public boolean equals(Object other){ // Two rational numbers a/b and c/d are equal if a*d equals c*b. 
        if(this.numerator * ((FractionalNumber) other).getDenominator() == this.denominator * ((FractionalNumber) other).getNumerator()) {
        	return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return this.numerator + "/" + this.denominator;
    }
}
