package AdminDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Project.DButil;

public class UserDao {
	public static boolean insert(int id,String name,String email,String Password ) throws ClassNotFoundException, SQLException
	{
		String str="insert into user values(?,?,?)";
		Connection con=DButil.getConnection();
		PreparedStatement ps=con.prepareStatement(str);
		ps.setInt(1,id);
		ps.setString(2,name);
		ps.setString(3,email);
		ps.setString(4,Password);
		return ps.execute();
	}
	public static boolean delete(int id) throws ClassNotFoundException, SQLException
	{
		String str="delete from user where id=?";
		Connection con=DButil.getConnection();
		PreparedStatement ps=con.prepareStatement(str);
		ps.setInt(1,id);
		return ps.execute();
	}

		public static void update(String name,int id,String Email) throws SQLException
		{
			Connection c=DButil.getConnection();
			String str="UPDATE user SET name=? ,email=? where id=?";
			PreparedStatement ps=c.prepareStatement(str);
			ps.setString(1,name);
			ps.setString(2,Email);
			ps.setInt(3,id);
			ps.execute();
			
		}
	public  static List<User> userdetails() throws SQLException
	{
		List<User> users=new ArrayList<>();
		Connection c=DButil.getConnection();
		String str=" select * from user";
		PreparedStatement ps=c.prepareStatement(str);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			User user=new User();
			user.setId(rs.getInt(1));
			user.setName(rs.getString(2));
			user.setEmail(rs.getString(3));
			user.setPassword(rs.getString(4));
		}
		return users;
	}
	
}
