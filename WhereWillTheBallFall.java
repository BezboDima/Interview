
class WhereWillTheBallFall {
	public int[] findBall(int[][] grid) {

		int[] ans = new int[grid[0].length];
		for (int i = 0; i < grid[0].length; i++) {

			ans[i] = depth(grid, i);

		}

		return ans;

	}

	public int depth(int[][] grid, int index) {

		int current = index;

		for (int i = 0; i < grid.length; i++) {

			if (grid[i][current] == 1 && (current + 1) < grid[0].length) {

				if (grid[i][current + 1] == 1) {
					current += 1;
					continue;
				}
			}

			if (grid[i][current] == -1 && (current - 1) >= 0) {

				if (grid[i][current - 1] == -1) {
					current -= 1;
					continue;
				}
			}

			return -1;
		}
		return current;

	}
}