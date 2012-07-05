import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 * TODO Put here a description of what this class does.
 *
 * @author rangesh.
 *         Created Jul 1, 2012.
 */
public class Solution {

	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
Solution sol=new Solution();
sol.input();
	}
void input()
{
	ArrayList<String> output=new ArrayList();
	InputStreamReader input=new InputStreamReader(System.in);
	BufferedReader inputs=new BufferedReader(input);
try {

	int flag=0,count=0,result=1000001,mincost=0,gencpy=0;
	String temp=inputs.readLine();
	int test=Integer.parseInt(temp);
	for(int i=0;i<test;i++)
	{
		String temps=inputs.readLine();	
		String tem[]=temps.split(" ");
int gene=Integer.parseInt(tem[2]);
gencpy=gene;
int lines=Integer.parseInt(tem[1]);
int junctions=Integer.parseInt(tem[0]);
int[][] mat=new int[junctions][junctions];
for(int j=0;j<junctions;j++)
{
	for(int k=0;k<junctions;k++)
	{
	mat[j][k]=0;	
	}
}
for(int i1=0;i1<lines;i1++)
{
String conn=inputs.readLine();
String cons[]=conn.split(" ");
int mat1=Integer.parseInt(cons[0]);
int mat2=Integer.parseInt(cons[1]);
int cost=Integer.parseInt(cons[2]);
mat[(mat1-1)][(mat2-1)]=cost;


}
for(int i2=0;i2<junctions;i2++)
{
	for(int j=0;j<junctions;j++)
	{
if((mat[i2][j])!=0)
{
flag=1;
}
	}
	if(flag==0)
	{
	count=count+1;	
	}
	flag=0;
}
if(count>gene)
{
output.add("Impossible!");	
}
else
{
	for(int i2=0;i2<junctions;i2++)
	{
		for(int j=0;j<junctions;j++)
		{
if(mat[i2][j]!=0)
{
if(mat[i2][j]<result)
{
result=mat[i2][j];	
flag=2;
}
}
		}
		if(flag==2)
		{
	mincost=mincost+result;
	//System.out.println("Result at "+i2+"Min"+result);
	//System.out.println("min cost"+mincost);
	result=1000002;
	flag=3;
		}
	}
	if(gencpy<junctions)
	{
output.add(String.valueOf(mincost));	
	}
	else
	{
	output.add("0");	
	}
}
count=0;
result=1000002;
mincost=0;
flag=0;
}
	for(int i=0;i<output.size();i++)
	{
	System.out.println(output.get(i));	
	}
} catch (IOException exception) {
	// TODO Auto-generated catch-block stub.
	exception.printStackTrace();
}
}
}
