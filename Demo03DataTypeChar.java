/*
数字和字符的对照关系标（编码标）

ASCII码表： American Standard Code for Information Interchange
Unicode码表：万国码。也是数字与字符的对照关系，开头0~127部分和ASCII完全一样，但是从128开始包含有更多的字符。

'0'- 48
'A'- 65
'a'- 97
*/
public class Demo03DataTypeChar{
	public static void main(String[] args){
		char zifu1 = '1';
		System.out.println(zifu1 + 0);//49
		
		char zifu2 = 'A';
		
		char zifu3 = 'c';
		//左边是一个int类型，右边是一个char类型
		//char-->int 确实是重大到小
		//发生自动类型转换
		int num = zifu3;
		System.out.println(num);//99
		
		char zifu4 = '中';

		int num5 = zifu4;
		System.out.println(num5);20013
	}
}