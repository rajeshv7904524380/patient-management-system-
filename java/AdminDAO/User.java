package AdminDAO;

public class User {
	private int Id;
	private String Name;
	private String Email;
	private String Password;
	public User(){
		
	}
	public int getId() {
		return Id;
	}
	public void setId(int i) {
		Id = i;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	

}
