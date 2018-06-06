package 上机练习;

public class 三角形 {
		public static final int row=4;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	for(int i=0;i<row;i++)
{
for(int j=0;j<row-i-1;j++)
{
	System.out.print(" ");
}
for(int j=0;j<i*2+1;j++)
{
	System.out.print("*");
}
System.out.println();
}
}
}