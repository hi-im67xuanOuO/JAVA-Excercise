class Cat
{
	public int Age=10;
	private String animalType="test";
	private String catColor;

	Cat(String colorIn)
	{
		catColor=colorIn;
	}

	public String getCatsColor()//Cat類別的建構元
	{
		return catColor;
	}

	public String getCatsType()
	{
		return animalType;
	}
}
//這個檔案只是為了做出Cat物件