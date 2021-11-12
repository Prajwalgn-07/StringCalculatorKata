import java.nio.channels.Channel;
import java.util.Arrays;

public class StringCalculator {

    public int Add(String numbers) {
        int totalSum = 0;
        if(!numbers.isEmpty()) {
            String[] splitNumbers = numbers.split(",");
            for(String number:splitNumbers){
                totalSum+=Integer.parseInt(number);
            }
        }
        return totalSum;
        }
    }

