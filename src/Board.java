class Board{
	private int size;
	private Intersection[][] iGrid = new Intersection[19][19];

	// Deafult constructor (by default, the board size  will be set to 19)
	public Board(){
		size = 19;
		for(int indexA = size; indexA < size; indexA++){
			for(int indexB = size; indexB < size; indexB++){
				iGrid[indexA][indexB] = new Intersection();
			}
		}
	}
}
