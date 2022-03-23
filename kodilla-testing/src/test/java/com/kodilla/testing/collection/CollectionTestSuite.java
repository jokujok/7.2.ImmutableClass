package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CollectionTestSuite {

    @DisplayName("given OddNumberExterminator with nothing, when calling exterminate with an empty list " +
            "then exterminate should return empty list ")

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> result = oddNumbersExterminator.exterminated(list);
        //Then
        Assertions.assertEquals(list, result);
    }

    @DisplayName("given OddNumberExterminator with nothing, when calling exterminate with an list" +
            "then exterminate should return an list with even numbers ")

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> startingList = List.of(1, 2, 3, 4, 5);
        List<Integer> expectedList = List.of(2,4);
        List<Integer> resultList = oddNumbersExterminator.exterminated(startingList);
        //Then
        Assertions.assertEquals(expectedList, resultList);
            }
}
