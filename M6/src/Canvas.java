import java.util.ArrayList;
import java.util.List;

public class Canvas {
	List<Figure> fList = new ArrayList<>();
	
	public void add(Figure f) {
		fList.add(f);
	}

	public void remove(Figure f) {
		fList.remove(f);
	}

	public void removeLargerFigure() {
		Figure fMax = null;
		double maxA = 0.0;
		for (Figure f : fList) {
			if (f.getArea() > maxA) {
				fMax = f;
				maxA = f.getArea();
			}
		}
		remove(fMax);
	}

	public double totalArea() {
		double total = 0.0;
		for (Figure f : fList) {
			total += f.getArea();
		}
		return total;
	}

	public static void main(String[] args) {
		Figure a = new Rectangle(0, 0, 10, 10);
		Figure b = new Rectangle(0, 0, 5, 5);
		Figure c = new Circle(0, 0, 5);
		Canvas canvas = new Canvas();
		canvas.add(a);
		canvas.add(b);
		canvas.add(c);
		canvas.remove(c);
		canvas.totalArea();
		canvas.removeLargerFigure();
	}
	
}
