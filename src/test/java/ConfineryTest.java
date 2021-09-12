import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConfineryTest extends TestCase {


//    public void setUp() throws Exception {
//        super.setUp();
//    }
//
//    public void tearDown() throws Exception {
//    }

    @Test
    public void HeroDetailsCreated_true() throws Exception {
        Confinery hero = new Confinery("Allan Limo");
        assertEquals("Allan Limo", hero.getHeroName());
    }
}