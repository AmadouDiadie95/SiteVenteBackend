package ab.tech.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Commande {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	private Date commandeDate ;
	private String clientName ;
	private String clientPrenom ;
	private String clientAdresse ;
	private String clientEmail ;
	private String clientTel ;
	private String productName ;
	private double productPrice ;
	private int quantityChoiced ;
	private double totalPrice ;
	private String colorChoiced ;
	private String sizeChoiced ;
	private String particularity ;
	private boolean done = false ;
	private Date commandeDoneDate ;
}
