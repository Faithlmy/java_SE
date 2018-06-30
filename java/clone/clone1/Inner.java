package clone1;

import java.io.Serializable;

public class Inner implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String name = "";

	  public Inner(String name) {
	      this.name = name;
	  }

	  @Override
	  public String toString() {
	      return "Inner的name值为：" + name;
	  }

}
