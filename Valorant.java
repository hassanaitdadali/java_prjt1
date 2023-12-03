package projet1;

import java.util.Objects;

public class Valorant extends Games  {
	
	private String requirement;

	
	public Valorant(String id, String name, String type, String releaseDate, double price, String requirement) {
		super(id, name, type, releaseDate, price);
		this.requirement = requirement;
	}

	@Override
	public String toString() {
		return "Valorant [requirement=" + requirement + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(requirement);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valorant other = (Valorant) obj;
		return Objects.equals(requirement, other.requirement);
	}

	@Override
	protected Valorant clone(){
		return new Valorant( getId(), getName(), getReleaseDate(),getType() ,getPrice(), requirement);
	}
	
	
	
	
	
	
	
	
}
