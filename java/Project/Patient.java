package Project;

public class Patient {
	private int patientid;
	private String patientname;
	private String disease;
	private String address;
	private String deposited;
	private String pending;
	private String patientype;
	private String gender;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Patient() {
	}
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDeposited() {
		return deposited;
	}
	public void setDeposited(String deposited) {
		this.deposited = deposited;
	}
	public String getPending() {
		return pending;
	}
	public void setPending(String pending) {
		this.pending = pending;
	}
	public String getPatientype() {
		return patientype;
	}
	public void setPatientype(String patientype) {
		this.patientype = patientype;
	}
}
