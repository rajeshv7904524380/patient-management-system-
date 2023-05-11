package Project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Crudoperation {
	public static boolean insert(int id,String name,String disease,String Address,String gender,String deposited,String pending,String patienttype) throws ClassNotFoundException, SQLException
	{
		String str="insert into patient values(?,?,?,?,?,?,?,?)";
		Connection con=DButil.getConnection();
		PreparedStatement ps=con.prepareStatement(str);
		ps.setInt(1,id);
		ps.setString(2,name);
		ps.setString(3,disease);
		ps.setString(4,Address);
		ps.setString(5,gender);
		ps.setString(6,deposited);
		ps.setString(7,pending);
		ps.setString(8,patienttype);
		return ps.execute();
	}
	public static void delete(int id) throws ClassNotFoundException, SQLException
	{
		String str="delete from patient where id=?";
		Connection con=DButil.getConnection();
		PreparedStatement ps=con.prepareStatement(str);
		ps.setInt(1,id);
		ps.execute();
	}

		public static void update(String name,int id,String address) throws SQLException
		{
			Connection c=DButil.getConnection();
			String str="UPDATE patient SET patientname=? ,address=? where id=?";
			PreparedStatement ps=c.prepareStatement(str);
			ps.setString(1,name);
			ps.setString(2,address);
			ps.setInt(3,id);
			ps.execute();
			
		}
	
	public  static List<Patient> userdetails() throws SQLException
	{
		List<Patient> patients=new ArrayList<>();
		Connection c=DButil.getConnection();
		String str=" select * from patient";
		PreparedStatement ps=c.prepareStatement(str);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			Patient p=new Patient();
			p.setPatientid(rs.getInt(1));
			p.setPatientname(rs.getString(2));
			p.setDisease(rs.getString(3));
			p.setAddress(rs.getString(4));
			p.setGender(rs.getString(5));
			p.setDeposited(rs.getString(6));
			p.setPending(rs.getString(7));
			p.setPatientype(rs.getString(8));
			patients.add(p);
		}
		return patients;	
	}
//	public static void main(String[] args)
//	{
//		try {
//			update("buvi", 1);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	

}
