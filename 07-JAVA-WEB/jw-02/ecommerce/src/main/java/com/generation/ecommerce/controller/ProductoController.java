package com.generation.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.services.ProductoService;

import java.util.List;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,
		RequestMethod.PUT })

@RestController // que eres un controller para soportar metodos HTTP
@RequestMapping(path = "/miOtzo/productos/") // mappear la ruta de donde se ejecutan los metodos HTTP. indica la ruta de
												// nuestro endpoint para saber donde se manejan esas solicitudes HTTP.

public class ProductoController {

	// Inyeccion de dependencias
	// Instancia de la clase "ProductoService" que se utiliza para acceder a los
	// metodos definidos ahi. Se declara como final porque su valor no sera cambiado
	// despues de inicializar, para que esta instancia no cambie durante la
	// ejecucucion del programa.

	@Autowired // Se usa para indicar a Spring que inyecte automaticamente una instancia del
				// productoService en la clase ProductoController. Asi nos aseguramos que la
				// instancia esta disponible y lista para usarse cuando se necesite en la clase.
	private final ProductoService productoServicio; // no nos llames, nosotros te llamamos

//Segunda parte de inyeccion de dependencia
//constructor con ese objeto como parametro
	public ProductoController(ProductoService productoServicio) {
		this.productoServicio = productoServicio;
	}

//HTTP GET para todos los productos
	@GetMapping
	public List<Producto> getProductos() {
		return productoServicio.leerProductos();

	}
	
	//HTTP GET para un producto
	@GetMapping(path = "{prodId}")
	public Producto getProducto(@PathVariable("prodId")Long prodId) {
		return productoServicio.leerProducto(prodId);
	}

	// HTTP POST
	@PostMapping
	public void postProducto(@RequestBody Producto prod) { //no agrego un producto, agrego UN CUERPO a ese producto
		productoServicio.CrearProducto(prod); //disparo la operacion CRUD para modificar mi Base de Datos
	}

	//HTTP PUT
    @PutMapping(path="{prodId}")
    public void updateProducto(@PathVariable("prodId") Long prodId,
            @RequestParam(required=false) String nombre, 
            @RequestParam(required=false) String descripcion,
            @RequestParam(required= false) Double precio,
            @RequestParam(required=false) String url_Imagen) {
        productoServicio.actualizarProducto (prodId, nombre, descripcion,
                url_Imagen, precio);
    }// updateProducto

	// HTTP DELETE
	 @DeleteMapping(path = "{prodId}") //borrare elementos por ID (miOtzo/productos/Id)
	 public void deleteProducto(@PathVariable("prodId")Long prodId) {
		  productoServicio.borrarProducto(prodId);

	 }
}
