package triangle;

public class TriangleBase {
	float epsilon = 0.00001f;
		
	// compare two floats by checking that the absolute difference is less than the epsilon threshold
	// parameters:
	// f1 - The first float
	// f2 - The second float
	// returns:
	// true if f1 and f2 are equal within the epsilon else false
	public boolean compare(float f1, float f2) {
		return Math.abs(f1 - f2) < epsilon;
	}
}
