class Data15 {
	int x;
	
//	public String toString() {
//		return  "값: "+x;
//	}
}
public class Obj1 {
	
	static Data15 copy(Data15 d) {
		Data15 tmp=new Data15();
		tmp.x=d.x;//값만 저장=>tmp와 d객체주소는 다르다
		return tmp;//ㅂ나환되는 값은 tmp객체주소가 반환
	}

	
	public static void main(String[] args) {
		Data15 d=new Data15();
		d.x=10;
		
		Data15 d2=copy(d);//copy()메서드 호출하면서 d객체주소를 전달.
		System.out.println("d.x="+d.x); //10
		System.out.println("d2.x="+d2.x); //10
		System.out.println(d2.toString());
	}
}
