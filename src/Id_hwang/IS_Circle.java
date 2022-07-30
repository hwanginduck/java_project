package Id_hwang;

import java.text.DecimalFormat;
import java.util.Scanner;

class DataFormt {

   double input, area, area2, gu_area, gu_volume;

//   public DataFormt(double input)
//   {
//	   this.input = input;
//   }
//   
//   public double getInput() {
//      return input;
//   }
//
//   public void setInput(double input) {
//      this.input = input;
//   }

   public double getArea() {
      return area;
   }

   public void setArea(double area) {
      area = 2 * Math.PI * area;
      this.area = area;
   }

   public double getArea2() {
      return area2;
   }

   public void setArea2(double area2) {
      area2 = Math.PI * Math.pow(area2, 2);
      this.area2 = area2;
   }

   public double getGu_area() {
      return gu_area;
   }

   public void setGu_area(double gu_area) {
      gu_area = 4 * Math.PI * Math.pow(gu_area, 2);
      this.gu_area = gu_area;
   }

   public double getGu_volume() {

      return gu_volume;
   }

   public void setGu_volume(double gu_volume) {
      gu_volume = Math.PI * Math.pow(gu_volume, 3) / (double) 3 * (double) 4;
      this.gu_volume = gu_volume;
   }
}

public class IS_Circle{

   public static void main(String[] args) {
      // TODO 자동 생성된 메소드 스텁
//      System.out.println("pow()="+ Math.pow(2,3));      // 2의 3승
//      DecimalFormat 
      DataFormt datf = new DataFormt();
      Scanner sc = new Scanner(System.in);
      System.out.print("값을 입력하세요  ");
      int input = sc.nextInt();
      
      datf.setArea(input);
      datf.setArea2(input);
      datf.setGu_area(input);
      datf.setGu_volume(input);

//      System.out.println(DataFormt.);
      
      
      
      DecimalFormat df = new DecimalFormat("#.00");
      System.out.println("원주(원둘레): " + df.format(datf.getArea()));
      System.out.println("원의 면적: " + df.format(datf.getArea2()));
      System.out.println("구의 면적: " + df.format(datf.getGu_area()));
      System.out.println("구의 부피: " + df.format(datf.getGu_volume()));

      System.out.println();

      System.out.println("원주(원둘레): " + df.format(datf.input));
      System.out.println("원의 면적: " + df.format(datf.area2));
      System.out.println("구의 면적: " + df.format(datf.gu_area));
      System.out.println("구의 부피: " + df.format(datf.gu_volume));

//      System.out.println(datf.getInput());
//      System.out.println(datf.getArea());

   }

private static void setArea2(int input) {
	// TODO Auto-generated method stub
	
}

}