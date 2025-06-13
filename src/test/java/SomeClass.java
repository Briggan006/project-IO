import org.junit.Test;

public class SomeClass {


    @Test
    public void test1(){
        int value = 2/0;
        int value2 = 3;
        assert value + value2 == 5;
    }

    @Test
    public void test2(){
        int y = 1;
        int x = 2;
        assert x-y == 1;
    }
}
