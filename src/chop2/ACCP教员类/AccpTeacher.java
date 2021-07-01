package chop2.ACCP教员类;

public class AccpTeacher {
	private String name;	// ��Ա����
	private String school;	// ��������

	public AccpTeacher(String name, String school) {
		this.name = name;
		this.school = school;
	}
	/**
	 * ��Ա�ڿΡ�
	 */
	public void giveLesson(){
		System.out.println("֪ʶ�㽲�⡣");
		System.out.println("�ܽ����ʡ�");
	}  
	/**
	 * ���ҽ��ܡ�
	 */
	public void introduction() {
		System.out.println("��Һã�����"+ school + "��" + name + "��");
	}
}
