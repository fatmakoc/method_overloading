public class Method_overloading {


	public static void main(String[] args) {
	
		Method method1=new Method();  //Create method1 object from Method class
		
		MusicFile md=new MusicFile();  //Create md object from Method class
		PhotoFile rd=new PhotoFile();
		
		method1.OpenFile(md);    
		method1.OpenFile(rd);
		
		

	}

}
