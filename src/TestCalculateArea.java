import java.util.Scanner;


public class TestCalculateArea extends CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculateArea ca = new CalculateArea();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the option number for which you want to calulate area of \n"
							+ " 1. Rectangle \n 2. Triangle");
		int option = sc.nextInt();
		switch(option) {
		
			case 1: double length;
					double breadth;
					System.out.println("Enter the length and breadth of Rectangle ");
					length = sc.nextInt();
					breadth = sc.nextInt();
					System.out.println("Area of Rectangle is " + ca.areaOfRectangle(length, breadth));
					break;
			case 2: double base;
					double height;
					System.out.println("Enter the base and height of Triangle ");
					base = sc.nextInt();
					height = sc.nextInt();
					System.out.println("Area of Triangle is " + ca.areaOfTraingle(base, height));
					break;
			default:System.out.println("Invalid Choice");
					break;
		}
	}

}
