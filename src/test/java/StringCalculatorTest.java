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
}
