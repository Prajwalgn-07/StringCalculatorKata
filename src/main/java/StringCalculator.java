import Utils.PropertyReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringCalculator {
    public int countOfAddMethodInvoked;
    public List<String>listOfNumbers;
    public PropertyReader propertyReader;

    public StringCalculator() throws IOException {
        this.countOfAddMethodInvoked=0;
        propertyReader=new PropertyReader("./src/main/resources/Conditions.properties");
    }

    public long Add(String numbers) throws IOException {
        this.countOfAddMethodInvoked+=1;
        if(numbers.isEmpty())
            return 0;
        splitNumberFromDelimiters(numbers);
        return new Numbers().sumOfNumbers();
    }

    public int GetCalledCount(){
        return this.countOfAddMethodInvoked;
    }

    public void splitNumberFromDelimiters(String number){
        String[] splitNumbers = number.split(propertyReader.getProperty("excludedDelimiters"));
        this.listOfNumbers = new ArrayList<>(Arrays.asList(splitNumbers));
        this.listOfNumbers.removeAll(Collections.singleton(""));
    }

    }

