class ExceptionInCommandLineDemo{
	public static void main(String[] args) {
		try
		{
			int i= Integer.parseInt(args[0]);
			System.out.println(i);
		}
		//System.out.println("wipro");
		catch(NumberFormatException e)
		{
			System.out.println("e:"+e);
		}

	}
}