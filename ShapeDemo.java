class Shape
{
	private int width;
	private int height;
public void setWidth(int width)
{
this.width=width;
}
public int getWidth()
{
return width;
}
public void setHeight(int height)
{
this.height=height;
}
public int getHeight()
{
return height;
}
}
public class ShapeDemo
{
public static void main(String args[])
	{
	Shape sh=new Shape();
	sh.setWidth(5);
	sh.setHeight(20);
	
System.out.println("width is \t"+sh.getWidth()+"\t"+"height is\t"+sh.getHeight());
}
}