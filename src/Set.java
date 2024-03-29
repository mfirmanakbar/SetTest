
public class Set {

	// array length = 3
	// in this case for requirement
	
	public String fruits[] = new String[3];
	public int nextIndex = 0;

	public void add(String fruit) {
		fruits[nextIndex] = fruit;
		nextIndex++;
	}

	public boolean isEmpty() {
		// return false if nextIndex > 0, it means the array is not empty
		return !(nextIndex > 0);
	}

	public int getSize() {
		return nextIndex;
	}

	// before code refactoring
	/*public boolean isContain(String fruit) {
		for (int i = 0; i < nextIndex; i++) {
			if (fruits[i] == fruit) {
				return true;
			}
		}
		return false;
	}

	public void delete(String fruit) {
		for (int i = 0; i < nextIndex; i++) {
			if (fruits[i] == fruit) {
				fruits[i] = fruits[nextIndex - 1];
				nextIndex--;
			}
		}
	}*/
	
	// after code refactoring
	public boolean isContain(String fruit) {
		return (loop(fruit) > -1);
	}

	public void delete(String fruit) {
		fruits[loop(fruit)] = fruits[nextIndex - 1];
		nextIndex--;
	}
	public int loop(String fruit) {
		for (int i = 0; i < nextIndex; i++) {
			if (fruits[i] == fruit) {
				return i;
			}
		}
		return -1;
	}

}
