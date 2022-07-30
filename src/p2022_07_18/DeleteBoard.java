package p2022_07_18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteBoard 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		
		//DB 접속
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@52.79.169.74:1521:xe";
		
		try
		{
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			//삭제를 할 번호를 입력 받기 위한 BufferedReader 객체생성
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("삭제할 글번호를 입력하세요");
			//형변환!
			int no = Integer.parseInt(br.readLine());
			
//			String sql = "delete from board"; 여기까지하면 board에 있는 모든 데이터삭제
			String sql = "delete from board where no = ?"; // no에 맞는 데이터를 삭제해라
			
			pstmt = con.prepareStatement(sql);
			//setInt이기 때문에 no는 int형이 들어올수 있음
			pstmt.setInt(1, no);
			
			int result = pstmt.executeUpdate();//sql문 실행
			if(result ==1)
			{
				System.out.println("글삭제 성공");
			}
			else
			{
				System.out.println("글삭제 실패");
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
