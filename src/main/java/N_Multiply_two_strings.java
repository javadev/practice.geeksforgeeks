import java.math.*;

public class N_Multiply_two_strings
{
    public String multiply(String a,String b){
        return String.valueOf(new BigInteger(a).multiply(new BigInteger(b)));
    }
}
