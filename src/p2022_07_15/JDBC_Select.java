package p2022_07_15;

import java.sql.*;

class  JDBC_Select{
  public static void main(String[] args)  {

	String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@172.30.1.13:1521:xe";

    Connection con  = null;  // 데이터베이스 연결 객체
    Statement  stmt = null;  // SQL문 실행 객체
    //---JDBC_Select 추가된 내용 -------
    ResultSet  rs   = null;  // 검색한 데이터를 관리하는 객체
	int no = 0; 
    String name, email, tel;  //데이터베이스에서 얻어온 필드값 저장할 변수 선언
    String sql;               //SQL문을 저장할 변수 선언

    try{
      Class.forName(driver);
      con = DriverManager.getConnection(url, "scott", "tiger" );
      stmt= con.createStatement();
      //---JDBC_Select 추가된 내용 -------
      sql = "SELECT * FROM customer order by no asc";
      
      System.out.printf("번호 \t 이름 \t\t 이메일 \t\t 전화번호 \n");
      System.out.printf("-----------------------------------------------------------------\n");
      rs = stmt.executeQuery(sql);  // SQL문 실행

      while( rs.next() ){		// 데이터를 1개씩 가져온다.
		 no = rs.getInt("no"); 
         name = rs.getString("name");  
         email = rs.getString("email");     
         tel   = rs.getString("tel"); 
        System.out.printf(" %d \t %s \t %s \t %s\n", no, name,email,tel);
      } 
    }catch(Exception e){
      System.out.println("데이터베이스 연결 실패!");
    }
    finally{
      try{//rs, stmt, con 객체를 close() 메서드를 호출해 해제
        if( rs != null )      rs.close();        
        if( stmt != null )    stmt.close();
        if( con != null )     con.close();
      }
      catch(Exception e){
        System.out.println( e.getMessage( ));  
      }
    }
  }
}  

