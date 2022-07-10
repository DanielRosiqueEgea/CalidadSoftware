package pruebas.partición;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import clases.Factura;
import clases.Producto;

public class TestParticionProductos {


	double precio = 10.0f;
	Producto producto1 = new Producto("Tomate",precio,1);
	Factura factura1 = new Factura(1);

	
	@Test 
	public void testCreateProductos() {
		factura1.createProductos();
		assertNotNull(factura1.getProductos());
	}
	
	@Test
	public void testAddProducto() {
		factura1.addProducto(producto1);
		assertEquals(precio,factura1.getPrecio(),0.0f);
	}
	
	@Test 
	public void testRemoveProducto() {
		factura1.addProducto(producto1);
		factura1.removeProducto(0);
		assertFalse(factura1.hasProductos());
	}
	
	@Test
	public void testHasProductos() {
		factura1.addProducto(producto1);
		assertTrue(factura1.hasProductos());
	}
}
