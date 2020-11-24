package com.mutation.PitMutation.pit;

import com.mutation.PitMutation.core.GetNextSequenceNumber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
public class GetNextSequenceNumberTest {
    private GetNextSequenceNumber sut= new GetNextSequenceNumber();


    @Test
    public void testGetNextValue(){
        int nextValue = sut.getNextValue();
        int nextNextValue = sut.getNextValue();

        assertFalse(nextValue == nextNextValue);

        System.out.println("nextValue: "+ nextValue + " nextNextValue: " + nextNextValue);
    }
}
