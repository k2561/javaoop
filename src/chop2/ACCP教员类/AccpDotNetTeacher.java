package chop2.ACCP教员类;

public class AccpDotNetTeacher extends AccpTeacher {
	/**
	 * �вι��췽����
	 * @param name ��Ա����
	 * @param school ��������
	 */
	public AccpDotNetTeacher(String name, String school) {
		super(name, school); // ���ø���Ĺ��췽��
	}
	/**
	 * ��д������ڿη�����
	 */
	public void giveLesson() {
		System.out.println("����Visual studio 2005��");
		super.giveLesson();
	}
}
