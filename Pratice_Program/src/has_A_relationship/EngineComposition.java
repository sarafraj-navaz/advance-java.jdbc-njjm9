package has_A_relationship;

public class EngineComposition {

	String name;
	int strokes;
	int type;
	
	
	EngineComposition()
	{
		
	}
	EngineComposition(String name,int strokes,int type)
	{
		this.name=name;
		this.strokes=strokes;
		this.type=type;
	}
	public void displayEngine()
	{
		System.out.println("Engine name "+name);
		System.out.println("engine strokes "+strokes);
		System.out.println("Engine type "+type);
	}
}
