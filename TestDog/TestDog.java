
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestDog {

    @Test
 public void TestDog(){
        Animal d1 = new Dog();
        assertEquals("Bark",d1.makeSound());
        assertEquals("I'm running!",d1.move());

    }


    @Test
    public void TestDogBark(){
        Dog d1 = new Dog();
       assertEquals("I chewed up your Homework ;)", d1.misbehave("Homework"));

    }
    }



