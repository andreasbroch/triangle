package triangle;

public class TriangleScalene extends TriangleBase implements TriangleCheckerInterface {

	
	//Checks that no sides of the triangle are of equal length i. e. scalene
	//Parameters
	//a, b and c - the length of the sides of the triangle
	//returns - True if the triangle is scalene else false
	@Override
	public boolean check(float a, float b, float c) {
		return !compare(a, b) &&
				!compare(b, c) &&
				!compare(a, b);
	}

}
