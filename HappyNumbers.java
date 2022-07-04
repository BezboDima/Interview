
import java.util.HashSet;
import java.util.Set;

class HappyNumbers {
	public boolean isHappy(int n) {
		
		Set<Integer> set = new HashSet<>();

		do {
			set.add(n);
			String s = Integer.toString(n);

			n = 0;
			for (int i = 0; i < s.length(); i++) {

				n += Math.pow(s.charAt(i) - 48, 2);
			}
			
			if (n == 1)
				return true;
			
		} while (!set.contains(n));

		return false;
	}
}