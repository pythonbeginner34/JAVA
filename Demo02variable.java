public class Demo02variable {
	public static void main(String[] args){
		//创建变量
		//格式： 数据类型 变量名称；
		int num1;
		//向变量中存入一个数据
		//格式: 变量名称 = 数据值；
		num1 = 10;
		System.out.println(num1);//10
		//改变原来的数字。变成新的数字
		num1 = 20;
		System.out.println(num1);//20
		//直接初始化
		int num2 = 25;
		System.out.println(num2);
		num2 = 35;
		System.out.println(num2);
		System.out.println("========");
		byte num3 = 30;//-128~127;
		System.out.println(num3);
		//byte num4 = 400;
		//System.out.println(num4);error
		short num5 = 50;
		System.out.println(num5);
		
		long num6 = 3000000000L;
		System.out.println(num6);
		
		float num7 = 2.5F;
		System.out.println(num7);
		
		double num8 = 1.2;
		System.out.println(num8);
		
		char zifu1 = 'A';
		System.out.println(zifu1);
		
		zifu1 = '中';
		System.out.println(zifu1);
		
		boolean var1 = true;
		System.out.println(var1);
		
		var1 = false;
		System.out.println(var1);
		
		boolean var2 = var1;//将var1的值赋给var2
		System.out.println(var2);
		
	}
}