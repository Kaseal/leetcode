package medium.stack;

import java.util.Stack;

//735. Asteroid Collision (Medium)
public class AsteroidCollision {

	public int[] asteroidCollision(int[] asteroids) {

		class Action {
			public void action(Stack<Integer> stack) {
				while (stack.size() > 1) {
					int curr = stack.pop();
					int prev = stack.peek();

					if (prev < 0) {
						stack.push(curr);
						break;
					}
					if (prev == -curr) {
						stack.pop();
						break;
					}
					if (prev > -curr) {
						break;
					}
					if (prev < -curr) {
						stack.pop();
						stack.push(curr);
					}
				}
			}
		}

		Action action = new Action();

		Stack<Integer> stack = new Stack<>();

		for (int asteroid : asteroids) {
			if (stack.size() == 0) {
				stack.push(asteroid);
			} else {
				int prev = stack.peek();

				if (prev < 0) {
					stack.push(asteroid);
					continue;
				}

				if (asteroid < 0) {
					stack.push(asteroid);
					action.action(stack);
				} else {
					stack.push(asteroid);
				}

			}
		}

		return stack.stream().mapToInt(Integer::intValue).toArray();
	}

}
