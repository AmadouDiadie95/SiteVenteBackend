package ab.tech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import ab.tech.entities.Image;

@RepositoryRestResource @CrossOrigin("http://localhost:4200")
public interface ImageRepository extends JpaRepository<Image, Long> {
	// Optional<Image> findByName(String name);
	
	@RestResource(path = "/ByIdentifier")
	public Image findByIdentifier(@Param("identifier") String identifier) ;
	
}
