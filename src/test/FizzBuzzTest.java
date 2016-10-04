package test;

import main.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void Print_Numbers_Within_Range()
    {
        assertEquals("1,2",fizzBuzz.printNumbers(1,2));
    }

    @Test
    public void Print_Fizz_If_Number_DivisibleBy_Three()
    {
        assertEquals("1,2,Fizz,4",fizzBuzz.printNumbers(1,4));
    }

    @Test
    public void Print_Buzz_If_Number_DivisibleBy_Five()
    {
        assertEquals("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz",fizzBuzz.printNumbers(1,10));
    }

    @Test
    public void Print_FizzBuzz_If_Number_DivisibleBy_ThreeAndFive()
    {
        assertEquals("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,Fizz,14,FizzBuzz",fizzBuzz.printNumbers(1,15));
    }

    @Test
    public void Print_Fizz_If_Number_DivisibleBy_Three_OrContainsThree()
    {
        assertEquals("7,8,Fizz,Buzz,11,Fizz,Fizz",fizzBuzz.printNumbers(7,13));
    }

    @Test
    public void Print_Buzz_If_Number_DivisibleBy_Five_OrContainsFive()
    {
        assertEquals("Buzz,Fizz,22,Fizz,Fizz,Buzz",fizzBuzz.printNumbers(20,25));
    }
}
