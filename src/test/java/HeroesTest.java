import junit.framework.TestCase;
import static org.junit.Assert.*;

public class HeroesTest extends TestCase {

     void testTestGetName() {
        Heroes heroes= new Heroes("Allan","21","Speed driving","sleep");
        assertEquals("Allan",heroes.getName());
    }

     void testGetAge() {
        Heroes heroes= new Heroes("Allan","21","Speed driving","sleep");
        assertEquals("21",heroes.getAge());
    }

     void testGetPower() {
        Heroes heroes= new Heroes("Allan","21","Speed driving","sleep");
        assertEquals("Speed driving",heroes.getPower());
    }

     void testGetWeakness() {
        Heroes heroes= new Heroes("Allan","21","Speed driving","sleep");
        assertEquals("sleep",heroes.getWeakness());
    }

    public void testAll() {
        Heroes allan = new Heroes("Allan","21","Slide","time");
        Heroes benard = new Heroes("Benard","21","laneSplitting","time");

        assertTrue(Heroes.all().contains(allan));
        assertTrue(Heroes.all().contains(benard));

    }


}