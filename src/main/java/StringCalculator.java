public class StringCalculator {

    public int Add(String numbers) {
        int totalSum = 0;
        if (numbers.isEmpty()){
            totalSum = 0;
        }
        else{
            int integerValue=Integer.parseInt(numbers);
            totalSum+=integerValue;
        }
        return totalSum;
    }
}
