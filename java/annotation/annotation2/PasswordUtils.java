package annotation2;

import annotation2.UseCase.Faith;

public class PasswordUtils {
	
	@Faith(id="47", description = "Passwords must contain at least one numeric.")
	public boolean validatePassword(String password) {
		return (password.matches("\\w*\\d\\w*"));
	}
	
	@Faith(id = "48")
	public String encryptPassword(String password) {
         return new StringBuilder(password).reverse().toString();
     }

}
