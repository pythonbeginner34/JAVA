/*
���ֺ��ַ��Ķ��չ�ϵ�꣨����꣩

ASCII��� American Standard Code for Information Interchange
Unicode�������롣Ҳ���������ַ��Ķ��չ�ϵ����ͷ0~127���ֺ�ASCII��ȫһ�������Ǵ�128��ʼ�����и�����ַ���

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
		//�����һ��int���ͣ��ұ���һ��char����
		//char-->int ȷʵ���ش�С
		//�����Զ�����ת��
		int num = zifu3;
		System.out.println(num);//99
		
		char zifu4 = '��';

		int num5 = zifu4;
		System.out.println(num5);20013
	}
}