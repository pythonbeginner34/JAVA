/*
使用变量时，有一些注意事项：
1.如果创建多个变量，变量名不能重复
2.对于float 和long类型来说，字母后缀F和L不能丢
3.使用byte和short类型的变量时右面的数据值一定不能超过左边类型的范围。
4.变量一定要先初始化才能使用。
5.变量的使用不能超过作用域的适用范围。
【作用域】：从定义变量哪一行起，一直到直接所属的大括号结束为止。
6.可以通过一个语句来创建多个变量，但是一般情况不推荐这么写。
*/
public class Demo03variableNotice{
	public static void main(String[] args){
		int num1 = 10;//创建一个变量名叫num1
		//int num1 = 20;//又创建了一个变量num1 error
		int num2 = 20;
		
		int num3;
		num3 = 30;
		
		//int num4;//定一个变量没有进行初始化。
		//System.out.println(num4);
		
		//System.out.println(num5);//在创建变量之前不能使用它
		
		int num5 = 100;
		System.out.println(num5);
		{
			int num6 = 60;
			System.out.println(num6);
		}
		//int num6;//可以在创建一个num6，因为上一个num6，出了上一个作用域就被销毁了。
		//System.out.println(num6);//已经超出了作用域，变量不能使用了。
		
		//int a = 20;
		//int b = 10;
		//int c = 30;
	int a,b,c;//同时创建了三个全都是int类型的变量
	a = 10;
	b = 20;
	c = 30;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	//同时创建三个变量，并且同时各自赋值。
	int x = 100, y = 200, z = 300;
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	}
}