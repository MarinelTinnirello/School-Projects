import java.lang.Math;

public class Derivative
{
    String polynomial;

    public Derivative(String polynomial)
    {
        this.polynomial = polynomial;
    }

    public String calculateDerivative(String term) {

        String coef = "";

        for(int i = 0; i < term.length(); i++)
        {
            if(term.charAt(i) != 'x' && Character.isDigit(term.charAt(i)))
            {
                coef += Character.toString(term.charAt(i));
            }
            else
            {
                break;
            }
        }

        int coefInt = 0;

        if(coef.length() > 0)
        {
            coefInt = Integer.parseInt(coef);
        }

        String power = "";
        String powerTerm = "1";

        if(term.indexOf("^") != -1)
        {
            powerTerm = term.substring(term.indexOf("^")+1, term.length());
        }

        for(int i=0;i<powerTerm.length();i++)
        {
            if(Character.isDigit(powerTerm.charAt(i)))
            {
                power += Character.toString(powerTerm.charAt(i));
            }
            else
            {
                break;
            }
        }

        int powerInt = 0;

        if(power.length() > 0)
        {
            powerInt = Integer.parseInt(power);
        }

        coefInt = coefInt * powerInt;
        powerInt--;

        if(powerInt == 0)
        {
            return "" + coefInt;
        }
        else if(powerInt == 1)
        {
            return coefInt + "x";
        }
        else
        {
            return coefInt + "x^" + powerInt;
        }
    }

    public String readDerivative()
    {
        String ans = "";
        String term = "";

        for(int i = 0; i < polynomial.length(); i++)
        {
            if(polynomial.charAt(i) == '+' || polynomial.charAt(i) == '-')
            {
                ans += calculateDerivative(term);
                ans += String.valueOf(polynomial.charAt(i));
                term = "";
            }
            else
            {
                if(polynomial.charAt(i) != ' ')
                {
                    term += Character.toString(polynomial.charAt(i));
                }
            }
        }

        ans += calculateDerivative(term);
        term = "";

        return ans.substring(0, ans.length());
    }
}
