class Car
{
	private String maker ;
	private String color ;
	private String bodyType ;

	private String accelerate()
	{
		String motion = "Óñêîðÿåòñÿ..." ;
		return motion;
	}

	public void setCar( String brand, String paint, String style )
	{
		maker = brand ;
		color = paint;
		bodyType = style;
	}

	public void getCar()
	{
		System.out.println( maker +" öâåò " + color );
		System.out.println( maker + " òèï êóçîâà " + bodyType );
		System.out.println( maker + "   " + accelerate() +"\n" );
	}
}

class SafeInstance
{
	public static void main( String[] args )
	{
		Car Porsche = new Car();
		Porsche.setCar( "Porsche", "Êðàñíûé", "Êóïå" );
		Porsche.getCar();

		Car Bentley = new Car();
		Bentley.setCar( "Bentley", "Çåëåíûé", "Ñåäàí" );
		Bentley.getCar();
	}
}

575307745402		

