import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringCalculator {
    private int countOfAddMethodInvoked;
    private List<String>listOfNumbers;

    public StringCalculator(){
        this.countOfAddMethodInvoked=0;
    }

    public long Add(String numbers) {
        this.countOfAddMethodInvoked+=1;
        if(numbers.isEmpty())
            return 0;
        splitNumberFromDelimiters(numbers);
        return new Numbers().sumOfNumbers(listOfNumbers);
    }

    public int GetCalledCount(){
        return this.countOfAddMethodInvoked;
    }

    public void splitNumberFromDelimiters(String number){
        String[] splitNumbers = number.split("[,\n//;]");
        this.listOfNumbers = new ArrayList<String>(Arrays.asList(splitNumbers));
        this.listOfNumbers.removeAll(Collections.singleton(""));
    }

    }

