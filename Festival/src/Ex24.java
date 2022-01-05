
public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMiddle("test"));
	}

	private static String getMiddle(String str) {
		String result;
		if(str.length()%2==0) {
			result = str.substring(str.length()/2-1,str.length()/2+1); 
		}else {
			result = str.substring(str.length()/2,str.length()/2+1);
		}
		return result;
	}

}
