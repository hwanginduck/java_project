package p2022_07_19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateBoard 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Connection con = null;
		PreparedStatement pstmt = null;
		
		//DB 접속
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost/jsptest";
		
		try
		{
			Class.forName(driver);
			con = DriverManager.getConnection(url, "jspid", "jsppass");
			
			// 업데이트 할 내용 입력
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("수정할 글 번호를 입력하세요.");
			// 입력 받은 값을 String 형에서 int 형으로 입력 받으면서 형변환
			// 나중에 no 값에 int 형으로 들어가야 하기 때문
			int no = Integer.parseInt(br.readLine());
			System.out.print("작성자명을 입력하세요");
			String writer = br.readLine();
			System.out.print("비밀번호를 입력하세요");
			String passwd = br.readLine();
			System.out.print("제목을 입력하세요");
			String subject = br.readLine();
			System.out.print("내용을 입력하세요");
			String content = br.readLine();
			
			//업데이트문
			// 업데이트를 뭐하고, 뭐하고, 뭐할것이다 하고 where(어떤것을) no(보통 처음 만들때 primary 변수)에 해당하는것을 수정 할 것이다. 하는 것
			String sql = "update board set writer = ?, passwd = ?, subject = ?, ";
				   sql += "content = ?, reg_date = sysdate() where no = ?";
				   
				   pstmt = con.prepareStatement(sql);
				   pstmt.setNString(1, writer);
				   pstmt.setNString(2, passwd);
				   pstmt.setNString(3, subject);
				   pstmt.setNString(4, content);
				   pstmt.setInt(5, no);
				   
				   int result = pstmt.executeUpdate(); //sql문 실행 실행되면 1을 돌려줌
				   
				   if(result == 1)
				   {
					   System.out.println("글수정 성공");
				   }
				   else
				   {
					   System.out.println("글수정 실패");
				   }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
	}

}
