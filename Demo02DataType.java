/*ǿ������ת��
1.�ص㣺������Ҫ��������ĸ�ʽ�������ܻ��Զ���ɡ�
2.��ʽ����ΧС������ ��ΧС�ı����� = ������С�����ͣ� ԭ������������ݡ�

ע������
1.ǿ������ת�����Ƽ�ʹ�ã���Ϊ�п��ܷ���������ʧ�����������
2.byte/short/char/���������Ͷ����Խ��мӼ��˳�
3.byte/short/char������������ʱ�����ȱ�����Ϊ��int���͡�
4.boolean���Ͳ��ܷ�����������ת����
*/
public class Demo02DataType{
	public static void main(String[] args){
		//�����int���ͣ��ұ���long���ͣ���һ��
		//long--> int ,���Ǵ�С����
		//���ܷ����Զ�����ת��
		
		int num1 = (int)100L;
		System.out.println(num1);
		
		//long����ǿ��ת����int����
		int num2 = (int)6000000000L;
		System.out.println(num2);//1705032704 �������
		
		//double--> intǿ������ת��
		int num3 = (int)3.5;
		System.out.println(num3);//3 ���ȶ�ʧ-������������
		
		char zifu1 = 'A';//����һ���ַ������������Ǵ�д��ĸA
		System.out.println(zifu1 + 1);
		//������ײ����һ�����������ƣ��������ַ�A
		//һ��char���ͽ������������㣬��ô�ַ��ͻᰴ��һ���Ĺ������һ������
		
		byte num4 = 40;
		byte num5 = 50;
		int result1 = num4 + num5;
		System.out.println(result1);
		
		short num6 = 60;
		short result2 = (short)(num6 + num4);
		//intǿ������ת��Ϊshort��ע������߼��ϱ�֤��ʵ��С������û�г���short��Χ������ᷢ�����������
		System.out.println(result2);
	}
}


