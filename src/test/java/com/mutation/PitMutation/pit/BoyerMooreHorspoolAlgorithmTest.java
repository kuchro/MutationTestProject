package com.mutation.PitMutation.pit;

import com.mutation.PitMutation.core.BoyerMooreHorspoolAlgorithm;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class BoyerMooreHorspoolAlgorithmTest {
    private BoyerMooreHorspoolAlgorithm sut= new BoyerMooreHorspoolAlgorithm();


    @Test
    public void testFind(){
        char[] pattern = "sed".toCharArray();
        char[] text = ("Lorem ipsum dolor sit amet, consetetur sadipscing "
                + "elitr, sed diam nonumy eirmod tempor").toCharArray();

        int index = sut.find(pattern, text);

        assertEquals(57, index);
    }

    @Test
    public void testDoNotFind(){
        char[] pattern = "+++".toCharArray();
        char[] text = ("Lorem ipsum dolor sit amet, consetetur sadipscing "
                + "elitr, sed diam nonumy eirmod tempor").toCharArray();

        int index = sut.find(pattern, text);

        assertEquals(-1, index);
    }
}
