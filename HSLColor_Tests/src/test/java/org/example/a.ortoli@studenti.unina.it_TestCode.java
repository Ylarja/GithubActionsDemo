import org.junit.*;
import static org.junit.Assert.*;

// Game: 1007
public class HSLColorTest {

 private String emptyString = "";
  private void RGBtoHSL(HSLColor c, int n1, int n2, int n3){
  	c.initHSLbyRGB(n1, n2, n3);
  }
  private void REVERSE(HSLColor c){
  	 c.reverseColor();
  }
  private int GETHue(HSLColor c){
  	return c.getHue();
  }
  @Test
	public void test_1_1657() throws Throwable {
    HSLColor c = new HSLColor();
	int TrialNumber = 42;
    RGBtoHSL(c, TrialNumber, TrialNumber, TrialNumber);
	int expectedResult = 170;
	assertEquals(expectedResult, GETHue(c) );
	}
  
  private String GetResult(HSLColor c){
  		String result = "";
		result += c.getHue();
		result += c.getSaturation();
		result += c.getLuminence();
		result += c.getRed();
		result += c.getGreen();
		result += c.getBlue();
		return result;
  }
  @Test(timeout = 4000)
	public void test_1_2116() throws Throwable {
		// test here!
		int R = 0;
		int G = 0;
		int B = 0;
		HSLColor c = new HSLColor();
		RGBtoHSL(c, R, G, B);
		
		String result = GetResult(c);
		
	  	String ExpectedResult = "17000000";
		assertEquals(ExpectedResult, result);
	}

	@Test(timeout = 4000)
	public void test_2_2118() throws Throwable {
		// test here!
		int R = Integer.MAX_VALUE;
		int G = 0;
		int B = 255;
		HSLColor c = new HSLColor();
		
        RGBtoHSL(c, R, G, B);
	  	assertNotNull(c);
		
		String result = GetResult(c);
		
	  	String ExpectedResult = "00-421075221474836470255";
		assertEquals(ExpectedResult, result);
	}

	@Test(timeout = 4000)
	public void test_3_2120() throws Throwable {
		int R = 100;
		int G = 200;
		int B = 1;
		HSLColor c = new HSLColor();
		RGBtoHSL(c, R, G, B);
		
		String result = GetResult(c);
		
	  	String ExpectedResult = "642521011002001";
		assertEquals(ExpectedResult, result);
	}

	@Test(timeout = 4000)
	public void test_4_2122() throws Throwable {
		int R = 1;
		int G = 100;
		int B = 200;
		HSLColor c = new HSLColor();
		RGBtoHSL(c, R, G, B);
		
		String result = GetResult(c);
		
	 	String ExpectedResult = "1492521011100200";
		assertEquals(ExpectedResult, result);
		
	}

	@Test(timeout = 4000)
	public void test_5_2124() throws Throwable {
		int R = 1;
		int G = 100;
		int B = 200;
		HSLColor c = new HSLColor();
		RGBtoHSL(c, R, G, B);
		assertNotNull(c);
      
		String result = GetResult(c);
		String ExpectedResult = "1492521011100200";
		assertEquals(ExpectedResult, result);
		
	}

	@Test(timeout = 4000)
	public void test_6_2126() throws Throwable {
		int R = 100;
		int G = 1;
		int B = 200;
		HSLColor c = new HSLColor();
		RGBtoHSL(c, R, G, B);
		
		String result = GetResult(c);
		String ExpectedResult = "1912521011001200";
		assertEquals(ExpectedResult, result);
	}

  	private String SetHUE(HSLColor c, int n, String result){
		c.setHue(n);
	  	result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
	  	return result;
	}
  	
  	private String SetLUMINENCE(HSLColor c, int n, String result){
		c.setLuminence(n);
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
	  	return result;
	}
  
	@Test(timeout = 4000)
	public void test_7_2130() throws Throwable {
		String result = "";
		int R = 100;
		int G = 1;
		int B = 200;
		HSLColor c = new HSLColor();
		
	  	int hue1 = 42;
	  	int hue2 = 255;
	  	int hue3 = 0;
		result = SetHUE(c, hue1, result);
	  	result = SetHUE(c, Integer.MAX_VALUE, result);
	  	result = SetHUE(c, Integer.MIN_VALUE, result);
	  	result = SetHUE(c, hue2, result);
	  	result = SetHUE(c, hue3, result);
		
		assertFalse(result.equals(emptyString));
      
		result = SetLUMINENCE(c, hue1, result);
	  	result = SetLUMINENCE(c, Integer.MAX_VALUE, result);
	  	result = SetLUMINENCE(c, Integer.MIN_VALUE, result);
	  	result = SetLUMINENCE(c, hue2, result);
	  	result = SetLUMINENCE(c, hue3, result);
	
	  	String ExpectedResult ="420000012700000127000002550000000000000424242420025525525525500000000255255255255000000";
		assertEquals(ExpectedResult, result);
	}
	
  	private String GET2(HSLColor c, String result){
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
	  	return result;
	}
	@Test(timeout = 4000)
	public void test_8_2132() throws Throwable {
		String result = "";
		int R = 100;
		int G = 1;
		int B = 200;
		HSLColor c = new HSLColor();
        assertNotNull(c);
		
	  	int n = 42;
	  	int n2 = 255;
	  	int n3 = 0;
	  	int n4 = 1;
	  	int n5 =2;
		RGBtoHSL(c, n, n, n);
		result = GET2(c, result);
	  	RGBtoHSL(c, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE);
		result = GET2(c, result);
		RGBtoHSL(c, Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE);
		result = GET2(c, result);
		RGBtoHSL(c, n2,n2,n2);
		result = GET2(c, result);
		RGBtoHSL(c, n3,n3,n3);
		result = GET2(c, result);
		
		RGBtoHSL(c, n,n4,n4);
		result = GET2(c, result);
		RGBtoHSL(c, Integer.MAX_VALUE,n4,n4);
		result = GET2(c, result);
		RGBtoHSL(c, Integer.MIN_VALUE,n4,n4);
		result = GET2(c, result);
		RGBtoHSL(c,n2,n4,n4);
		result = GET2(c, result);
		RGBtoHSL(c,n3,n4,n4);
		result = GET2(c, result);

		RGBtoHSL(c,n4,n,n4);
		result = GET2(c, result);
		RGBtoHSL(c,n4,Integer.MAX_VALUE,n4);
		result = GET2(c, result);
		RGBtoHSL(c,n4,Integer.MIN_VALUE,n4);
		result = GET2(c, result);
		RGBtoHSL(c,n4,n3,n4);
		result = GET2(c, result);
		RGBtoHSL(c,n4,n3,n4);
		result = GET2(c, result);
		
		RGBtoHSL(c,n4,n4,n);
		result = GET2(c, result);
		RGBtoHSL(c,n4,n4,Integer.MAX_VALUE);
		result = GET2(c, result);
		RGBtoHSL(c,n4,n4,Integer.MIN_VALUE);
		result = GET2(c, result);
		RGBtoHSL(c,n4,n4,n2);
		result = GET2(c, result);
		RGBtoHSL(c,n4,n4,n3);
		result = GET2(c, result);
		
		RGBtoHSL(c,n5,n4,n);
		result = GET2(c, result);
		RGBtoHSL(c,n5,n4,Integer.MAX_VALUE);
		result = GET2(c, result);
		RGBtoHSL(c,n5,n4,Integer.MIN_VALUE);
		result = GET2(c, result);
		RGBtoHSL(c,n5,n4,n2);
		result = GET2(c, result);
		RGBtoHSL(c,n5,n4,n3);
		result = GET2(c, result);
		
		String ExpectedResult = "1700424242421700021474836472147483647214748364717000-2147483648-2147483648-2147483648170025525525525517000000024322421100-4210751214748364711850-4210751-214748364811025512825511127255101185243221421850-421075112147483647100-42107511-21474836481852551281255121325511011702432211421700-421075111214748364700-421075111-2147483648170255128112554225511101722432221421700-421075121214748364700-421075021-214748364817125512821255212551210";
		assertEquals(ExpectedResult, result);
	}


  
	@Test(timeout = 4000)
	public void test_9_2134() throws Throwable {
		String result = "";
		int R = 100;
		int G = 1;
		int B = 200;
		HSLColor c = new HSLColor();
		
	  	int n = 42;
	  	int n2 = 255;
	  	int n3 = 0;
	  	int n4 = 1;
	  	int n5 =2;
	  
	  	RGBtoHSL(c, n, n, n);
		result = GET2(c, result);
	  	RGBtoHSL(c, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE);
		result = GET2(c, result);
		RGBtoHSL(c, Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE);
		result = GET2(c, result);
		RGBtoHSL(c, n2,n2,n2);
		result = GET2(c, result);
		RGBtoHSL(c, n3,n3,n3);
		result = GET2(c, result);
		
	  	RGBtoHSL(c, n,n4,n4);
		result = GET2(c, result);
		RGBtoHSL(c, Integer.MAX_VALUE,n4,n4);
		result = GET2(c, result);
		RGBtoHSL(c, Integer.MIN_VALUE,n4,n4);
		result = GET2(c, result);
		RGBtoHSL(c,n2,n4,n4);
		result = GET2(c, result);
		RGBtoHSL(c,n3,n4,n4);
		result = GET2(c, result);
		
		
		RGBtoHSL(c,n4,n,n4);
		result = GET2(c, result);
		RGBtoHSL(c,n4,Integer.MAX_VALUE,n4);
		result = GET2(c, result);
		RGBtoHSL(c,n4,Integer.MIN_VALUE,n4);
		result = GET2(c, result);
		RGBtoHSL(c,n4,n3,n4);
		result = GET2(c, result);
		RGBtoHSL(c,n4,n3,n4);
		result = GET2(c, result);
		
		
		RGBtoHSL(c,n4,n4,n);
		result = GET2(c, result);
		RGBtoHSL(c,n4,n4,Integer.MAX_VALUE);
		result = GET2(c, result);
		RGBtoHSL(c,n4,n4,Integer.MIN_VALUE);
		result = GET2(c, result);
		RGBtoHSL(c,n4,n4,n2);
		result = GET2(c, result);
		RGBtoHSL(c,n4,n4,n3);
		result = GET2(c, result);
		
		RGBtoHSL(c,n5,n4,n);
		result = GET2(c, result);
		RGBtoHSL(c,n5,n4,Integer.MAX_VALUE);
		result = GET2(c, result);
		RGBtoHSL(c,n5,n4,Integer.MIN_VALUE);
		result = GET2(c, result);
		RGBtoHSL(c,n5,n4,n2);
		result = GET2(c, result);
		RGBtoHSL(c,n5,n4,n3);
		result = GET2(c, result);
		
		String ExpectedResult = "424242494935214748364721474836472147483647-1400-2147483648-2147483648-2147483648255-84214982552552552552552552550000004211111214748364711111-214748364811111255111110111111421111121474836471-8421502255-84215031-21474836481-8421502255-84215031255120010111111424242421121474836470255-111-21474836480001125525525525511000021424242422121474836470255-121-214748364800021255255255255210000";
    	assertEquals(ExpectedResult, result);
	}

  	private String BuildString(HSLColor c, float n, String result){
	  c.brighten(n);
	  result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
	  return result;
	}
  
  	private String BuildString2(HSLColor c, int n1, int n2, int n3, float n, String result){
	  c.blend(n1, n2, n3, n);
	  result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
	  return result;
	}
	@Test(timeout = 4000)
	public void test_10_2135() throws Throwable {
		    String result = "";
    int R = 100;
    int G = 1;
    int B = 200;
    HSLColor c = new HSLColor();
    assertNotNull(c);
    	int n = 42;
	  	int n2 = 255;
	  	int n3 = 0;
	  	int n4 = 1;
	  	int n5 =2;
	  
    RGBtoHSL(c,42,42,42);
	result = BuildString( c,  42f, result);
  
    c.brighten(0);
	 RGBtoHSL(c,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE);
   
    result = BuildString( c,  0.1f, result);
    RGBtoHSL(c, Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE);
    result = BuildString(c,  0.5f, result);
    RGBtoHSL(c, 255,255,255);
    result = BuildString( c,  1f, result);
    RGBtoHSL(c,0,0,0);
   	result =  BuildString( c,  1f, result);
    
    RGBtoHSL(c,42,1,1);
   	result =  BuildString( c,  1f, result);
	  
    RGBtoHSL(c, Integer.MAX_VALUE,1,1);
    result = BuildString( c,  1f, result);
	  
    RGBtoHSL(c,Integer.MIN_VALUE,1,1);
    result = BuildString( c,  0.5f, result);
	  
   RGBtoHSL(c,255,1,1);
   result = BuildString( c,  0.1f, result);
	  
    RGBtoHSL(c,0,1,1);
    result = BuildString( c,  0.1f, result);

    RGBtoHSL(c,1,42,1);
    result = BuildString( c,  1f, result);
	  
   RGBtoHSL(c,1,Integer.MAX_VALUE,1);
    result = BuildString( c,  1f, result);
	  
    RGBtoHSL(c,1,Integer.MIN_VALUE,1);
    result = BuildString( c,  0f, result);
	  
    RGBtoHSL(c,1,255,1);
   result =  BuildString( c,  1f, result);
	  
    RGBtoHSL(c,1,0,1);
    result = BuildString( c,  1f, result);
    
    result = BuildString2(c,1,1,42,1f, result);
	  
    result = BuildString2(c, 1,1,Integer.MAX_VALUE,1f, result);
	  
    result = BuildString2(c,1,1,Integer.MIN_VALUE,1f, result);
	  
    result = BuildString2(c,1,1,255,1f, result);
	  
    result = BuildString2(c,1,1,0,1f, result);
    
    result = BuildString2(c,2,1,42,0.1f, result);
	  
   	result = BuildString2(c,2,1,Integer.MAX_VALUE,0.1f, result);
	  
    result = BuildString2(c,2,1,Integer.MIN_VALUE,0.1f, result);
	  
    result = BuildString2(c,2,1,2550,1f, result);

    result = BuildString2(c,2,1,0, 0.1f, result);
    
    String ExpectedResult = "424225525525525521474836472147483647255249255255-2147483648-214748364800002552552552552552550000004211111214748364711111-214748364810000255100000100001421111121474836471-8421502255-84215031-21474836481-8421502255-8421503125512001011111702432211421700-421075111214748364700-421075111-2147483648170255128112554225511101701533114170-4-21053721121474837142-54-231591111-21474834171-3181276212550171-3271148212294";
    assertEquals(ExpectedResult, result);
	}

  	private String SetSaturation(HSLColor c, int n, String result){
		c.setSaturation(n);
    	result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
	  	return result;
	}
	@Test(timeout = 4000)
	public void test_11_2139() throws Throwable {
		String result = "";
    int R = 100;
    int G = 1;
    int B = 200;
    HSLColor c = new HSLColor();
    
    RGBtoHSL(c,42,42,42);
	result = SetSaturation(c, 42, result);
    
	 String ExpectedResult = "1234"; 
     assertFalse(result.equals(ExpectedResult));
      
    RGBtoHSL(c,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE);
	result = SetSaturation(c, 0, result);
    
	RGBtoHSL(c,Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE);
    result = SetSaturation(c, 5, result);
    
	RGBtoHSL(c,255,255,255);
    result = SetSaturation(c, 1, result);
    
	RGBtoHSL(c,0,0,0);
    result = SetSaturation(c, 100, result);
    
    RGBtoHSL(c,42,1,1);
	result = SetSaturation(c, Integer.MAX_VALUE, result);
    
	RGBtoHSL(c,Integer.MAX_VALUE,1,1);
    result = SetSaturation(c, Integer.MIN_VALUE, result);
    
	RGBtoHSL(c,Integer.MIN_VALUE,1,1);
    result = SetSaturation(c, -1, result);
    
	RGBtoHSL(c,255,1,1);
    result = SetSaturation(c, 42, result);
    
	RGBtoHSL(c,0,1,1);
    result = SetSaturation(c, 42, result);

    RGBtoHSL(c,1,42,1);
    result = SetSaturation(c, 10, result);
    
	RGBtoHSL(c,1,Integer.MAX_VALUE,1);
    result = SetSaturation(c, 1000, result);
    
	RGBtoHSL(c,1,Integer.MIN_VALUE,1);
    result = SetSaturation(c, 0, result);
    
	RGBtoHSL(c,1,255,1);
    result = SetSaturation(c, -1, result);
    
	RGBtoHSL(c,1,0,1);
    result = SetSaturation(c, Integer.MAX_VALUE, result);
    
    result = BuildString2(c,1,1,42,1f, result);
    
    result = BuildString2(c,1,1,Integer.MAX_VALUE,1f, result);
    
    result = BuildString2(c,1,1,Integer.MIN_VALUE,1f, result);
    
    result = BuildString2(c,1,1,255,1f, result);
    
   	result = BuildString2(c,1,1,0,1f, result);
    
    result = BuildString2(c,2,1,42,0.1f, result);

    result = BuildString2(c,2,1,Integer.MAX_VALUE,0.1f, result);

    result = BuildString2(c,2,1,Integer.MIN_VALUE,0.1f, result);

    result = BuildString2(c,2,1,2550,1f, result);

    result = BuildString2(c,2,1,0, 0.1f, result);

    
    String ExpectedResult2 = "424242494935214748364702147483647842150384215038421503-21474836485-2147483648000255125525525525501000000422551220214748364701111-2147483648011112554211110421111110111112551200101111101111125512001702432211421700-421075111214748364700-421075111-2147483648170255128112554225511101701533114170-4-21053721121474837142-54-231591111-21474834171-3181276212550171-3271148212294";
    assertEquals(ExpectedResult2, result);
	}

  
  	private String BuildStringBrighten(HSLColor c, float f, String result, boolean BuildString){
		c.brighten(f);
    		if(BuildString == true){
	  			result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
			}
	  	return result;
	}
  
  	private void SimplyBlend(HSLColor c, int n1, int n2, int n3, float f){
		c.blend(n1,n2,n3,f);
	}
  
	@Test(timeout = 4000)
	public void test_12_2141() throws Throwable {
		String result = "";
    int R = 100;
    int G = 1;
    int B = 200;
    HSLColor c = new HSLColor();
    
    RGBtoHSL(c,42,42,42);
	result = BuildStringBrighten(c, 42f, result, true);
    
	result = BuildStringBrighten(c, 0, result, false);
    
	RGBtoHSL(c,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE);
    result = BuildStringBrighten(c, 0.1f, result, true);
    
	RGBtoHSL(c,Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE);
    result = BuildStringBrighten(c, 0.5f, result, true);
    
	RGBtoHSL(c,255,255,255);
    result = BuildStringBrighten(c, 1f, result, true);

   	RGBtoHSL(c,0,0,0);
    result = BuildStringBrighten(c, 1f, result, true);
    
    RGBtoHSL(c,42,1,1);
    result = BuildStringBrighten(c, 1f, result, true);
    
	RGBtoHSL(c,Integer.MAX_VALUE,1,1);
    result = BuildStringBrighten(c, 0, result, true);
    
	RGBtoHSL(c,Integer.MIN_VALUE,1,1);
    result = BuildStringBrighten(c, 0.5f, result, true);
    
	RGBtoHSL(c,255,1,1);
    result = BuildStringBrighten(c, 0.1f, result, true);
    
	RGBtoHSL(c,0,1,1);
    result = BuildStringBrighten(c, 0.1f, result, true);

    RGBtoHSL(c,1,42,1);
    result = BuildStringBrighten(c, 1f, result, true);
    RGBtoHSL(c,1,Integer.MAX_VALUE,1);
    result = BuildStringBrighten(c, 1f, result, true);
    RGBtoHSL(c,1,Integer.MIN_VALUE,1);
    result = BuildStringBrighten(c, 0, result, true);
    RGBtoHSL(c,1,255,1);
    result = BuildStringBrighten(c, 1f, result, true);
    RGBtoHSL(c,1,0,1);
    result = BuildStringBrighten(c, 1f, result, true);
    
    result = BuildString2(c,1,1,42,1f,result);

 
    result = BuildString2(c,1,1,Integer.MAX_VALUE,1f,result);
   
    result = BuildString2(c,1,1,Integer.MIN_VALUE,1f,result);
    
 
    result = BuildString2(c,1,1,255,1f,result);
    
    result = BuildString2(c,1,1,0,1f,result);
   
    SimplyBlend(c,2,1,42,0.1f);
	result = BuildStringBrighten(c, 10f, result, true);
    SimplyBlend(c,2,1,Integer.MAX_VALUE,0.1f);
	result = BuildStringBrighten(c, 100f, result, true);
    SimplyBlend(c,2,1,Integer.MIN_VALUE,0.1f);
	result = BuildStringBrighten(c, 50f, result, true);
    SimplyBlend(c,2,1,2550,1f);
	result = BuildStringBrighten(c, 42, result, true);
    SimplyBlend(c,2,1,0, 0.1f);
	result = BuildStringBrighten(c, 101, result, true);
    
    String ExpectedResult = "17002552552552551700000017000000170025525525525517000000024322431100-421075121474836471185000000255122400127255000085243221431850000000-42107511-21474836481852551281255121325512021702432211421700-421075111214748364700-421075111-21474836481702551281125542255111017015330121248170-400002-4255254255255171-318255255255254424255255255255";
    assertEquals(ExpectedResult, result);
	}
  
  	private String ReverseBuild(HSLColor c, String result){
		c.reverseColor();
    	result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
	  	return result;
	}
	@Test(timeout = 4000)
	public void test_13_2143() throws Throwable {
		String result = "";
    int R = 100;
    int G = 1;
    int B = 200;
    HSLColor c = new HSLColor();
    
    RGBtoHSL(c,42,42,42);
	result = ReverseBuild(c, result);
    REVERSE(c);
   
    
	RGBtoHSL(c,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE);
    result = ReverseBuild(c, result);
    RGBtoHSL(c,Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE);
    result = ReverseBuild(c, result);
    RGBtoHSL(c,255,255,255);
    result = ReverseBuild(c, result);
    RGBtoHSL(c,0,0,0);
    result = ReverseBuild(c, result);
    
    RGBtoHSL(c,42,1,1);
    result = ReverseBuild(c, result);
    RGBtoHSL(c,Integer.MAX_VALUE,1,1);
    result = ReverseBuild(c, result);
    RGBtoHSL(c,Integer.MIN_VALUE,1,1);
    result = ReverseBuild(c, result);
    RGBtoHSL(c,255,1,1);
    result = ReverseBuild(c, result);
    RGBtoHSL(c,0,1,1);
    result = ReverseBuild(c, result);

    RGBtoHSL(c,1,42,1);
    result = ReverseBuild(c, result);
   	RGBtoHSL(c,1,Integer.MAX_VALUE,1);
    result = ReverseBuild(c, result);
    RGBtoHSL(c,1,Integer.MIN_VALUE,1);
    result = ReverseBuild(c, result);
    RGBtoHSL(c,1,255,1);
    result = ReverseBuild(c, result);
    RGBtoHSL(c,1,0,1);
   	result = ReverseBuild(c, result);
    
	result = BuildString2(c,1,1,42,1f,result);

    result = BuildString2(c,1,1,Integer.MAX_VALUE,1f,result);

    result = BuildString2(c,1,1,Integer.MIN_VALUE,1f,result);
  
    ReverseBuild(c, result);
    result = ReverseBuild(c, result);
    
    SimplyBlend(c,2,1,42,0.1f);
	result = ReverseBuild(c, result);
    SimplyBlend(c,2,1,Integer.MAX_VALUE,0.1f);
	result = ReverseBuild(c, result);
    SimplyBlend(c,2,1,Integer.MIN_VALUE,0.1f);
	result = ReverseBuild(c, result);
    SimplyBlend(c,2,1,2550,1f);
	result = ReverseBuild(c, result);
    SimplyBlend(c,2,1,0, 0.1f);
	result = ReverseBuild(c, result);
    
    String ExpectedResult = "4204242424242000004200000420255255255255420000012724322144431270-4210751-4210751-4210751-42107512120-4210751-4210751-4210751-42107511272551281255255254255120021224322431442120-4210751-4210751-4210751-42107511270-4210751-4210751-4210751-421075121225512825512558525510201702432211421700-421075111214748364700-421075111-21474836481270-4210751-4210751-4210751-42107512540-4210751-4210751-4210751-4210751420-3789672-3789672-3789672-37896724252905425255255255129-4210560425525525543-3181276255255416924811638229";
    assertEquals(ExpectedResult, result);
	}

  	private String SimplyBuildString(HSLColor c, String result){
		result += c.getHue(); result += c.getSaturation(); result += c.getLuminence(); result += c.getRed(); result += c.getGreen(); result += c.getBlue();
	  	return result;
	}
  
	@Test(timeout = 4000)
	public void test_14_2145() throws Throwable {
		String result = "";
    int R = 100;
    int G = 1;
    int B = 200;
    HSLColor c = new HSLColor();
    
    RGBtoHSL(c,42,42,42);
    result = ReverseBuild(c, result);
    
	REVERSE(c);
    
	RGBtoHSL(c,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE);
    result = ReverseBuild(c, result);
    
	RGBtoHSL(c,Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE);
    result = ReverseBuild(c, result);
    
	RGBtoHSL(c,255,255,255);
   	result = ReverseBuild(c, result);
    
	RGBtoHSL(c,0,0,0);
    result = ReverseBuild(c, result);
    
    RGBtoHSL(c,42,2,1);
    result = ReverseBuild(c, result);
    RGBtoHSL(c,Integer.MAX_VALUE,2,1);
    result = ReverseBuild(c, result);
   	RGBtoHSL(c,Integer.MIN_VALUE,2,1);
    result = ReverseBuild(c, result);
    RGBtoHSL(c,255,2,1);
   	result = ReverseBuild(c, result);
    RGBtoHSL(c,0,2,1);
    result = ReverseBuild(c, result);

    RGBtoHSL(c,1,42,2);
    result = ReverseBuild(c, result);
    RGBtoHSL(c,1,Integer.MAX_VALUE,2);
    result = ReverseBuild(c, result);
    RGBtoHSL(c,1,Integer.MIN_VALUE,2);
    result = ReverseBuild(c, result);
    RGBtoHSL(c,1,255,2);
    result = ReverseBuild(c, result);
    RGBtoHSL(c,1,0,2);
    result = ReverseBuild(c, result);

		
    RGBtoHSL(c,1,2,42);
	result = SimplyBuildString(c, result);
    RGBtoHSL(c,1,2,Integer.MAX_VALUE);
    result = SimplyBuildString(c, result);
    RGBtoHSL(c,1,2,Integer.MIN_VALUE);
   	result = SimplyBuildString(c, result);
    RGBtoHSL(c,1,2,255);
    result = SimplyBuildString(c, result);
    RGBtoHSL(c,1,2,0);
   	result = SimplyBuildString(c, result);

    String ExpectedResult = "4204242424242000004200000420255255255255420000012924322142431270-4210751-4210751-4210751-42107512120-4210750-4210750-4210750-42107501282551281255255233255120121424322431422120-4210751-4210751-4210751-4210751420-4210750-4210750-4210750-421075021325512825512556325511201682432212421700-4210751122147483647850-421075012-214748364816925512812255642551120";
    assertEquals(ExpectedResult, result);
	}

	@Test(timeout = 4000)
	public void test_15_2149() throws Throwable {
		String result = "";
    int R = 100;
    int G = 1;
    int B = 200;
    HSLColor c = new HSLColor();
    
    RGBtoHSL(c,42,42,42);
    result = BuildString2(c,41,41,41,0,result);
    
    RGBtoHSL(c,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE);
    result = BuildString2(c,40,44,44,-1,result);
   
    RGBtoHSL(c,Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE);
    result = BuildString2(c,40,40,40,-0.5f,result);
   
    RGBtoHSL(c,255,255,255);
    result = BuildString2(c,4,4,4,0.1f,result);
    
    RGBtoHSL(c,0,0,0);
    result = BuildString2(c,Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE,result);
    
    
    String ExpectedResult = "1700424242421700021474836472147483647214748364717000-2147483648-2147483648-2147483648170022922922922917000000"; 
    assertEquals(ExpectedResult, result);
	}

}
