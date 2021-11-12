import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {
    StringCalculator stringCalculator=new StringCalculator();
    @Test
    public void emptyStringTest(){
        Assert.assertEquals(0,stringCalculator.Add(""));
    }
    @Test
    public void singleNumberTest(){
        Assert.assertEquals(2,stringCalculator.Add("2"));
    }
    @Test
    public void twoNumbersTest(){
        Assert.assertEquals(28,stringCalculator.Add("25,3"));
    }
    @Test
    public void largeNumberTest(){
        Assert.assertEquals(2486,stringCalculator.Add("234,543,376,789,544"));
    }
    @Test
    public void newLineAndCommaInStringTest(){
        Assert.assertEquals(6,stringCalculator.Add("1\n2,3"));
    }
    @Test
    public void differentDelimitersTest(){
        Assert.assertEquals(3,stringCalculator.Add("//;\n1;2"));
    }
    @Test
    public void singleNegativeNumberTest(){
        stringCalculator.Add("//;-1;2");
    }
    @Test
    public void moreNegativeNumbersTest(){
        stringCalculator.Add(";;//-1,-3");
    }
    @Test
    public void numberOfTimesAddMethodInvoked(){
        stringCalculator.Add("");
        stringCalculator.Add("2");
        stringCalculator.Add("1\n2,3");
        stringCalculator.Add("25,3");
        Assert.assertEquals(4,stringCalculator.GetCalledCount());
    }
}
