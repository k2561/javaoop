package chop2.ACCP教员类;

public class AccpJavaTeacher extends AccpTeacher {

	public AccpJavaTeacher(String name, String school) {
		super(name, school); // ���ø���Ĺ��췽��
	}
	/**
	 * ��д������ڿη�����
	 */
	public void giveLesson() {
		System.out.println("���� Eclipse");
		super.giveLesson();
	}
}
