package triangle;

public class TriangleIsosceles extends TriangleBase implements TriangleCheckerInterface {

	//Checks that two sides of the triangle are of equal length i. e. isosceles
	//Parameters
	//a, b and c - the length of the sides of the triangle
	//returns - True if the triangle is isosceles else false
	@Override
	public boolean check(float a, float b, float c) {
		boolean result = false;
		
		if (compare(a, b) && !compare(a, c)) {
			result = true;
		}

		if (compare(a, c) && !compare(a, b)) {
			result = true;
		}

		if (compare(b, c) && !compare(a, b)) {
			result = true;
		}

		return result;
	}

}
