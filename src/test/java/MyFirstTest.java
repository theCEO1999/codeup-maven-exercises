import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyFirstTest {
    @Test
    public void testEqualStrings(){
        String str1 = "Codeup";
        String str2 = "CodeUp";
        assertEquals(str1, str2);
    }

    @Test
    public void testArrayLists(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void anotherTestArrayList(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testingTrueOrFalse(){
        String language = "PHP";
        language.contains("H"); // use assertTrue for this statement
        language.contains("J"); // use assertFalse for this statement
        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }



    ArrayList<Integer> arrayList = new ArrayList<>();
    ArrayList<Integer> arrayList2 = new ArrayList<>();
    @Before
    public void setUpValues(){
        arrayList.add(1);
        arrayList.add(2);
        arrayList2.add(1);
        arrayList2.add(2);
    }

    @Test
    public void testObjectSameness(){
        assertSame(arrayList, arrayList2);
    }

    @Test
    public void additionMethodTest(){
        long input1 = 20;
        long input2 = 30;
        long expected = 50;
        assertEquals(expected, MathOperations.add(input1, input2));
    }
    @Test
    public void tipAppTest(){
        double cost = 22.56;
        double tip = 20;

        assertEquals(4.51, MathOperations.tip(cost,tip), 0);
    }
    @Test
    public void testArrayEquality(){
        int[] startArray = {1, 2, 3, 4, 5};
        int[] endArray = {2, 3, 4, 5, 6};

        assertArrayEquals(endArray, MathOperations.addOneToArray(startArray));
    }



}
