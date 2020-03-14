public class Circle extends AbstractFigure{
	private int radius;
	
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override // o getPerimeter() do circle sobrepõe-se ao da interface
	public double getPerimeter() {
		return 2* Math.PI * radius;
	}
}
