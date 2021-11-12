
public class StringCalculator {

    public long Add(String numbers) {
        long totalSum = 0;
        if(!numbers.isEmpty()) {
            String[] splitNumbers = numbers.split("[,\n]");
            for(String number:splitNumbers){
                totalSum+=Integer.parseInt(number);
            }
        }
        return totalSum;
        }
    }

