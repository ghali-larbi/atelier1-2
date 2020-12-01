package atelier1;

public class exercice3 {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			String v=",";
			if(i==10)
			{
				v=" ";
			}
			System.out.print(i+v);
		}
		System.out.println("");
		for(int i=1;i<=10;i++) 
		    {
			String s=",";
			if(i==10 && s==" ")
			System.out.print(i+s);
			if(i==10) {
				s=" ";
			System.out.print(i+s);
				break;
			}
			for (int j=101;j>92;j--) 
			{
				System.out.print(j-i+s);
				break;
			}
		}
	}
}
