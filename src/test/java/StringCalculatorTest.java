import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {
    StringCalculator stringCalculator=new StringCalculator();
    @Test
    public void emptyStringTest(){
        Assert.assertEquals(0,stringCalculator.Add(""));
    }
}
