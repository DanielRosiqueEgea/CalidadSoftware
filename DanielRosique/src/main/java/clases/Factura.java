package clases;

import java.util.ArrayList;

public class Factura {

	private int id;//cada factura tiene un id unico
	private double precio;
	private ArrayList<Producto> productos;
	
	public Factura(int id) {
		this.id=id;
		this.precio=0;
		this.productos= null;
	}
	
	public void createProductos() {
		this.productos= new ArrayList<Producto>();
	}
	
	/*
	 * Las unicas opciones dentro de la factura son la de a�adir o eliminar producto
	 */
	public void addProducto(Producto p) {
		
		//A�adido para las pruebas unitarias
		if(productos==null) {
			this.createProductos();
		}
		this.productos.add(p);
		this.precio+=p.getPrecio();
	}
	
	//a�adido para las pruebas unitarias
	public boolean hasProductos() {
		if(productos==null) {
			this.createProductos();
			return false;
		}
		return productos.size()==0;
	}
	
	public void removeProducto(int index) {
		this.precio=this.productos.get(index).getPrecio();
		this.productos.remove(index);
	}
	public ArrayList<Producto> getProductos(){
		return this.productos;
	}
	public int getId() {
		return this.id;
	}
	public double getPrecio() {//se podr�a recorrer el arrayList sumando los precios para obtenerlo.
		/*
		 * como vamos a usar muchas veces el precio, esta manera es mejor a nivel computacional 
		 * puesto que ya tiene el precio guardado en todo momento
		 */
		return this.precio;
	}
	
	public String toString() {
		String datos="";
		datos= "\nID FACTURA: "+this.id;
		datos="\nPRECIO FACTURA: "+this.precio;
		for(int i=0;i<this.productos.size();i++) {
			datos+="\nProducto: "+i;
			datos+=this.productos.get(i).toString();
		}
		return datos;
	}
	
	
	
}
