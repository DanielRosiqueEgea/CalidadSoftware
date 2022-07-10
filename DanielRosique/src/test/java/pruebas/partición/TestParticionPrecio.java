package pruebas.partición;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import clases.Factura;
import clases.Producto;

public class TestParticionPrecio {


	private double precio = 10.0f;
	
	Factura factura1 = new Factura(1);

	
	@Test
	public void testAddProducto() {
		factura1.addProducto(new Producto("Tomate",precio,1));
		assertEquals(precio,factura1.getPrecio(),0.0f);
	}
	
	@Test
	public void testRemoveProducto() {
		
		factura1.addProducto(new Producto("Tomate",10.0f,1));
		factura1.removeProducto(0);
		
		assertEquals(0.0f,factura1.getPrecio(),0.0f);
	}
	
	
}
