import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.List;

public class Numbers {

    public int sumOfNumbers(List<String>listOfNumbers){
        int totalSumOfNumbers=0;
        for(String number:listOfNumbers){
            int value=parseNumberFromStringToInt(number);
            try {
                if (value < 0)
                    throw new IllegalArgumentException("Negative numbers are not allowed and the negative number is "+value);
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            if(value<1000)
                totalSumOfNumbers+=value;
        }
        return totalSumOfNumbers;
    }
    public int parseNumberFromStringToInt(String number){
        return Integer.parseInt(number);
    }
}
