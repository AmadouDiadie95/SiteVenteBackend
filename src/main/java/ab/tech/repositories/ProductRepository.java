package ab.tech.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import ab.tech.entities.Product;

@RepositoryRestResource @CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {

	// Requetes : localhost:8080/classes/search/byLevel?level=2e%Annee
	@RestResource(path = "/ByName")
	public Product findByName(@Param("name") String name) ;
	
	@RestResource(path = "/ByParticularity")
	public Product findByParticularity(@Param("particularity") String particularity) ;
	
	@RestResource(path = "/ByCategoryName")
	public List<Product> findByCategoryName(@Param("categoryName") String categoryName) ;
	 
	@RestResource(path = "/ByNameContains")
	public List<Product> findByNameContains(@Param("name") String name) ;
	
	@RestResource(path = "/ByPopulary")
	public List<Product> findByPopulary(@Param("populary") boolean populary) ;
	
	@RestResource(path = "/ByNewProduct")
	public List<Product> findByNewProduct(@Param("newProduct") boolean newProduct) ;
	
}
