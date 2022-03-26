package ab.tech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import ab.tech.entities.Category;

@RepositoryRestResource @CrossOrigin("http://localhost:4200")
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
