package singleton;

public class Singletonitis {
	
	private static Singletonitis instance;
	private String text;
	
	private Singletonitis(String text){
		this.text = text;
	}
	
	public static Singletonitis getInstance(){
		if(instance == null){
			return new Singletonitis("Hehehe :)");
		}else{
			return instance;
		}
	}
	
	public void print(){
		System.out.println(text);
	}

}
