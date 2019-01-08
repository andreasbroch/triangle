package triangle;

public class TriangleChecker {
	
	// Returns the type of the triangle
	// Parameters
	// a - the length of the first side of the triangle
	// b - the length of the second side of the triangle
	// c - the length of the third side of the triangle
	// returns:
	// Enum TriangleType with the type of the triangle
	public TriangleType getType(float a, float b, float c) {
		
		System.out.printf("Side a = %.20f, side b = %.20f, side c = %.20f ", a, b, c);
		
		//make sanitychecks so sides will always be greater than 0
		if (a > 0 && b > 0 && c > 0) { 
		
			//check if the triangle is equilateral
			if ( this.check(a, b, c, new TriangleEquilateral()) ) {
				return TriangleType.EQUILATERAL;			
			} else {
				//check if the triangle is isoscles
				if ( this.check(a, b, c, new TriangleIsosceles())) {
					return TriangleType.ISOSCELES;
				} else {
					if ( this.check(a, b, c, new TriangleScalene()) ) {
						return TriangleType.SCALENE;
					}
				}
			}
		}
		
		return TriangleType.NOT_DEFINED;
	}
	
	// Invokes the check method of the given TriangleChecker
	// Parameters:
	// a, b and c - The length of the sides of the triangle
	// tc - The class that holds the implementation of the check method i. e. the strategy
	// returns
	// true if the triangle is of the type check in the in the strategy else false
	public boolean check(float a, float b, float c, TriangleCheckerInterface tc) {
		return tc.check(a, b, c);
	}
	
	
}
