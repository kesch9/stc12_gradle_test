package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SummatorTest {

    private Summator summator;

    @BeforeAll
    static void beforeTest(){
        System.out.println("This is BeforeAll");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("This is BeforeEach");
        summator = new Summator();
    }

    @Test
    public void sumTest(){
        int sum = this.summator.summ(1,2);
        Assertions.assertEquals(3,sum);
    }

    @Test
    public void doSomeTest(){
        Assertions.assertThrows(RuntimeException.class,() -> this.summator.doSome(5));
    }

}
