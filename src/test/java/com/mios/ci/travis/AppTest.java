package com.mios.ci.travis;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	@Test
    public void testApp()
    {
		Datos datos=new Datos();
		assertTrue(datos.getCadena().substring(0, 6).equals("cadena"));
    }
}
