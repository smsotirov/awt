package net.pragmasource.awt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestDataClass {
	
	@BeforeAll
	public void beforeAllTests() {
		//XXX: Default placeholder
		System.out.println("Run before all tests.");
	}//beforeAllTests
	
	
	@BeforeEach
	public void beforeEachTest() {
		//XXX: Default placeholder
		System.out.println("Run before each test.");
	}//beforeEachTest
	

	@Test
	public void test() {
		DataClass dtclss = new DataClass();
		
		LocalDateTime testDateTime = LocalDateTime.now();
		
		dtclss.setId(1);
		dtclss.setName("Nameee");
		dtclss.setDate(testDateTime);
		
		assertEquals(1, dtclss.getId());
		assertEquals("Nameee", dtclss.getName());
		assertEquals(testDateTime, dtclss.getDate());
		
		System.out.println("Test passed.");
		
	}//testSave
	
	
	@AfterEach
	public void afterEachTest() {
		//XXX: Default placeholder
		System.out.println("Run after each test.");
	}//afterEachTest
	
	
	@AfterAll
    public void afterAllTests() {
		//XXX: Default placeholder
		System.out.println("Run after all tests.");
    }//afterAllTests

}//TestDataClass
