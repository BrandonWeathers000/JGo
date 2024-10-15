class Intersection{
	// The status of an intersection can be one in one of three possible states:
	// -1 means the intersection is empty
	// 0 means a black stone is present
	// 1 means a white strone is present
	private int status;

	// Default constructor
	public Intersection(){
		// All intersections start as empty at the beginning of the game
		status = -1;
	}

	public Intersection(int status){
		// All intersections start as empty at the beginning of the game
		this.status = status;
	}

	// Method to get the status
	public int getStatus(){
		return this.status;
	}

	// Method to change the status
	public void Intersection(int status){
		this.status = status;
	}

	// Method to print out the status of the intersection
	public void display(){
		if(this.status == -1){
			System.out.println("┼");
		}else if(this.status == 0){
			System.out.println("○");
		}else{
			System.out.println("☻");
		}
	}
}
