public class B {

	public static int s_num = 0; // static변수(정적) -- 프로그램이 시작될때 딱 한번만 만들어짐

	public int m_num = 0; // 인스턴스 변수(멤버변수) -- 객체가 만들어 질 때 마다 만들어 진다.

	public B() {
		s_num++;
		this.m_num++;

		System.out.println("s_num : " + s_num);
		System.out.println("n_num : " + m_num);

	}
	//정적 메소드 ->인스턴드변수 접근 불가
	public static void s_showInfo(){
		System.out.println("s_num: "+ s_num);
		//System.out.println("m_num: "+ m_num);	//error 인스턴스 변수(멤버변수)가 들어올수 없다 
		
	}
	
	public void m_showInfo(){
		System.out.println("s_num: "+ s_num);
		System.out.println("m_num: "+ m_num);
	}
	
	

}
