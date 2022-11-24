package Java13;

class CCircleException extends Exception {
	public String toString() {
		return "CCircleException 例外被拋出了";
	}
}

class CCircle2 {
	private double radius;

	public void setRadius(double r) throws CCircleException {
		if (r < 0) {
			throw new CCircleException();
		} else
			radius = r;
	}

	public void show() {
		System.out.println("area=" + 3.14 * radius * radius);
	}
}

public class Class11 {

	public static void main(String[] args) {
		CCircle2 cir = new CCircle2();
		try {
			cir.setRadius(-2.0);
		} catch (CCircleException e) {
			System.out.println(e);
		}
		cir.show();
	}
}