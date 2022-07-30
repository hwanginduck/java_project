package Id_hwang;
import java.text.DecimalFormat;
public class Homework_Circle extends CircleArea {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleArea per = new CircleArea();
		per.CircleArea(5.0);
	}
}
class CircleArea
{
	static void CircleArea(double r)
	{
		DecimalFormat df = new DecimalFormat("#.00");
		double perimeter = r * 2 * Math.PI;
		System.out.println("원주(원둘레)" +df.format(perimeter));
		
		double area = Math.pow(r, 2) * Math.PI;
		System.out.println("원의 면적" +df.format(area));
		
		double surface = 4 * Math.PI * Math.pow(r, 2);
		System.out.println("구의 표면적" +df.format(surface));
		
		double volume = (double)4 / (double)3 * Math.PI * Math.pow(r, 3);
		System.out.println("구의 체적(부피)" +df.format(volume));
	}
}