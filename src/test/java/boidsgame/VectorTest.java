package boidsgame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class VectorTest {
	Vector v1;
	Vector v2;
	Vector v3;
	Vector v4;


	@BeforeEach
	public void setup() {
		// Vector equalVector = new Vector(100,100);
		v1 = new Vector(100,100);
		v2 = new Vector(90,10);
		v3 = new Vector(4,3);
		v4 = new Vector(-10,-10);

	}

	@Test
	@DisplayName("This test will check the vectors constructor.")
	public void testConstructor() {
		Vector testVector = new Vector(1,1);
	}

	@Test
	@DisplayName("This test will check the vectors getters.")
	public void testGetPosition() {
		// X cord
		assertEquals(100, v1.getPositionX());
		assertEquals(90, v2.getPositionX());
		assertEquals(4, v3.getPositionX());
		// Y cord
		assertEquals(100, v1.getPositionY());
		assertEquals(10, v2.getPositionY());
		assertEquals(3, v3.getPositionY());
	}

	@Test
	@DisplayName("This test will check the vectors equal method.")
	public void testEquial() {
		assertTrue(v1.equals(v1));
		assertFalse(v1.equals(v2));
	}

	@Test
	@DisplayName("This test will check the vectors additon.")
	public void testAddition() {
		v1.addition(v2);
		// v1 should be muteted
		assertEquals(190, v1.getPositionX());
		assertEquals(110, v1.getPositionY());
		assertTrue(new Vector(190,110).equals(v1));
		// v2 should not be muteted
		assertEquals(90, v2.getPositionX());
		assertEquals(10, v2.getPositionY());
		assertTrue(new Vector(90,10).equals(v2));

		// check negativ numbers:
		v4.addition(v3);
		assertTrue(new Vector(-6,-7).equals(v4));
		// Adding negativ numbers:
		v3.addition(v4);
		assertTrue(new Vector(-2,-4).equals(v3));
		// assertEquals(int[] {190},int[] {v1.getPositionX(),v1.getPositionY());
	}
	@Test
	@DisplayName("This test will check if addSeveralVectors cam add several vectors ")
	public void testAddSeveralVectors() {
		System.out.println((v1.addSeveralVectors(v2, v3, v4)));
		assertTrue((v1.addSeveralVectors(v2, v3, v4)).equals(new Vector(184, 103)));
	}
	@Test
	@DisplayName("This test will check if the length of a vector is correct.")
	public void testLength(){
		assertEquals(5, v3.length());
	}

	@Test
	@DisplayName("This test will check if the distenceBetweenVector gives right vektor")
	public void testDistenceBetweenVector(){
		// System.out.println(v1.distenceBetweenVector(v2).getPositionX());
		// System.out.println(v1.distenceBetweenVector(v2).getPositionY());
		assertTrue((v1.distenceBetweenVector(v2)).equals(new Vector(-10, -90)));
		// assertEquals(expected, v1.distenceBetweenVector(v2));
	}
}