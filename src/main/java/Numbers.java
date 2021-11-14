import java.io.IOException;

public class Numbers extends StringCalculator{
    private int totalSumOfNumbers;

    public Numbers() throws IOException {
        super();
        this.totalSumOfNumbers=0;
    }

    public int sumOfNumbers() {
        for(String number:listOfNumbers){
            int numberValue=parseStringToInt(number);
            try {
                if (numberValue < 0)
                    throw new IllegalArgumentException("Negative numbers are not allowed and the negative number is "+numberValue);
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            if(numberValue<parseStringToInt(propertyReader.getProperty("maxLimitForSum")))
                totalSumOfNumbers+=numberValue;
        }
        return totalSumOfNumbers;
    }
    public int parseStringToInt(String number){
        return Integer.parseInt(number);
    }
}
