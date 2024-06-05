package seleniumDemo;
import java.util.Objects;
import java.util.HashMap;
public class contactusdata {
	String FirstName;
	String LastName;
	String Email;
	String Subject;
	String Message;
	contactusdata(String firstName, String lastName, String email, String subject, String message) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Subject = subject;
		Message = message;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	
	/*
	 * public String getFirstName() { return FirstName; }
	 * 
	 * public void setFirstName(String firstName) { FirstName = firstName; }
	 * 
	 * public String getLastName() { return LastName; }
	 * 
	 * public void setLastName(String lastName) { LastName = lastName; }
	 * 
	 * public String getEmail() { return Email; }
	 * 
	 * public void setEmail(String email) { Email = email; }
	 * 
	 * public String getSubject() { return Subject; }
	 * 
	 * public void setSubject(String subject) { Subject = subject; }
	 * 
	 * public String getMessage() { return Message; }
	 */ 
	  //public void setMessage(String message) { Message = message; }
	  
	  public String toString () { return " contactusdata [name=" + FirstName +
	  ", LastName=" + LastName + ", email=" + Email +" , Subject="+Subject+
	  ", Message="+ Message+"]"; }
	
}
