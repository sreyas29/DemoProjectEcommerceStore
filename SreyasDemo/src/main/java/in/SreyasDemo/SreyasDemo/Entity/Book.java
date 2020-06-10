package in.SreyasDemo.SreyasDemo.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="tbl_book")
@Getter
@Setter
@ToString
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String sku;
	
	private String name;
	
	private String description;
	
	@Column(name="unit_price")
	private String unitPrice;
	
	@Column(name="image_url")
	private String imageUrl;
	
		private String active;
	
	@Column(name="units_in_stock")
	private String unitsInStock;
	
	@Column(name="date_created")
	private Date dateCreated;
	
	@Column(name="last_updated")
	private Date lastUpdated;
	
	@ManyToOne
	@JoinColumn(name="category_Id")
	private BookCategory category;

}
