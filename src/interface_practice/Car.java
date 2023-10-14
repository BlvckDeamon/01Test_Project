package interface_practice;

class Car extends Vehicle{

	@Override
	public void move() {
		System.out.println("car is running");
		
	}

	@Override
	public void start() {
		System.out.println("car is starting ");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
		System.out.println("car is stop ");
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		
		System.out.println("car is turning to left");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("car is turning to right");
	}
	
	
	

	
	

}
