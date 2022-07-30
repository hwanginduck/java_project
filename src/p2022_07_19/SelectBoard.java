package p2022_07_19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class SelectBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;
		//sql문을 실행하기 위한 객체
		PreparedStatement pstmt = null;
		//검색한 결과를 관리하는 객체 ( 검색되는 내용이 다를땐 별도로 설정해줘야 함 )
		//총데이터 갯수를 구하는 객체
		ResultSet  rs01 = null;
		//게시판 목록을 구하는 객체
		ResultSet  rs02 = null;
		
		int count= 0;	// 데이터 총 갯수
		
		//DB 접속
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost/jsptest";
		
		try
		{
			Class.forName(driver);
			con = DriverManager.getConnection(url, "jspid", "jsppass");
			
			//첫번째 총 갯수를 구하는 sql문
			//그룹함수 count(*) 총데이터를 구해주는 함수
			String sql = "select count(*) from board";
			
			pstmt = con.prepareStatement(sql); // 입력하는 값이 없기 때문에 ? 가 없다.
			
			//select 를 가져오기 때문에 executeQuery 로 실행
			rs01 = pstmt.executeQuery();
			
			if(rs01.next()) // 데이터를 잘 가져오면 true
			{
				count = rs01.getInt(1);			 // int형 둘중 어느걸 써도 무방함.
//				count = rs01.getInt("count(*)"); // String형
			}
			System.out.println("총데이터 수 : " +count);
			
			//전체 데이터를 가져오기
			System.out.println("번호\t작성자\t\t비밀번호\t\t제목\t\t내용\t\t날짜");
			System.out.println("----------------------------------------------------------------------------------------------------");
			
			//두번째 sql문
			sql = "select * from board order by no desc"; // 어떤 것을 기준으로 어떤 방식으로 정렬할 것인가 no를 기준으로 desc 내림차순으로 정렬
			
			pstmt = con.prepareStatement(sql);
			rs02 = pstmt.executeQuery(); //SQL문 실행
			
			//시간을 원하는 방식으로 출력하기 위해 설정
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			
			//여러개를 가져와야 하니 while문
			//rs02에서 가져온 데이터를 컬럼 별로 나눠서 새로운 변수에 저장
			while(rs02.next())
			{
				//컬럼명 따라서 받는 형태 및 컬럼명이 맞는지 잘 확인 할 것.
				int no = rs02.getInt("no");
				String writer = rs02.getString("writer");
				String passwd = rs02.getString("passwd");
				String subject = rs02.getString("subject");
				String content = rs02.getString("content");
				Timestamp ts = rs02.getTimestamp("reg_date");
				
				// 구한 값 출력
				System.out.print(no +"\t" +writer +"\t" +"\t" +passwd +"\t" +"\t");
				System.out.print(subject +"\t" +"\t" +content +"\t" +"\t" +sd.format(ts) +"\n");
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
				if(rs01 != null) rs01.close();
				if(rs02 != null) rs02.close();
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
