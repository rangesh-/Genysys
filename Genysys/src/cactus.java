import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * TODO Put here a description of what this class does.
 *
 * @author rangesh.
 *         Created Jun 30, 2012.
 */
public class cactus {

	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
cactus cac=new cactus();
cac.input();
	}
	void input()
	{
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader inputs=new BufferedReader(input);
	
		try {
			String inp=inputs.readLine();
			String temp[]=inp.split(" ");
			int vert=Integer.parseInt(temp[0]);
			int edge=Integer.parseInt(temp[1]);
	Float[][] mat=new Float[vert][vert];
	for(int i=0;i<vert;i++)
	{
	for(int j=0;j<vert;j++)
	{
		mat[i][j]=(float) 0;
	}
	}
	for(int i=0;i<vert;i++)
	{
		String inps=inputs.readLine();
		String temps[]=inps.split(" ");
		int v=Integer.parseInt(temps[0]);
		int e=Integer.parseInt(temps[1]);
		if(mat[(e-1)][(v-1)]==0)
		{
		mat[(v-1)][(e-1)]=(float) 1;
		mat[(e-1)][(v-1)]=(float) 2;
		}
	}
	Float[] count=new Float[vert];
	float t=0;
	//System.out.println("Matrix order");
	for(int i=0;i<vert;i++)
	{
	count[i]=(float) 0;	
	}
	for(int i=0;i<vert;i++)
	{
	for(int j=0;j<vert;j++)
	{
	if(mat[i][j]!=0.0)
	{
	count[i]=(float) (t+1.0);	
	t=count[i];
	}
	}
	t=0;
	}
	
	for(int i=0;i<vert;i++)
	{
		Float s=count[i];
	s=(1/s);
	//System.out.println(s);
	count[i]=s;
		
		}
		
	
	for(int i=0;i<vert;i++)
	{
	for(int j=0;j<vert;j++)
	{
	if(mat[i][j]==1.0)
	{
//	System.out.println(count[i]);
	mat[i][j]=count[i];	
	}
	}
	}
	float result=0;
	for(int i=0;i<vert;i++)
	{
	for(int j=0;j<vert;j++)
	{
if(mat[i][j]!=2)
{
	result=result+mat[i][j];
}
	}
	}
	System.out.printf("%.5f",result);
		} catch (IOException exception) {
			// TODO Auto-generated catch-block stub.
			exception.printStackTrace();
		}
	}

}
