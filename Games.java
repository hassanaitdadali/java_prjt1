package projet1;

import java.util.Objects;

public class Games implements Comparable<Games>{
	private String id;
	private String name;
	private String type;
	private String releaseDate; 
	private double price;
	

	public Games(String id, String name, String type, String releaseDate, double price) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.releaseDate = releaseDate;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Games [name=" + name + ", type=" + type + ", releaseDate=" + releaseDate + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price, releaseDate, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Games other = (Games) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price)
				&& Objects.equals(releaseDate, other.releaseDate) && Objects.equals(type, other.type);
	}

	@Override
	protected Object clone(){
		return new Games(id, name, type, releaseDate, price);
	}

	@Override
	public int compareTo(Games o) {
		return this.id.compareTo(o.id);	
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
	
	

}
