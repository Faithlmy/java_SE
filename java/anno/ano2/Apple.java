package ano2;

import org.junit.Test;

// Use anno
public class Apple {

	@FruitName(value = "h")
	public String NameApp;
	private String ColourApp;
//	@FruitProvider(id = 1,  name = "m")
	private String ProviderApp;
	
	
	public String getNameApp() {
		return NameApp;
	}
	public void setNameApp(String nameApp) {
		NameApp = nameApp;
	}
	public String getColourApp() {
		return ColourApp;
	}
	public void setColourApp(String colourApp) {
		ColourApp = colourApp;
	}
	public String getProviderApp() {
		return ProviderApp;
	}
	public void setProviderApp(String providerApp) {
		ProviderApp = providerApp;
	}
}
