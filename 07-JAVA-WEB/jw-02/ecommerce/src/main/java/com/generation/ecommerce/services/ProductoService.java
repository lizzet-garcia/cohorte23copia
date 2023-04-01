package com.generation.ecommerce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.repositories.ProductoRepository;

@Service
public class ProductoService {

	// Creo el objeto de la clase ProductoRepository
	private final ProductoRepository productoRepository;

	// cablear con el autowired
	@Autowired

	// uso ese objeto como parametro de mi constructor
	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}

	// Create (Metodo para agregar un objeto del tipo Producto y guardar en la base
	// de datos. Si el producto existe no deberia actualizar la base de datos porque
	// seria un objeto duplicado.)
	public void CrearProducto(Producto prod) { // objeto del tipo producto
		Optional<Producto> productoBuscado = // esta variable temporal llamada prodByName
				productoRepository.findByNombre(prod.getNombre());
		if (productoBuscado.isPresent()) {
			throw new IllegalStateException("El producto con el nombre " + "[" + prod.getNombre() + "] ya existe.");
		} else {
			productoRepository.save(prod);
		} // else //if
	}// addProducto
	
	

	// Read (leer una lista de productos)
	public List<Producto> leerProductos() {
		return productoRepository.findAll();
	}

	// Read (leer un producto con un id especifico)
	public Producto leerProducto(Long prodId) {
		return productoRepository.findById(prodId)
				.orElseThrow(() -> new IllegalStateException("El Producto " + "con el id " + prodId + " no existe."));

	}

	// Update para actualizar un producto
	 public void actualizarProducto(Long prodId, String nombre, String descripcion, String URL_Imagen, Double precio) {
		 
		 //Si el producto existe..
		 if(productoRepository.existsById(prodId)) {
			 //Entonces lo modifico
			 Producto productoABuscar = productoRepository.getById(prodId); //ya que verifico que mi producto existe lo traigo y asigno a una variable llamada productoABuscar.
			 if (nombre!=null) productoABuscar.setNombre(nombre);
			 if (descripcion!=null) productoABuscar.setDescripcion(descripcion);
			 if (precio!=null ) productoABuscar.setPrecio(precio);
			 if (URL_Imagen!= null ) productoABuscar.setURL_imagen(URL_Imagen);
			 
			 //cuando termino de editar el objeto...
			 productoRepository.save(productoABuscar);
		 } else {
			 System.out.println("el producto con el Id" + prodId + "no existe");
		 }

	 }

	// Delete
	 public void borrarProducto(Long prodId) {
		 if (productoRepository.existsById(prodId)) {
			 productoRepository.deleteById(prodId);
		 }

	 }

}
