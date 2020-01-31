package pl.dev.java.essentials;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.dev.java.essentials.other.generics.GenericExample;

import java.util.Objects;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaEssentialsApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void converters() {
        Integer[] ints = {1,2,3,4};
        GenericExample.fromArrayToList(ints, Objects::toString);
    }

}
