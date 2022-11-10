package dukeExercises;
import java.text.DecimalFormat;
import java.util.Random;

public class RandomNumbers {
	
	//simulate rolling two dices
	
	public void simpleSimulate(int rolls) {
		Random rand = new Random();
		double[] numbers = new double[15];
		for(int i=0; i<rolls; i++) {
			int d1 = rand.nextInt(6) + 1;
			int d2 = rand.nextInt(6) + 1;
			numbers[d1+d2] +=1;
			}	
		DecimalFormat df = new DecimalFormat("0.00");	
		for(int i=2; i<13; i++) {
		System.out.println("Number: "+i+ " Quant: "+ numbers[i] +" Freq: "+df.format(100*(numbers[i]/rolls))+"%");
	}}
	

public static void main(String[] args) {
	RandomNumbers rn = new RandomNumbers();
	rn.simpleSimulate(100000);
}
	
}
