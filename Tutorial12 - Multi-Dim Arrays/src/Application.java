public class Application {
	public static void main(String[] args) {
		
		int[] values = { 3, 5, 2343 };
		System.out.println(values[2]);
		
		// array of arrays
		int[][] grid = {
			{3, 5, 2343},
			{2, 4},
			{1, 2, 3, 4}
		};
		
		//System.out.println(grid[1][1]);
		
		for(int row=0; row < grid.length ; row++ ) {
			for(int col=0; col < grid[row].length; col++ ) {
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();
		}

		String[][] texts = new String[2][3];
		texts[0][1] = "Hello there!";
		System.out.println(texts[0][1]);
		
		String[][] words = new String[2][];
		System.out.println(words[0]);  // null
		
		words[0] = new String[3];
		words[0][1] = "hi there";
		System.out.println(words[0][1]);
	}
}
