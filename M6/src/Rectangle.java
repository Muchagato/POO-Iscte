public class Rectangle extends AbstractFigure {
	private int width;
	private int height;

	public Rectangle(int x, int y, int width, int height) {
		super(x, y); // chamada do construtor da classe base
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width*height;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}
}