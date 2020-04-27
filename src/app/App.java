package app;

import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		double weight, height, bmi;
		try {
			System.out.print("Your weight (in kilogram): ");
			weight = scanner.nextDouble();
	
			System.out.print("Your height (in meter): ");
			height = scanner.nextDouble();
	
			bmi = weight / Math.pow(height, 2);
	
			System.out.printf("%s %s", "bmi", "Interpretation\n");
	
			if (bmi < 18)
				System.out.printf("%f - %s", bmi, "Underweight");
			else if (bmi < 25.0)
				System.out.printf("%f - %s", bmi, "Normal");
			else if (bmi < 30.0)
				System.out.printf("%f - %s", bmi, "Overweight");
			else
				System.out.printf("%f - %s", bmi, "Obese");
		} catch (Exception e) {
			System.out.println("Bạn nhập sai định dạng: VD, chiều cao 1m65 nhập; 1,65 . cân lặng nhập tương tự.");
		}
	}
}
