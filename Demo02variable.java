public class Demo02variable {
	public static void main(String[] args){
		//��������
		//��ʽ�� �������� �������ƣ�
		int num1;
		//������д���һ������
		//��ʽ: �������� = ����ֵ��
		num1 = 10;
		System.out.println(num1);//10
		//�ı�ԭ�������֡�����µ�����
		num1 = 20;
		System.out.println(num1);//20
		//ֱ�ӳ�ʼ��
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
		
		zifu1 = '��';
		System.out.println(zifu1);
		
		boolean var1 = true;
		System.out.println(var1);
		
		var1 = false;
		System.out.println(var1);
		
		boolean var2 = var1;//��var1��ֵ����var2
		System.out.println(var2);
		
	}
}