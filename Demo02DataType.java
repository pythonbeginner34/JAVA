/*强制类型转换
1.特点：代码需要进行特殊的格式处理，不能会自动完成。
2.格式：范围小的类型 范围小的变量名 = （变量小的类型） 原本变量大的数据。

注意事项
1.强制类型转换不推荐使用，因为有可能发生精度损失、数据溢出。
2.byte/short/char/这三种类型都可以进行加减乘除
3.byte/short/char三种类型运算时都会先被提升为，int类型。
4.boolean类型不能发生数据类型转换。
*/
public class Demo02DataType{
	public static void main(String[] args){
		//左边是int类型，右边是long类型，不一样
		//long--> int ,不是从小到大
		//不能发生自动类型转换
		
		int num1 = (int)100L;
		System.out.println(num1);
		
		//long类型强制转换成int类型
		int num2 = (int)6000000000L;
		System.out.println(num2);//1705032704 数据溢出
		
		//double--> int强制类型转换
		int num3 = (int)3.5;
		System.out.println(num3);//3 精度丢失-不是四舍五入
		
		char zifu1 = 'A';//这是一个字符变量，里面是大写字母A
		System.out.println(zifu1 + 1);
		//计算机底层会用一个数（二进制）来代替字符A
		//一旦char类型进行了数字运算，那么字符就会按照一定的规则翻译成一个数字
		
		byte num4 = 40;
		byte num5 = 50;
		int result1 = num4 + num5;
		System.out.println(result1);
		
		short num6 = 60;
		short result2 = (short)(num6 + num4);
		//int强制类型转换为short；注意必须逻辑上保证真实大小本来就没有超过short范围，否则会发生数据溢出。
		System.out.println(result2);
	}
}


