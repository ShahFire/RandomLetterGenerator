import org.junit.jupiter.api.Test;

public class GeneratorTest {
    @Test
    public void test(){
        String str = StringGenerator.generateLatin(50);
        System.out.println(str);
    }
}
