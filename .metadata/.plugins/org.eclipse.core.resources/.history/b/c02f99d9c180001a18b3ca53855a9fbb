package maximum;

public class AngleMeasurement {
	
	public Double calculateAngle(int hrHand , int minHand)
	{
		Double minHandPos = getMinHandPosition(minHand);
		Double hrHandPos = getHrHandPosition(hrHand, minHandPos);
		
		if(hrHandPos > minHand)
		{
			 return hrHandPos - minHand;
		}
		else
		{
			return minHand - hrHandPos;
		}
		
	}

	
	public Double getMinHandPosition(int minHand)
	{
		Double val =0.00;
	
		val =  6.00 * minHand;
		
		return val;
	}
	
	public Double getHrHandPosition(int hrHand , Double minHand)
	{
		Double val =0.00;
		if(hrHand ==  12)
			hrHand = 0;
	
		val =  (30.00 * hrHand) +  minHand/12.00;
		
		return val;
	}
	
	

}
