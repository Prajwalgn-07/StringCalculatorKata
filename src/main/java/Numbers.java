import java.util.List;

public class Numbers {
    private int totalSumOfNumbers;

    public Numbers(){
        this.totalSumOfNumbers=0;
    }

    public int sumOfNumbers(List<String>listOfNumbers){
        for(String number:listOfNumbers){
            int numberValue=parseStringToInt(number);
            try {
                if (numberValue < 0)
                    throw new IllegalArgumentException("Negative numbers are not allowed and the negative number is "+numberValue);
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            if(numberValue<1000)
                totalSumOfNumbers+=numberValue;
        }
        return totalSumOfNumbers;
    }
    public int parseStringToInt(String number){
        return Integer.parseInt(number);
    }
}
