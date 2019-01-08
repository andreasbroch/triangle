package triangle;

public interface TriangleCheckerInterface {
	
	//The method that has to implemented in the concrete triangle checker stategy classes

	//Parameters
	//a, b and c - the length of the sides of the triangle
	//returns - True if the triangle is of the type else false
	public boolean check(float a, float b, float c); 
}
