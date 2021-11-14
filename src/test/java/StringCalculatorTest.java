import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class StringCalculatorTest {
    StringCalculator stringCalculator;

    public StringCalculatorTest() throws IOException {
        stringCalculator=new StringCalculator();
    }

    @Test
    public void emptyStringTest() throws IOException {
        Assert.assertEquals(0,stringCalculator.Add(""));
    }
    @Test
    public void singleNumberTest() throws IOException {
        Assert.assertEquals(2,stringCalculator.Add("2"));
    }
    @Test
    public void twoNumbersTest() throws IOException {
        Assert.assertEquals(28,stringCalculator.Add("25,3"));
    }
    @Test
    public void largeNumberTest() throws IOException {
        Assert.assertEquals(2486,stringCalculator.Add("234,543,376,789,544"));
    }
    @Test
    public void newLineAndCommaInStringTest() throws IOException {
        Assert.assertEquals(6,stringCalculator.Add("1\n2,3"));
    }
    @Test
    public void differentDelimitersTest() throws IOException {
        Assert.assertEquals(3,stringCalculator.Add("//;\n1;2"));
    }
    @Test
    public void singleNegativeNumberTest() throws IOException {
        stringCalculator.Add("//;-1;2");
    }
    @Test
    public void moreNegativeNumbersTest() throws IOException {
        stringCalculator.Add(";;//-1,-3");
    }
    @Test
    public void numberOfTimesAddMethodInvoked() throws IOException {
        stringCalculator.Add("");
        stringCalculator.Add("2");
        stringCalculator.Add("1\n2,3");
        stringCalculator.Add("25,3");
        Assert.assertEquals(4,stringCalculator.GetCalledCount());
    }
    @Test
    public void ignoringValuesGreaterThan1k() throws IOException {
        Assert.assertEquals(2,stringCalculator.Add("//1001;2"));
    }
}
