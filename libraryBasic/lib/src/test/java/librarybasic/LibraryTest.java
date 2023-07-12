/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package librarybasic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library sut = new Library();
        assertTrue(sut.someLibraryMethod(), "someLibraryMethod should return 'true'");

        // Arrange

        //Act

        //Assert
    }

    //Note off by one error found in the while condition had >= only needed >
    @Test void  rollTest(){
        //arrange
        int feedVariable =4;
        int[] expectedResult = new int[feedVariable];

        Library sut = new Library();

        //Act
        int[] myResult =  sut.roll(feedVariable);

        //Assert
        assertEquals(expectedResult.length,myResult.length);
    }

    @Test void duplicatesTest(){
        //Arrange
        int[] someArray = {1,2,3,8,4,5,6};
        int[] someArray2 = {5,10,15,15};
        Library sut = new Library();

        //Act
        boolean result1 = sut.containsDuplicate(someArray);
        boolean result2 = sut.containsDuplicate(someArray2);

        //Assert
        assertEquals(false,result1);
        assertEquals(true, result2);


    }

    @Test void averagesTest(){

        //Arrange
        int[] someArray2 = {5,10,15,15};
        float expectedOutput = 11.25f;
        Library sut = new Library();

        //Act

        float myTestReturn =  sut.calculateAverage(someArray2);
        //Assert
        assertEquals(expectedOutput,myTestReturn );

    }

    //not sure why I ended up using Lists here but was able to find the correct assertion to make this work
    @Test void arraysOfArraysTest(){

        //Arrange
        int[][] weeklyMonthTemperaturesA = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] expectedResult = {55, 54, 60, 53, 59, 57, 61};
        List first = Arrays.asList(expectedResult);
        Library sut = new Library();

        //Act

        int[] myTestTempResult = sut.weeklyMothTemperatures(weeklyMonthTemperaturesA);
        List second = Arrays.asList(myTestTempResult);

        //Assert
        //Bad Test checked for Object memory location
        //assertEquals(first,second);

        assertArrayEquals(first.toArray(), second.toArray());

    }
}





//        int[] someArray = {1,2,3,8,4,5,6};
//        int[] someArray2 = {5,10,15,15};
//        //boolean myResult = containsDuplicate(someArray);
//        //System.out.println(myResult);
//        //Integer a = 5;
//        //Integer b = 5;
//        //System.out.println(a.equals(b));
////    float average = calculateAverage(someArray2);
////    System.out.println(average);
//        int[][] weeklyMonthTemperaturesA = {
//                {66, 64, 58, 65, 71, 57, 60},
//                {57, 65, 65, 70, 72, 65, 51},
//                {55, 54, 60, 53, 59, 57, 61},
//                {65, 56, 55, 52, 55, 62, 57}
//        };
//
//
//
//        int[] twoDArray = weeklyMothTemperatures(weeklyMonthTemperaturesA);
//        for(int i =0; i<twoDArray.length;i++){
//            System.out.println(twoDArray[i]);
//        }