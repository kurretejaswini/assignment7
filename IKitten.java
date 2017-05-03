package world;

public interface IKitten {
	public void setName(String newName);
	public void setOwner(Person newOwner);
	public String getName() ;
	public Person getOwner() ;
	public int getAge();
	public void haveBirthDay();
	public String toString();
}

