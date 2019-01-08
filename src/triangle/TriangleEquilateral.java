package triangle;

public class TriangleEquilateral extends TriangleBase implements TriangleCheckerInterface {

	//Checks that all side of the triangle are equal length i. e. equilateral
	//Parameters
	//a, b and c - the length of the sides of the triangle
	//returns - True if the triangle is equilateral else false
	@Override
	public boolean check(float a, float b, float c) {
		return compare(a, b) && compare(b, c) && compare(a, c);
	}

}
