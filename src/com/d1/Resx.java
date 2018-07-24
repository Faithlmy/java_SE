package com.d1;

public class Resx {
	
	/* 
	 * 1. �౻���ص�ʱ����ͨ�������ص�����������̬�����;�̬�ֶμ��ص��������еľ�̬��
	 * 2. ���Ⱦ�̬�ֶλ����Ĭ�ϳ�ʼ������  res=null       count1=0        count2=0
	 * 3. Ȼ��̬�ֶλ������ʾ��ʼ��������ͳ�������(�������Ӱ�����ĵط�)
	 * 4. ���� singTon ������ʾ��ʼ�� ���ᴴ�� ʵ�������ù��캯��,ִ������Ժ� ��ʱ count1=1   count2=1
	 * 5. Ȼ����Ǿ�̬���� count1��count2������ʾ��ʼ������Ϊcount1û����ʾ��ʼ��ֵ�����Խ������ count1=1,
	 *  ���� count2������������ʾ��ʼ����ֵ��Ϊ 1��  (�ڴ˹���֮ǰ��̬����count1��count2��û�н�����ʾ��ʼ����)
	 * 6.  Ȼ��ִ�о�̬������е����ݣ��˴�û�о�̬�����
	 * 7. �� private static Res res = new Res();  �ŵ�count2�ĺ���ͻ����1�� 2
	 * */
    private static Resx res = new Resx();  
    public static int count1;  
    public static int count2 = 1;  
//    private static Res res = new Res(); 
    
    private Resx() {
    	count1++;
    	count2++;
    }
    public static Resx getInstance() {
    	return res;
    }

	public static void main(String[] args) {
//		char c = (char)(Math.random()*26+'a');
////		System.out.println(c);
//		System.out.print(Math.random()*26);
		Resx res = Resx.getInstance();
		System.out.println(res.count1);
		System.out.println(res.count2);
	}
}
