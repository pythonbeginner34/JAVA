/*
ʹ�ñ���ʱ����һЩע�����
1.���������������������������ظ�
2.����float ��long������˵����ĸ��׺F��L���ܶ�
3.ʹ��byte��short���͵ı���ʱ���������ֵһ�����ܳ���������͵ķ�Χ��
4.����һ��Ҫ�ȳ�ʼ������ʹ�á�
5.������ʹ�ò��ܳ�������������÷�Χ��
�������򡿣��Ӷ��������һ����һֱ��ֱ�������Ĵ����Ž���Ϊֹ��
6.����ͨ��һ������������������������һ��������Ƽ���ôд��
*/
public class Demo03variableNotice{
	public static void main(String[] args){
		int num1 = 10;//����һ����������num1
		//int num1 = 20;//�ִ�����һ������num1 error
		int num2 = 20;
		
		int num3;
		num3 = 30;
		
		//int num4;//��һ������û�н��г�ʼ����
		//System.out.println(num4);
		
		//System.out.println(num5);//�ڴ�������֮ǰ����ʹ����
		
		int num5 = 100;
		System.out.println(num5);
		{
			int num6 = 60;
			System.out.println(num6);
		}
		//int num6;//�����ڴ���һ��num6����Ϊ��һ��num6��������һ��������ͱ������ˡ�
		//System.out.println(num6);//�Ѿ������������򣬱�������ʹ���ˡ�
		
		//int a = 20;
		//int b = 10;
		//int c = 30;
	int a,b,c;//ͬʱ����������ȫ����int���͵ı���
	a = 10;
	b = 20;
	c = 30;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	//ͬʱ������������������ͬʱ���Ը�ֵ��
	int x = 100, y = 200, z = 300;
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	}
}