package a1q1;
import java.util.Scanner;

public class Temperature {
	private int fahrenheit;
	
	public Temperature(int fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	public int getFahrenheit() {
		return this.fahrenheit;
	}
	public void setFahrenheit(int temp) {
		this.fahrenheit = temp;
	}
	public int getCelsius() {
		return (this.fahrenheit - 32)*5/9;
	}
	public int getKelvin() {
		return ((this.fahrenheit-32)*5/9) + 273;
	}
	

	public static void main(String[] args) {
		Temperature temp1 = new Temperature(5);
		int number = temp1.getFahrenheit();
		System.out.println("Original temperature in Fahrenheit: "+Integer.toString(number)+"\nPlease enter your own temperature: ");
		Scanner scanner = new Scanner(System.in);
		int next_int = scanner.nextInt();
		scanner.close();
		temp1.setFahrenheit(next_int);
		number = temp1.getFahrenheit();
		System.out.println("New temperature \nin Fahrenheit: "+ Integer.toString(number));
		number = temp1.getCelsius();
		System.out.println("in Celsius: "+Integer.toString(number));
		number = temp1.getKelvin();
		System.out.println("In Kelvin: "+ Integer.toString(number));
	}

}
