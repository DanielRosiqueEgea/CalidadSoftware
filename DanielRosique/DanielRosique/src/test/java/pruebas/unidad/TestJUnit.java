package pruebas.unidad;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import clases.Factura;
import clases.Producto;

public class TestJUnit {

	Producto producto1 = new Producto("Tomate", 20.0f, 2);
	Factura factura1 = new Factura(1);
	
	@Test
	public void testPrecioFactura() {
		factura1.addProducto(producto1);
		factura1.removeProducto(0);
		assertEquals(0f,factura1.getPrecio(),0.2f);

		//el precio debe ser el mismo 
	}
	
	@Test
	public void testHasProductos() {
		factura1.addProducto(producto1);
		assertTrue(factura1.hasProductos());
	}
	@Test
	public void testEmptyProductos() {
		assertFalse(factura1.hasProductos());
	}
	
	@Test
	public void testNotNullProducto() {
		factura1.createProductos();
		assertNotNull(factura1.getProductos());
		//el primer producto no debe existir
	}
	@Test
	public void testNullProducts() {
		assertNull(factura1.getProductos());
		//el Array de productos debe ser null al construirse la clase
	}
	
	@Test
	public void testNotSamePointer() {
		factura1.addProducto(producto1);
	
	
		assertNotSame(producto1,factura1.getProductos().get(0));
	
	}
	
	@Test
	public void testSamePointer() {

		
		try {
			factura1.addProducto((Producto)producto1.clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		assertSame(producto1,factura1.getProductos().get(0));
	}
	
	
	@Test
	public void testArrayEquals() {
		factura1.addProducto(producto1);
		Producto productos[]= {producto1};;
		 assertArrayEquals(productos, factura1.getProductos().toArray());
		
	}
	
}
