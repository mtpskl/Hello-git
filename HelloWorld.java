public static int seqSearch(int[] array, int searchInput) {

		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == searchInput) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static int binarySearch(int[] array, int left, int right, int key) {
		int mid = left + (right - left) / 2;
		if (right >= left) {
			if (array[mid] == key) {
				return mid;
			} else if (array[mid] < key) {
				return binarySearch(array, mid + 1, right, key);
			} else if (array[mid] > key) {
				return binarySearch(array, left, mid - 1, key);
			}
		}
		return -1;
	}
	public static int jumpSearch(int[] array, int key, int length) {
		int nextIndex = (int) Math.sqrt(length);
		int previousIndex = 0;
		while (array[Math.min(nextIndex, length) -1 ] < key) {
			previousIndex = nextIndex;
			nextIndex += (int) Math.sqrt(length);
			if (previousIndex>=length) {
				return -1;
			}
		}
		while (array[previousIndex] < key) {
			previousIndex++;
		}
		if (array[previousIndex] == key) {
			return previousIndex;
		}
		return -1;
	}
}

