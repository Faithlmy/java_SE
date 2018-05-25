package Interface1;

//computer class
class computer {
	public void plug(Usb u) {
		u.install();
		u.work();
	}
	public void FunCom(int a, int b) {
		System.out.println(a + b);
	}
}


// iphone class
class iphone implements Usb, DiskInterface {

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

	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int write(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	
}


//mp3 class
class mp3 implements Usb{

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