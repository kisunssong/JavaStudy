import com.abc.model.BoardVO;

public class Board09 {

	public static void main(String[] args) {
		
		BoardVO b = new BoardVO();
		b.setTitle("게시판 제목입니다."); b.setCont("게시판 내용입니다.");
		System.out.println("제목: "+b.getTitle());
		System.out.println("내용: "+b.getCont());
		
		
	}
}
