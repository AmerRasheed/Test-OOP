package org.example.MotoTest;
import org.example.Amer.Person;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    private Person testObject;

    @Before
    public void setUp() throws Exception {
        testObject=new Person();
        testObject.setFirstName("Test");
        testObject.setLastName("Tester");
        testObject.setBirthDate(45);
    }

    @Test
    public void testObject_has_correct_fields() {
        assertEquals("Test", testObject.getFirstName());
        assertEquals("Tester", testObject.getLastName());
        assertEquals(45,testObject.getBirthDate());
    }
}
