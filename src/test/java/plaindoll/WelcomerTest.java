package plaindoll;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WelcomerTest{
    @Test
    public void testSayWelcome(){
        Welcomer welcomer = new Welcomer();
        assertEquals("Welcome dear traveler, we have need of your services", welcomer.sayWelcome());
    }
    @Test
    public void testSayWelcomeWithName(){
        Welcomer welcomer = new Welcomer();
        assertEquals("Welcome dear John, we have need of your services", welcomer.sayWelcome("John"));
    }
    @Test
    public void testSayFarewell(){
        Welcomer welcomer = new Welcomer();
        assertEquals("See you later, alligator", welcomer.sayFarewell());
    }
    @Test
    public void testSayNeed(){
        Welcomer welcomer = new Welcomer();
        assertEquals("We need your help!", welcomer.sayNeed());
    }
    @Test
    public void testHunterReply(){
        Welcomer welcomer = new Welcomer();
        assertTrue(welcomer.getHunterReply().contains("hunter"));
    }
}
