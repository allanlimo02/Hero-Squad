import junit.framework.TestCase;

public class HeroesTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testTestGetName() {

    }

    public void testTestSetName() {
        Heroes hero1 = new Heroes("Allan Limo");
        assertEquals("Allan Limo",hero1.getName());
    }

    public void testGetSuperpower1() {
    }

    public void testSetSuperpower1() {
    }

    public void testGetSuperpower2() {
    }

    public void testSetSuperpower2() {
    }
}