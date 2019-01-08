package triangle;

public class Run {

	public static void main(String[] args) {
		
		//Unit tests for the TriangleChecker
		
		//Check a scalene triangle
		TriangleChecker tc = new TriangleChecker();
		TriangleType t = tc.getType(3.0f,4.0f,5.0f);
		
		compareType(t, TriangleType.SCALENE);

	
		//check an equilateral triangle
		t = tc.getType(3.0f,3.0f,3.0f);
		
		compareType(t, TriangleType.EQUILATERAL);
		
		//check an equilateral with floating precision loss
		
		//calcuate 0.1 added 10 times
		float a = 0.0f;
		for (int i=0; i<10; i++) {
			a += 0.1f;
		}
		t = tc.getType(a, 1.0f, 1.0f);
		
		compareType(t, TriangleType.EQUILATERAL);

		//check an isosceles triangle with side a and b equal	
		t = tc.getType(3.0f, 3.0f, 4.5f);
		
		compareType(t, TriangleType.ISOSCELES);
		
		//check an isosceles triangle with side a and c equal	
		t = tc.getType(3.0f, 4.5f, 3.0f);
		
		compareType(t, TriangleType.ISOSCELES);

		//check an isosceles triangle with side b and c equal	
		t = tc.getType(4.5f, 3.0f, 3.0f);
		
		compareType(t, TriangleType.ISOSCELES);

		//check an illegal triangle with negative side and a side of length 0
		t = tc.getType(-4.5f, 0.0f, 3.0f);
		
		compareType(t, TriangleType.NOT_DEFINED);

		
	}
	
	// Simple test function to compare if two types are the same
	// Parameters 
	// t1 and t2 - A TriangleType with the type of the triangle
	// returns
	// Nothing but will print Success if t1 == t2 else will print Failure
	public static void compareType(TriangleType t1, TriangleType t2) {
		if (t1 == t2) {
			System.out.println("Success");
		} else {
			System.out.println("Failure");
		}
	}

}
