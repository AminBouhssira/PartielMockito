	package org.exemple.demo;
	
	
	import static org.junit.Assert.*;
	import static org.mockito.Mockito.when;
	
	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
	import org.mockito.Mockito;
	
	public class TestMockito {
		
		
		App add;
		App service = Mockito.mock(App.class);
	
		@Before
		public void setUp() throws Exception {
		}
	
		@After
		public void tearDown() throws Exception {
		}
	
		@Test
		public void testHello() {
			
			when(service.Hello()).thenReturn("John");
			assertEquals("John", service.Hello());
	
		}
		
		
	}
