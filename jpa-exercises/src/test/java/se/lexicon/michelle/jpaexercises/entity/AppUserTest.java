package se.lexicon.michelle.jpaexercises.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AppUserTest {
    AppUser testObject;

    @BeforeEach
    void setUp() {

        testObject = new AppUser(
                "chips_desu",
                "Michelle",
                "Johansson",
                LocalDate.parse("1985-12-22"),
                "guldKo22"
        );
    }

    @Test
    void successfully_tested(){
        assertNotNull(testObject);
        assertEquals(0, testObject.getUserId());
        assertEquals("chips_desu", testObject.getUserName());
        assertEquals("Michelle", testObject.getFirstName());
        assertEquals("Johansson", testObject.getLastName());
        assertEquals("1985-12-22", testObject.getBirthDate().toString());
        assertEquals("guldKo22", testObject.getPassword());
    }

    @Test
    public void testEquals_and_hashcode() {
        // equals and hashCode check name field value
        AppUser expected = new AppUser(
               "chips_desu",
                "Michelle",
                "Johansson",
                LocalDate.parse("1985-12-22"),
                "guldKo22"
        );
        assertTrue(expected.equals(testObject) && testObject.equals(expected));
        assertEquals(expected.hashCode(), testObject.hashCode());

    }

    @Test
    void testToString(){
        String toString = testObject.toString();
        assertTrue(toString.contains(Integer.toString(testObject.getUserId())));
        assertTrue(toString.contains(testObject.getFirstName()));
        assertTrue(toString.contains(testObject.getLastName()));
        assertTrue(toString.contains(testObject.getBirthDate().toString()));
        assertTrue(toString.contains(testObject.getPassword()));

    }
}