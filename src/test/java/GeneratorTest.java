import org.junit.jupiter.api.Test;

public class GeneratorTest {
    @Test
    public void test(){
        String str = StringGenerator.generateLatin(50);
        System.out.println(str);
    }
    @Test
    public void test2(){
        String str = StringGenerator.generateRussian(50);
        System.out.println(str);
    }
}
