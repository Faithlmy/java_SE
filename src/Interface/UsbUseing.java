package Interface;

//computer class
class computer {
	public void plug(usb u) {
		u.install();
		u.work();
	}
	public void FunCom(int a, int b) {
		System.out.println(a + b);
	}
}


// iphone class
class iphone implements usb {

	@Override
	public void install() {
		// TODO Auto-generated method stub
		System.out.println("iphone install");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(" iphone work");
		
	}
	
}


//mp3 class
class mp3 implements usb{

	@Override
	public void install() {
		// TODO Auto-generated method stub
		System.out.println("mp3 install");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("mp3 work");
	}
	
}