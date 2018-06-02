package java.annotation2;


public class PasswordUtils {
	
	@java.annotation2.UseCase.Faith(id="47", description = "Passwords must contain at least one numeric.")
	public boolean validatePassword(String password) {
		return (password.matches("\\w*\\d\\w*"));
	}
	
	@java.annotation2.UseCase.Faith(id = "48")
	public String encryptPassword(String password) {
         return new StringBuilder(password).reverse().toString();
     }

}
