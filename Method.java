public class Method {

	public  void OpenFile(MusicFile md)
	{
		System.out.println("Type="+ md.m_type);
		
	}
	
	//The Same name Methods but Parameters are different
	//This is Method overloading.
	
	public  void OpenFile(PhotoFile rd)
	{
		System.out.println("Type="+ rd.r_type);
	}
	
	
}
