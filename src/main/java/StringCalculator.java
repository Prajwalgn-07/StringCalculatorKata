import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringCalculator {

    public long Add(String numbers) {
        long totalSum = 0;

        if(!numbers.isEmpty()) {
            String[] splitNumbers = numbers.split("[,\n//;]");
            List<String> listOfNumbers = new ArrayList<String>(Arrays.asList(splitNumbers));
            listOfNumbers.removeAll(Collections.singleton(""));
            for(String number:listOfNumbers){
                totalSum+=Integer.parseInt(number);
            }
        }
        return totalSum;
        }
    }

