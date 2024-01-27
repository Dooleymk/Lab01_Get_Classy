import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1, p2, p3;
    @BeforeEach
    void setUp() {

        p1 = new Person("00000A", "Billy", "Test1", "Mr.", 2001);
        p2 = new Person("00000A", "Bob", "Test2", "Mr.", 2002);
        p3 = new Person("00000A", "Bubba", "Test3", "Mr.", 2003);

    }

    @Test
    void setIDSeed() {
        p1.setID("00000B");
        assertEquals("00000B", p1.getID());
    }

    @Test
    void setID() {
        p1.setID("00000B");
        assertEquals("00000B", p1.getID());
    }

    @Test
    void setFirstName() {
        p1.setFirstName("Billy");
        assertEquals("Billy", p1.getFirstName());
    }

    @Test
    void setLastName() {
        p2.setLastName("Test2");
        assertEquals("Test2", p2.getLastName());
    }

    @Test
    void setTitle() {
        p3.setTitle("Mr.");
        assertEquals("Mr.", p3.getTitle());
    }

    @Test
    void setYob() {
        p3.setYob(2003);
        assertEquals(2003, p3.getYob());
    }

    @Test
    void testToString() {
        p1.setFirstName("Billy");
        assertEquals("Billy", p1.getFirstName());
    }

    @Test
    void fullName() {
        p1.setFirstName("Billy");
        p1.setLastName("Test1");
        assertEquals("Billy Test1", p1.fullName());
    }

    @Test
    void formalName() {
        p2.setTitle("Mr.");
        p2.fullName();
        assertEquals("Mr. Bob Test2", p2.formalName());
    }

    @Test
    void toCSV() {
        assertEquals("00000A, Billy, Test1, Mr., 2001", p1.toCSV());
    }
}