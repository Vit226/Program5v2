package org.itstep;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestClassModel {

	@Ignore
	@Test
	public void proba1inputWordByScaner1() {
	Model model = new Model();	
	String test1 = model.inputWordByScaner1("Vitalii");
	assertEquals("Vitalii" , test1);
	}
	
	@Ignore
	@Test
	public void proba2inputWordByScaner1() {
	Model model = new Model();	
	String test1 = model.inputWordByScaner1("Vitalii");
	assertEquals("Ivan" , test1);
	}
	
	@Ignore
    @Test
    public void proba3inputWordByScaner1() {
    	Model model = new Model();	
    	String test1 = model.inputWordByScaner1("Vitalii");
    	assertNull(test1);
    	}   

	@Ignore
  @Test
  public void proba4inputWordByScaner1() { 
	  Model model = new Model();  
	  String test1 = model.inputWordByScaner1("Ivan");
	  assertNull(test1);
	}
	
	@Ignore
	@Test
	public void proba1inputWordByScaner2() {
		Model model = new Model();
		float test2 = model.inputWordByScaner2(5.0f);
        assertEquals(5.0, test2);
	}
	
	@Ignore
	@Test
	public void proba1AinputWordByScaner2() {
		Model model = new Model();
		float test2 = model.inputWordByScaner2(2.0f);
        assertEquals(5.0, test2);
	}
	
	
		
	
	@Ignore
	@Test
	public void proba2inputWordByScaner2() {
		Model model = new Model();
		float test2 = model.inputWordByScaner2(5.0f);
        assertSame(5.0, test2);
	}
	
	@Ignore
	@Test
	public void proba3inputWordByScaner2() {
		Model model = new Model();
		float test2 = model.inputWordByScaner2(0.0f);
		
		
		assertSame(0.0, test2);
	}
	
	@Ignore
	@Test
	public void proba1writeSentence() {
		Model model = new Model();	
        String test3 = model.writeSentence("Vitalii",5); 
        assertEquals( "Vitalii "+"Vitalii "+5.0, test3);
	}
	
	@Ignore
	@Test
	public void proba2writeSentence() {
		Model model = new Model();	
        String test3 = model.writeSentence("Vitalii",5); 
        assertEquals( "Vitalii "+"Vitalii ", test3);
	}	
	
	@Ignore
	@Test
	public void proba3writeSentence() {
		Model model = new Model();	
        String test3 = model.writeSentence("Vitalii",5); 
        assertEquals( "Vitalii "+5.0, test3);
	}
	
	@Ignore
	@Test
	public void proba4writeSentence() {
		Model model = new Model();	
        String test3 = model.writeSentence("Vitalii",5); 
        assertEquals( "Vitalii "+"Ivan ",+5.0, test3);
	}
}


