import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product p1, p2, p3;
    @BeforeEach
    void setUp() {

        p1 = new Product("00000A", "Pipeweed", "Long Bottom Leaf", 600.0);
        p2 = new Product("00000A", "Lembas", "Elven Wayfare Bread", 200.0);
        p3 = new Product("00000A", "Wine", "Woodland Elf Wine", 400.0);
    }

    @Test
    void setIDSeed() {

    }

    @Test
    void setID() {
            p1.setID("00000B");
            assertEquals("00000B", p1.getID());
    }


    @Test
    void setName() {
            p1.setName("Pipeweed");
            assertEquals("Pipeweed", p1.getName());

    }

    @Test
    void setDescription() {
                p2.setDescription("Elven Wayfar Bread");
                assertEquals("Elven Wayfar Bread", p2.getDescription());

    }

    @Test
    void setCost() {
            p3.setCost(400.0);
            assertEquals(400.0, p3.getCost());

    }

    @Test
    void toCSV() {
            p1.toCSV();
            assertEquals("00000A, Pipeweed, Long Bottom Leaf, 600.0", p1.toCSV());
    }
}