package week1Day2;

public class Firefox 
{
	float browserVersion=100.2f;
	String browserName="firefox";
	boolean isVisible=true;
	int releaseYear=1998;
	char browserLogo='f';
	public void firefoxData() 
	{
		System.out.println(browserVersion+"\n"+browserName+"\n"+isVisible+"\n"+releaseYear+"\n"+browserLogo);
	}

public static void main (String[] args) {
	Firefox obj =new Firefox();
	obj.firefoxData();			
	}	         
}