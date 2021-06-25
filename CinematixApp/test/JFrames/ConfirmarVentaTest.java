package JFrames;

import java.awt.Image;
import java.awt.event.KeyEvent;
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
public class ConfirmarVentaTest {
    
    public ConfirmarVentaTest() {
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
    public void testDatosFactura() {
        System.out.println("datosFactura");
        ConfirmarVenta instance = new ConfirmarVenta();
        try {
            instance.datosFactura();
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }

    @Test
    public void testCalculo() {
        System.out.println("calculo");
        ConfirmarVenta instance = new ConfirmarVenta();
        try {
            instance.calculo();
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }

    @Test
    public void testPasaDatos() {
        System.out.println("pasaDatos");
        ConfirmarVenta instance = new ConfirmarVenta();
        instance.jTextFieldPelicula.setText("Los Vengadores");
        instance.jLabelSala.setText("Max2D");
        instance.jTextFieldHora.setText("02:00pm");
        instance.jTextFieldCantidadDeBoletosNiños.setText("3");
        instance.jLabelTotalNiños.setText("100");
        instance.jTextFieldCantidadDeBoletosAdultos.setText("4");
        instance.jLabelTotalAdultos.setText("350");
        instance.jLabelTotalPago.setText("450");
        instance.jTextFieldEfectivoRecibido.setText("500");
        instance.jLabelCambio.setText("50");
        instance.jLabelImpuesto.setText("150");
        try {
            instance.pasaDatos();
        } catch (Exception e) {
            fail("Ni verga");
        }
    }

    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        ConfirmarVenta instance = new ConfirmarVenta();
        Image expResult = null;
        Image result = instance.getIconImage();
        if (result == null) {
            fail("The test case is a prototype.");
        }
    }
}
