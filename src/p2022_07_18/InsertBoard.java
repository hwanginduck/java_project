package p2022_07_18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertBoard 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// 제일 먼저 할 것은 try catch에 필요한 객체를 먼저 만들어야 한다.
		// Connection 할때, java.sql 반드시 확인
		Connection con = null;
		// 편의상 preparedStatement 를 사용해서 sql문 작성 한다.
		PreparedStatement pstmt = null;
		//로딩을 하기 위한 드라이버 변수 선언
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@52.79.169.74:1521:xe";
		
		try
		{
			// driver를 불러옴
			Class.forName(driver);
			//컨넥션 생성 후 데이터 베이스에 접속을 하는데, url, 아이디, 비번을 설정 해줌.
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			// 테이블에 어떠한 값을 받아야 하는지 초기 컬럼을 확인 후 작성
			
			// BufferedReader 객체 생성(객체생성 자체는 예외가 발생하지 않기 때문에 try 밖에 생성해도 무방함.)
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("작성자명을 입력하세요."); // 줄을 바꾸지 않고 입력을 받겠다.
			// 변수명은 컬럼이랑 동일하게 하는 것이 일반적
			String writer = br.readLine(); // writer 변수에 입력 받은 값을 저장하겠다.
			System.out.print("비밀번호를 입력하세요.");
			String passwd = br.readLine();
			System.out.print("제목을 입력하세요.");
			String subject = br.readLine();
			System.out.print("내용을 입력하세요.");
			String content = br.readLine();
			
			// sql문 작성
			String sql = "insert into board ";
			// sql문이 너무 길어질때는 아랫줄로 내린후 += 후 미리 한칸을 비우든 아래에서 한칸을 비우고 입력하든 둘중 하나 체택
			// 입력 받을 데이터를 다시 테이블에서 확인한 후 종류와 갯수를 맞게 설정을 해준다.
			// 시퀀스는 테이블당 만들게 되는데 때문에 시퀀스 이름을 설정할때 테이블명을 포함해줘야 나중에 확인이 가능하다.
				   sql += "values(board_seq.nextval, ?, ?, ?, ?, sysdate)";
				   
			//
			pstmt = con.prepareStatement(sql);
			// 각 설정별 형태 확인 및 입력 받을 번호와 변수 입력 
			pstmt.setString(1, writer);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			
			//SQL문 실행 Method
			int result = pstmt.executeUpdate();	//SQL문을 실행하고 잘 실행되었다면 1을 리턴 받아 result에 1을 저장
			
			//실행이 잘 되어 result에 1이 저장 되었기 때문에 if문으로 확인함.
			if(result == 1)
			{
				System.out.println("글작성 성공");
			}
			else
			{
				System.out.println("글작성 실패");
			}
		}
		catch(Exception e)
		{
			// 예외가 발생하면 어떤 원인때문에 예외가 발생했는지 확인용
			e.printStackTrace();
		}
		//예외가 발생하든 안하든 finally는 무조건 실행
		finally	//무조건 발동하기 때문에 역순으로 닫아주는 역할
		{
			try
			{
				if(pstmt != null) pstmt.close();
				if(con != null) pstmt.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}


