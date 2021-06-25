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
public class Sala3DTest {
    
    public Sala3DTest() {
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
        Sala3D instance = new Sala3D();
        Image expResult = null;
        Image result = instance.getIconImage();
        if (result == null) {
            fail("The test case is a prototype.");
        }
    }

    @Test
    public void testBotones() {
        System.out.println("botones");
        Sala3D instance = new Sala3D();
        instance.botones();
        fail("The test case is a prototype.");
    }

    @Test
    public void testReservaAsiento() {
        System.out.println("reservaAsiento");
        int numeroasiento = 0;
        Sala3D instance = new Sala3D();
        instance.reservaAsiento(numeroasiento);
        fail("The test case is a prototype.");
    }

    @Test
    public void testQuitarReservaAsiento() {
        System.out.println("QuitarReservaAsiento");
        int numeroasiento = 0;
        Sala3D instance = new Sala3D();
        instance.QuitarReservaAsiento(numeroasiento);
        fail("The test case is a prototype.");
    }

    @Test
    public void testBuscarAsientosReservados() {
        System.out.println("buscarAsientosReservados");
        Sala3D instance = new Sala3D();
        instance.buscarAsientosReservados();
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Sala3D.main(args);
        fail("The test case is a prototype.");
    }
    
}
