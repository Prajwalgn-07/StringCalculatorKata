import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringCalculator {
    private int countOfAddMethodInvoked=0;

    public long Add(String numbers) {
        this.countOfAddMethodInvoked+=1;
        long totalSum = 0;
        if(!numbers.isEmpty()) {
            String[] splitNumbers = numbers.split("[,\n//;]");
            List<String> listOfNumbers = new ArrayList<String>(Arrays.asList(splitNumbers));
            listOfNumbers.removeAll(Collections.singleton(""));
            for(String number:listOfNumbers){
                int value=Integer.parseInt(number);
                try {
                    if (value < 0)
                        throw new IllegalArgumentException("Negative numbers are not allowed and the negative number is "+value);
                }
                catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                if(value<1000)
                    totalSum+=value;
            }
        }
        return totalSum;
        }
    public int GetCalledCount(){
        return this.countOfAddMethodInvoked;
    }
    }

