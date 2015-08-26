/**
 * Exercise 10.2 from the book Introduction to Java Programming (10th).
 * <p>
 * The code that this exercise is based on can be found in the book. An extra
 * constructor have been added that makes it possible to specify the height in
 * feet and inches.
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class BMI {

	private String name;
	private int age;
	private double weight; // in pounds
	private double height; // in inches
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double METERS_PER_INCH = 0.0254;
	public static final double INCH_PER_FEET = 12;

	public BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public BMI(String name, double weight, double height) {
		this(name, 20, weight, height);
	}

	public BMI(String name, int age, double weight, double feet, double inches) {
		this(name, age, weight, feet * INCH_PER_FEET + inches);
	}

	public double getBMI() {
		double bmi = weight * KILOGRAMS_PER_POUND
				/ ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
		return Math.round(bmi * 100) / 100.0;
	}

	public String getStatus() {
		double bmi = getBMI();
		if (bmi < 18.5)
			return "Underweight";
		else if (bmi < 25)
			return "Normal";
		else if (bmi < 30)
			return "Overweight";
		else
			return "Obese";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}
}
