package ab.tech.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Category {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id ;
	private String name ;
	private String description ;
	@Column(name = "image",length = 100000)
	private String image;
	
}
