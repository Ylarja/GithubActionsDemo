import org.junit.*;
import static org.junit.Assert.*;

// Game: 1007
public class HSLColorTest {
  
  @Test(timeout = 4000)
	public void test_1_2116() throws Throwable {
		// test here!
		int R = 0;
		int G = 0;
		int B = 0;
		HSLColor c = new HSLColor();
		c.initHSLbyRGB(R, G, B);
		
		String result = "";
		result += c.getHue();
		
	  	String n="17000000";
		assertEquals(n, result);
	}

	@Test(timeout = 4000)
	public void test_2_2118() throws Throwable {
		// test here!
		int R = Integer.MAX_VALUE;
		int G = 0;
		int B = 255;
		HSLColor c = new HSLColor();
		c.initHSLbyRGB(R, G, B);
		
		String result = "";
		result += c.getSaturation();
		
	  	String n="00-421075221474836470255";
		assertEquals(n, result);
	}

	@Test(timeout = 4000)
	public void test_3_2120() throws Throwable {
		int R = 100;
		int G = 200;
		int B = 1;
		HSLColor c = new HSLColor();
		c.initHSLbyRGB(R, G, B);
		
		String result = "";
		result += c.getLuminence();
		
	  	String n="642521011002001";
		assertEquals(n, result);
	}

	@Test(timeout = 4000)
	public void test_4_2122() throws Throwable {
		int R = 1;
		int G = 100;
		int B = 200;
		HSLColor c = new HSLColor();
		c.initHSLbyRGB(R, G, B);
		
		String result = "";
		result += c.getRed();
		
	  	String n="1492521011100200";
		assertEquals(n, result);
	}

	@Test(timeout = 4000)
	public void test_5_2124() throws Throwable {
		int R = 1;
		int G = 100;
		int B = 200;
		HSLColor c = new HSLColor();
		c.initRGBbyHSL(R, G, B);
      
		String result = "";
		result += c.getGreen();

	  	String n="1100200222179178";
		assertEquals(n, result);
	}

	@Test(timeout = 4000)
	public void test_6_2126() throws Throwable {
		int R = 100;
		int G = 1;
		int B = 200;
		HSLColor c = new HSLColor();
		c.initRGBbyHSL(R, G, B);
		
		String result = "";
		result += c.getBlue();
		
	  	String n="1001200200200200";
		assertEquals(n, result);
	}

	@Test(timeout = 4000)
	public void test_7_2130() throws Throwable {
		String result = "";
		int R = 100;
		int G = 1;
		int B = 200;
		HSLColor c = new HSLColor();
		
		c.setHue(42);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.setHue(Integer.MAX_VALUE);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.setHue(Integer.MIN_VALUE);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.setHue(255);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.setHue(0);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		assertFalse(result.equals(""));
      
		c.setLuminence(42);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.setLuminence(Integer.MAX_VALUE);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.setLuminence(Integer.MIN_VALUE);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.setLuminence(255);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.setLuminence(0);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();

		assertEquals("420000012700000127000002550000000000000424242420025525525525500000000255255255255000000", result);
	}

	@Test(timeout = 4000)
	public void test_8_2132() throws Throwable {
		String result = "";
		int R = 100;
		int G = 1;
		int B = 200;
		HSLColor c = new HSLColor();
        assertNotNull(c);
		
		c.initHSLbyRGB(42,42,42);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initHSLbyRGB(Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initHSLbyRGB(Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initHSLbyRGB(255,255,255);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initHSLbyRGB(0,0,0);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		
		c.initHSLbyRGB(42,1,1);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initHSLbyRGB(Integer.MAX_VALUE,1,1);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initHSLbyRGB(Integer.MIN_VALUE,1,1);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initHSLbyRGB(255,1,1);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initHSLbyRGB(0,1,1);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();

		c.initHSLbyRGB(1,42,1);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initHSLbyRGB(1,Integer.MAX_VALUE,1);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initHSLbyRGB(1,Integer.MIN_VALUE,1);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initHSLbyRGB(1,255,1);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initHSLbyRGB(1,0,1);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		
		c.initHSLbyRGB(1,1,42);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initHSLbyRGB(1,1,Integer.MAX_VALUE);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initHSLbyRGB(1,1,Integer.MIN_VALUE);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initHSLbyRGB(1,1,255);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initHSLbyRGB(1,1,0);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		
		c.initHSLbyRGB(2,1,42);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initHSLbyRGB(2,1,Integer.MAX_VALUE);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initHSLbyRGB(2,1,Integer.MIN_VALUE);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initHSLbyRGB(2,1,255);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initHSLbyRGB(2,1,0);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		
		String n="1700424242421700021474836472147483647214748364717000-2147483648-2147483648-2147483648170025525525525517000000024322421100-4210751214748364711850-4210751-214748364811025512825511127255101185243221421850-421075112147483647100-42107511-21474836481852551281255121325511011702432211421700-421075111214748364700-421075111-2147483648170255128112554225511101722432221421700-421075121214748364700-421075021-214748364817125512821255212551210";
		assertEquals(n, result);
	}
  
	@Test(timeout = 4000)
	public void test_9_2134() throws Throwable {
		String result = "";
		int R = 100;
		int G = 1;
		int B = 200;
		HSLColor c = new HSLColor();
		
		c.initRGBbyHSL(42,42,42);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initRGBbyHSL(Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initRGBbyHSL(Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initRGBbyHSL(255,255,255);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initRGBbyHSL(0,0,0);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		
		c.initRGBbyHSL(42,1,1);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initRGBbyHSL(Integer.MAX_VALUE,1,1);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initRGBbyHSL(Integer.MIN_VALUE,1,1);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initRGBbyHSL(255,1,1);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initRGBbyHSL(0,1,1);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();

		c.initRGBbyHSL(1,42,1);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initRGBbyHSL(1,Integer.MAX_VALUE,1);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initRGBbyHSL(1,Integer.MIN_VALUE,1);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initRGBbyHSL(1,255,1);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initRGBbyHSL(1,0,1);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		
		c.initRGBbyHSL(1,1,42);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initRGBbyHSL(1,1,Integer.MAX_VALUE);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initRGBbyHSL(1,1,Integer.MIN_VALUE);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initRGBbyHSL(1,1,255);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initRGBbyHSL(1,1,0);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		
		c.initRGBbyHSL(2,1,42);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initRGBbyHSL(2,1,Integer.MAX_VALUE);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initRGBbyHSL(2,1,Integer.MIN_VALUE);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initRGBbyHSL(2,1,255);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
		c.initRGBbyHSL(2,1,0);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
	  
	  	String n="424242494935214748364721474836472147483647-1400-2147483648-2147483648-2147483648255-84214982552552552552552552550000004211111214748364711111-214748364811111255111110111111421111121474836471-8421502255-84215031-21474836481-8421502255-84215031255120010111111424242421121474836470255-111-21474836480001125525525525511000021424242422121474836470255-121-214748364800021255255255255210000";
		
	  	assertEquals(n, result);
	}

	@Test(timeout = 4000)
	public void test_10_2135() throws Throwable {
		    String result = "";
    int R = 100;
    int G = 1;
    int B = 200;
    HSLColor c = new HSLColor();
    
    c.initRGBbyHSL(42,42,42);
    c.brighten(42f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.brighten(0);
    c.initRGBbyHSL(Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE);
    c.brighten(0.1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.initRGBbyHSL(Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE);
    c.brighten(0.5f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.initRGBbyHSL(255,255,255);
    c.brighten(1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.initRGBbyHSL(0,0,0);
    c.brighten(1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    
    c.initRGBbyHSL(42,1,1);
    c.brighten(1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.initRGBbyHSL(Integer.MAX_VALUE,1,1);
    c.brighten(0);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.initRGBbyHSL(Integer.MIN_VALUE,1,1);
    c.brighten(0.5f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.initRGBbyHSL(255,1,1);
    c.brighten(0.1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.initRGBbyHSL(0,1,1);
    c.brighten(0.1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();

    c.initRGBbyHSL(1,42,1);
    c.brighten(1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.initRGBbyHSL(1,Integer.MAX_VALUE,1);
    c.brighten(1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.initRGBbyHSL(1,Integer.MIN_VALUE,1);
    c.brighten(0);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.initRGBbyHSL(1,255,1);
    c.brighten(1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.initRGBbyHSL(1,0,1);
    c.brighten(1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    
    c.blend(1,1,42,1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.blend(1,1,Integer.MAX_VALUE,1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.blend(1,1,Integer.MIN_VALUE,1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.blend(1,1,255,1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.blend(1,1,0,1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    
    c.blend(2,1,42,0.1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.blend(2,1,Integer.MAX_VALUE,0.1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.blend(2,1,Integer.MIN_VALUE,0.1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.blend(2,1,2550,1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.blend(2,1,0, 0.1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    
    
	String n ="424225525525525521474836472147483647255249255255-2147483648-214748364800002552552552552552550000004211111214748364711111-214748364810000255100000100001421111121474836471-8421502255-84215031-21474836481-8421502255-8421503125512001011111702432211421700-421075111214748364700-421075111-2147483648170255128112554225511101701533114170-4-21053721121474837142-54-231591111-21474834171-3181276212550171-3271148212294";
    assertEquals(n, result);
	}

	@Test(timeout = 4000)
	public void test_11_2139() throws Throwable {
		String result = "";
    int R = 100;
    int G = 1;
    int B = 200;
    HSLColor c = new HSLColor();
    
    c.initRGBbyHSL(42,42,42);
    c.setSaturation(42);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
	
	  String n="1234";
      assertFalse(result.equals(n));
      
    c.initRGBbyHSL(Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE);
	c.setSaturation(0);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.initRGBbyHSL(Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE);
    c.setSaturation(5);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.initRGBbyHSL(255,255,255);
    c.setSaturation(1);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.initRGBbyHSL(0,0,0);
    c.setSaturation(100);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    
    c.initRGBbyHSL(42,1,1);
    c.setSaturation(Integer.MAX_VALUE);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.initRGBbyHSL(Integer.MAX_VALUE,1,1);
    c.setSaturation(Integer.MIN_VALUE);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.initRGBbyHSL(Integer.MIN_VALUE,1,1);
    c.setSaturation(-1);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.initRGBbyHSL(255,1,1);
    c.setSaturation(42);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.initRGBbyHSL(0,1,1);
    c.setSaturation(42);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();

    c.initRGBbyHSL(1,42,1);
    c.setSaturation(10);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.initRGBbyHSL(1,Integer.MAX_VALUE,1);
    c.setSaturation(1000);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.initRGBbyHSL(1,Integer.MIN_VALUE,1);
    c.setSaturation(0);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.initRGBbyHSL(1,255,1);
    c.setSaturation(-1);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.initRGBbyHSL(1,0,1);
    c.setSaturation(Integer.MAX_VALUE);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    
    c.blend(1,1,42,1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.blend(1,1,Integer.MAX_VALUE,1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.blend(1,1,Integer.MIN_VALUE,1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.blend(1,1,255,1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.blend(1,1,0,1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    
    c.blend(2,1,42,0.1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.blend(2,1,Integer.MAX_VALUE,0.1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.blend(2,1,Integer.MIN_VALUE,0.1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.blend(2,1,2550,1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    c.blend(2,1,0, 0.1f);
    result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
    
    String n1="424242494935214748364702147483647842150384215038421503-21474836485-2147483648000255125525525525501000000422551220214748364701111-2147483648011112554211110421111110111112551200101111101111125512001702432211421700-421075111214748364700-421075111-2147483648170255128112554225511101701533114170-4-21053721121474837142-54-231591111-21474834171-3181276212550171-3271148212294";
    assertEquals(n1, result);
	}
 

}
