package org.dell;

// child class using multiple inheritance

public class Desktop implements Hardware , Software {

	@Override
	public void softwareResources1() {
		
		System.out.println(" Software name: intel");
		
	}

	@Override
	public void softwareResources2() {
		
		System.out.println("Software : i core");
		
	}

	@Override
	public void hardwareResources1() {
		
		System.out.println("Hardware name: keyboard");
		
	}

	@Override
	public void hardwareResources2() {
		
		System.out.println("Hardware 2 : mouse");
		
	}

	@Override
	public void hardwareResources3() {
		
		System.out.println("Hardware 3: cpu");
		
	}
	 public void desktopModel() {
		
		 System.out.println("model name : Dell");

	}
	 
	public void desktopSize() {
		
		System.out.println("Size : 21 inch");
	}
	
	public static void main(String[] args) {
		
		Desktop rt = new Desktop();
		rt.desktopModel();
		rt.desktopSize();
		rt.softwareResources1();
		rt.softwareResources2();
		rt.hardwareResources1();
		rt.hardwareResources2();
		rt.hardwareResources3();
		
	}
 
}
