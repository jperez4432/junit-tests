import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTester {

    @Test
    public void testPerson() {
        Person dave = new Person("Dave");
        Person dave2 = new Person("Dave");
        Person daveInAHat = dave;

        assertEquals("Dave", dave.getName());
        assertSame(dave, daveInAHat);
        // assertSame(dave, dave2);
    }

    @Test
    public void arrayTest() {
        int[] arrayOfInts = {1, 2, 3, 4};
        int[] yetMoreInts = {1, 2, 3, 4, 8};

       //     assertEquals(arrayOfInts, yetMoreInts);
       // assertArrayEquals(arrayOfInts, yetMoreInts);
    }

   // @Test
//    public void testForCool() {
//        assertTrue(this.people.get(0).isCool());
//        assertTrue("Joe is super cool.", this.people.get(0).isCool());
//        assertFalse("David has never been cool.", this.people.get(1).isCool());
//    }
}
