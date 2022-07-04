
import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {

		List<Integer> l = new ArrayList<>();
		int verticalBound = matrix.length;
		int horizontalBound = matrix[0].length;

		int right = 0;
		int down = 0;
		int left = horizontalBound - 1;
		int up = verticalBound - 1;

		while (l.size() < verticalBound * horizontalBound) {

			for (int i = right; i <= left; i++) {
				l.add(matrix[down][i]);
			}

			for (int i = down + 1; i <= up; i++) {
				l.add(matrix[i][left]);
			}

			if (up != down) {
				for (int i = left - 1; i >= right; i--) {
					l.add(matrix[up][i]);
				}
			}
			if (right != left) {
				for (int i = up - 1; i > down; i--) {
					l.add(matrix[i][right]);
				}
			}

			right++;
			down++;
			left--;
			up--;
		}
		return l;
	}
}