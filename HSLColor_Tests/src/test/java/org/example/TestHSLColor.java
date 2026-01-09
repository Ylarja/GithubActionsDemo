/*Compila i campi "Nome" e "Cognome" con le informazioni richieste
Nome: "inserire il proprio nome"
Cognome: "inserire il proprio cognome"
Username: i.saulino@studenti.unina.it
UserID: 1133
Date: 30/10/2025
*/
package org.example;

import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestHSLColor {
  
  private HSLColor c;
  
	@BeforeClass
	public static void setUpClass() {
		// Eseguito una volta prima dell'inizio dei test nella classe
		// Inizializza risorse condivise 
		// o esegui altre operazioni di setup
	}
				
	@AfterClass
	public static void tearDownClass() {
		// Eseguito una volta alla fine di tutti i test nella classe
		// Effettua la pulizia delle risorse condivise 
		// o esegui altre operazioni di teardown
	}
				
	@Before
	public void setUp() {
       c = new HSLColor();
       assertNotNull(c);
	}
				
	@After
	public void tearDown() {
		c = null;
        //assertNotNull(c);
	}
				
	@Test
	public void testInitHSLbyRGB() {
		//HSLColor c = new HSLColor();
		c.initHSLbyRGB(255, 0, 0);
		assertEquals(255, c.getRed());
		assertEquals(0, c.getGreen());
		assertEquals(0, c.getBlue());
		assertEquals(0, c.getHue());
		assertEquals(255, c.getSaturation());
		assertEquals(128, c.getLuminence());
	}
  
  	@Test
  	public void testMaxMinValueRGB() {
     	//HSLColor c = new HSLColor();
      	c.initHSLbyRGB(100, 100, 100);
     	assertEquals(0, c.getSaturation());
      	assertEquals(170,c.getHue());
    }
    
	@Test 
  	public void testMaxValueEqualsG() {
      //cMax == G questo è quello che voglio verificare
      //HSLColor c = new HSLColor();
      c.initHSLbyRGB(0, 255, 0);
      assertEquals(255, c.getGreen());   
    }
  
  	@Test 
  	public void testMaxValueEqualsB() {
      //cMax == G questo è quello che voglio verificare
      //HSLColor c = new HSLColor();
      c.initHSLbyRGB(0, 0, 255);
      assertEquals(255, c.getBlue());   
    }
  
  	@Test
  	public void testIsGrayScale() {
      c.setSaturation(0);
      assertEquals(0, c.getSaturation());  
    }
  	
  	@Test
  	public void testL() {
        c.initRGBbyHSL(0, 143, 0);
        c.setLuminence(125);
        assertEquals(125,c.getLuminence());
    }

    @Test
    public void testInitHSLbyRGB_NegativeHueBranch() {
        c.initHSLbyRGB(255, 0, 100);
        assertEquals(238, c.getHue());
    }

    @Test
    public void testInitRGBbyHSL_HueToRGB() {
        c.initRGBbyHSL(255, 255, 128);
        assertEquals(255, c.getHue());
    }

    @Test
    public void testSetHue_IToValue() {
        c.setHue(256);
        assertEquals(1, c.getHue());
    }

    @Test
    public void testSetHue_iToValue() {
        c.setHue(-2); // -2 < 0

        assertEquals(253, c.getHue());
    }

    @Test
    public void testSetSaturation_minore0() {
        c.setSaturation(-2);
        assertEquals(0, c.getSaturation());
    }

    @Test
    public void testSaturation_maggioreHSLMax() {
        c.setSaturation(256);
        assertEquals(255, c.getSaturation());
    }

    @Test
    public void testSetReverseLight() {
        c.initHSLbyRGB(255, 0, 0);
        c.reverseColor();
        //0 + (255 / 2) = 127
        assertEquals(127, c.getHue());
    }

    @Test
    public void testBrighten_0percento() {
        c.initHSLbyRGB(255, 0, 0);
        int initialLuminence = c.getLuminence();
        c.brighten(0.0f);
        assertEquals(initialLuminence, c.getLuminence());
    }

    @Test
    public void testBrighten_maggiore0() {
        c.initRGBbyHSL(0,0,-2);
        c.brighten(0.5f);
        assertEquals(0, c.getLuminence());
    }

    @Test
    public void testBlend_PercentAt100() {
        c.initHSLbyRGB(255, 0, 0);
        c.blend(0, 255, 0, 1.0f);
        assertEquals(0, c.getRed());
        assertEquals(255, c.getGreen());
        assertEquals(0, c.getBlue());
    }

    @Test
    public void testBlend_PercentAtZero() {
        c.initHSLbyRGB(255, 0, 0);
        c.blend(0, 255, 0, 0.0f);
        assertEquals(255, c.getRed());
        assertEquals(0, c.getGreen());
        assertEquals(0, c.getBlue());
    }

    @Test
    public void testBlend_PercentAt50() {
        c.initHSLbyRGB(255, 0, 0);
        c.blend(0, 0, 255, 0.5f);
        assertEquals(127, c.getRed());
        assertEquals(0, c.getGreen());
        assertEquals(127, c.getBlue());
    }
}

						