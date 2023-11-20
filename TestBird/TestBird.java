import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TestBird {

    @Test
    public void TestBird(){
        Animal b1 = new Bird();
        assertEquals("Chirp",b1.makeSound());
        assertEquals("I am flying",b1.move());

    }


}
