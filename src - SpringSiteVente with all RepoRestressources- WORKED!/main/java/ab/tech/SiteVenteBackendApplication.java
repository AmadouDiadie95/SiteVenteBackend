package ab.tech;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;

import ab.tech.entities.Category;
import ab.tech.entities.Commande;
import ab.tech.entities.Image;
import ab.tech.entities.Product;
import ab.tech.repositories.CategoryRepository;
import ab.tech.repositories.ImageRepository;

@SpringBootApplication
public class SiteVenteBackendApplication {
	@Autowired
	private CategoryRepository categoryRepository ;
	@Autowired
	private RepositoryRestConfiguration restConfiguration ;
	@Autowired
	private ImageRepository imageRepository ;
	
	public static void main(String[] args) {
		SpringApplication.run(SiteVenteBackendApplication.class, args);
	}
	
	@Bean
	public ErrorViewResolver customErrorViewResolver() {
	    final ModelAndView redirectToIndexHtml = new ModelAndView("forward:/index.html", Collections.emptyMap(), HttpStatus.OK);
	    return (request, status, model) -> status == HttpStatus.NOT_FOUND ? redirectToIndexHtml : null;
	}
	
	@Bean
	public void init() {
		restConfiguration.exposeIdsFor(Category.class, Product.class, Image.class, Commande.class) ;
		if (imageRepository.findByIdentifier("header-caroussel-1") == null) {
			imageRepository.save(new Image(null, "Banner 1", "", "header-caroussel-1", "")) ;
		}
		if (imageRepository.findByIdentifier("header-caroussel-2") == null) {
			imageRepository.save(new Image(null, "Banner 2", "", "header-caroussel-2", "")) ;
		}
		if (imageRepository.findByIdentifier("header-banner-1") == null) {
			imageRepository.save(new Image(null, "Header 1", "", "header-banner-1", "")) ;
		}
		if (imageRepository.findByIdentifier("header-banner-2") == null) {
			imageRepository.save(new Image(null, "Header 2", "", "header-banner-2", "")) ;
		}
		if (imageRepository.findByIdentifier("header-banner-3") == null) {
			imageRepository.save(new Image(null, "Header 3", "", "header-banner-3", "")) ;
		}
		if (imageRepository.findByIdentifier("middle-banner-1") == null) {
			imageRepository.save(new Image(null, "Milieu 1", "", "middle-banner-1", "")) ;
		}
		if (imageRepository.findByIdentifier("middle-banner-2") == null) {
			imageRepository.save(new Image(null, "Milieu 2", "", "middle-banner-2", "")) ;
		}
		if (imageRepository.findByIdentifier("about-banner") == null) {
			imageRepository.save(new Image(null, "About Us", "Who we are", "about-banner", "")) ;
		}
		if (imageRepository.findByIdentifier("contact-banner") == null) {
			imageRepository.save(new Image(null, "Contact us", "Keep in touch with us", "contact-banner", "")) ;
		}
		
		if (imageRepository.findByIdentifier("who-we-are-banner") == null) {
			imageRepository.save(new Image(null, "Who We Are", "", "who-we-are-banner", "")) ;
		}
		
		if (imageRepository.findByIdentifier("team-1-banner") == null) {
			imageRepository.save(new Image(null, "Team 1", "", "team-1-banner", "")) ;
		}
		
		if (imageRepository.findByIdentifier("team-2-banner") == null) {
			imageRepository.save(new Image(null, "Team 2", "", "team-2-banner", "")) ;
		}
		
		if (imageRepository.findByIdentifier("team-3-banner") == null) {
			imageRepository.save(new Image(null, "Team 3", "", "team-3-banner", "")) ;
		}
		
		
	}

}
