package 上机练习;

public class BMI2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
double height;
double weight;
double bmi;

height = 70;
weight = 195;
bmi = weight/(height*height)*703;

System.out.println("Previous BMI:");
System.out.println(bmi);

weight = 180;
bmi = weight/(height*height)*703;

System.out.println("Current BMI:");
System.out.println(bmi);

weight = 217 ;
bmi = weight/(height*height)*703;

System.out.println("Current BMI2:");
System.out.println(bmi);
	}

}
