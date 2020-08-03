
public class ALtTest implements Cloneable {
	
	int a;
	ALtTest cloning() {
		try {
			return (ALtTest).super.clone();
		}
		catch(CloneNotSupportedException){
			
			
		}
	//	return null;
		
	}
	

}
