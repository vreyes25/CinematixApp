package JFrames;

import java.awt.Image;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Los Pibes
 */
public class FacturaReporteTest {
    
    public FacturaReporteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        FacturaReporte instance = new FacturaReporte();
        Image expResult = null;
        Image result = instance.getIconImage();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRecuperarInformacion() {
        System.out.println("recuperarInformacion");
        FacturaReporte instance = new FacturaReporte();
        instance.recuperarInformacion();
        fail("The test case is a prototype.");
    }
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FacturaReporte.main(args);
        fail("The test case is a prototype.");
    }
    
}
