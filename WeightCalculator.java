public class WeightCalculator
{
	public static void main (String [] args)
	{
		double weight = Double.parseDouble(args[0]);
				
		double weightMars = weight * 0.38;
		System.out.println("Mars :" + weightMars);
		
		double weightJupiter = weight * 2.36;
		System.out.println("Jupiter: " + weightJupiter);
		
		double weightVenus = weight * 0.91;
		System.out.println("Venus: " + weightVenus);
		
		double weightSaturn = weight * 1.06;
		System.out.println("Saturn: " + weightSaturn);
		
	}
}	