package com.mutation.PitMutation.pit;

import com.mutation.PitMutation.core.CalculateDigits;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class CalculateTest {
    private CalculateDigits calc = new CalculateDigits();
    @Test
    public void TestAddNum(){
       assertEquals(3,calc.AddNumbers(1D,2D));
    }

    @Test
    public void TestMultiplication(){
        assertEquals(4,calc.MultiplicateNumbers(2D,2D));
        assertThrows(NullPointerException.class,()-> calc.AddNumbers(null,null));

    }

    @Test
    public void TestDev(){
        assertEquals(5,calc.Div(10D,2D));

    }
}
