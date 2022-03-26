package ab.tech.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Data @Builder @NoArgsConstructor @AllArgsConstructor @ToString
public class Product  {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name ;
	private String description ;
	private double price ;
	private int quantity ;
	private String colorsAvailaibles ;
	private String sizesAvailaibles ;
	private Date addDate ;
	private String categoryName ;
	private boolean populary ;
	private boolean newProduct ;
	private String particularity ;
	
	@Column(name = "image",length = 100000)
	private String image;
	
	@Column(name = "image2",length = 100000)
	private String image2;
	
	@Column(name = "image3",length = 100000)
	private String image3;
	
	@Column(name = "image4",length = 100000)
	private String image4;
	
	@Column(name = "image5",length = 100000)
	private String image5;

}
