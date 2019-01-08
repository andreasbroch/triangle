package triangle;

public class TriangleScalene extends TriangleBase implements TriangleCheckerInterface {

	
	@Override
	public boolean check(float a, float b, float c) {
		return !compare(a, b) &&
				!compare(b, c) &&
				!compare(a, b);
	}

}
