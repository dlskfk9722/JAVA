package variable;

/*
 * ���α׷���:�̳���
 * ���� ���� ��¥:2019.03.19
 * ���� ����:���� Ȯ��
 */
public class VarTest {

	public static void main(String[] args) {
		// �ڹ��� �⺻(1�� �ּ�)
		System.out.println("������ �ι�° ���Դϴ�.");
		System.out.println("---------------");
		System.out.println();//enter
		
		byte time=15;//=���Կ�����,�Ҵ翬����
    //������Ÿ�� ������=��;
		int seconds=5124545;
		
		final double PI=3.14;//���
		//PI=3; ����� ���� ������ �� ����,����� �׻� ���� ���� ���´�.
		//����� �Ϲ������� ������� �빮�ڷ� ����.(final)
		
		char lastName='��';
		boolean lunch=true;//��:true,����:false
		
		System.out.println("���� �ð���?"+time);
		//+=>���� ������
		System.out.println("��ħ���� ���� �ʴ� ?"+seconds);
		System.out.println("pi�� ����?"+PI);
		System.out.println("���� �̸� ù���ڴ�?"+lastName);
		System.out.println("������ �Ծ�����?"+lunch);
		
		String name="�̳���";//String=>" "
		System.out.println("���� ��ü �̸���?"+name);

	}

}
