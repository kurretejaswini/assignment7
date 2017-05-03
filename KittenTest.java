package world;
import world.IKitten;
import static org.junit.Assert.*;
import org.junit.Test;

import world.Kitten;
import world.Person;


import org.junit.Test;

public class KittenTest {
	@Test
	public void ownerTest() {
		Person p=new Person("Gregor Samsa");
		IKitten k=new Kitten("Bob",p);
		k.haveBirthDay();
		String result=k.toString();
		assertEquals("Bob the Feline is 1 and belongs to Gregor Samsa",result);
	}
	public void nameTest() {
		Person p=new Person("Gregor Samsa");
		IKitten k=new Kitten("Bob2",p);
		//k.haveBirthDay();
		String result=k.toString();
		assertEquals("Bob2 the Feline is 0 and belongs to Gregor Samsa",result);
	}
	public void ageTest() {
		Person p=new Person("Gregor Samsa");
		IKitten k=new Kitten("Jhonson",p);
		k.haveBirthDay();
		k.haveBirthDay();
		k.haveBirthDay();
		k.haveBirthDay();
		String result=k.toString();
		assertEquals("Jhonson the Feline is 4 and belongs to Gregor Samsa",result);
	}
}
