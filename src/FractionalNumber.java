/**
 * Created by debmduke on 2/7/19.
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
        return 0;
    }

    public int getDenominator(){
        return 1;
    }

    public void setNumerator(int num){

    }

    public void setDenominator(int denom){

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

    }

    /*
    *   Adds the paramter to this fractional number
    *   Precondition: this and otherNum are valid FractionalNumbers
    *   Postcondition: this is the sum of the two fractions
    *   Class Invariant: otherNum is not changed
    *   @param  otherNum    a FractionalNumber*/
    public void add(final FractionalNumber otherNum){
//        a/b + c/d = (a*d + b*c) / b*d
    }

    public void subtract(final FractionalNumber otherNum){

    }

    public void multiply(final FractionalNumber otherNum){

    }

    public void divide(final FractionalNumber otherNum){

    }

    /*
    *   @return     true if this fraction and other would reduce to the
    *               same numerator and denominator, false otherwise
    *   @param      other       a FractionalNumber  */
    @Override
    public boolean equals(Object other){
        return false;  
    }

    @Override
    public String toString(){
        return null;
    }
}
