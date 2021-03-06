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
public class FacturaTest {
    
    public FacturaTest() {
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
    public void testFacturaEncabezado() {
        System.out.println("facturaEncabezado");
        Factura instance = new Factura();
        try {
            instance.facturaEncabezado();
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }

    @Test
    public void testIdFacturaEncabezado() {
        System.out.println("idFacturaEncabezado");
        Factura instance = new Factura();
        try {
            instance.idFacturaEncabezado();
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }

    @Test
    public void testFacturaDetalle() {
        System.out.println("facturaDetalle");
        Factura instance = new Factura();
        try {
            instance.facturaDetalle();
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }

    @Test
    public void testRecogerDatos() {
        System.out.println("recogerDatos");
        Factura instance = new Factura();
        instance.recogerDatos();
        fail("The test case is a prototype.");
    }

    @Test
    public void testDatosCAI() {
        System.out.println("datosCAI");
        Factura instance = new Factura();
        try {
            instance.datosCAI();
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }

    @Test
    public void testNumFactura() {
        System.out.println("numFactura");
        Factura instance = new Factura();
        try {
            instance.numFactura();
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }

    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        Factura instance = new Factura();
        Image expResult = null;
        Image result = instance.getIconImage();
        if (result == null) {
            fail("The test case is a prototype.");
        }
    }
}
