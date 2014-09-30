
public class Triangle extends GeometricObject {
	private double side_1;
	
	private double side_2;
	
	private double side_3;
	
	public Triangle(){
		side_1= 1.0;
		
		side_2= 1.0;
		
		side_3= 1.0;
	}
	public Triangle(double side_1, double side_2, double side_3){
		this.side_1=side_1;
		this.side_2=side_2;
		this.side_3=side_3;}
	
	public double getside_1(){
		return side_1;}
	
	public double getside_2(){
		return side_2;}
	
	public double getside_3(){
		return side_3;}
	
	public double getPerimeter(){
		double p;
		p=(side_1+side_2+side_3);
		return(p);}
	
	public double getArea(){
		double x;
		
		x = getPerimeter();
		double Area;
		
		Area=Math.sqrt((x*(x-side_1)*(x-side_2)*(x-side_3)));
		
		return(Area);}
	
	public String toString(){
		return("Triangle with sides:" + this.side_1 + "," +this.side_2 +"and" +this.side_3 +". This triangle's perimeter is: " +getPerimeter() +". This triangles area is: " +getArea()  );
	}
}