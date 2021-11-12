import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringCalculator {
    private int countOfAddMethodInvoked=0;

    public long Add(String numbers) {
        this.countOfAddMethodInvoked+=1;
        if(numbers.isEmpty())
            return 0;
        List<String>listOfNumbers=splitNumberFromDelimiters(numbers);
        return new Numbers().sumOfNumbers(listOfNumbers);
    }

    public int GetCalledCount(){
        return this.countOfAddMethodInvoked;
    }

    public List<String> splitNumberFromDelimiters(String number){
        String[] splitNumbers = number.split("[,\n//;]");
        List<String> listOfNumbers = new ArrayList<String>(Arrays.asList(splitNumbers));
        listOfNumbers.removeAll(Collections.singleton(""));
        return listOfNumbers;
    }

    }

