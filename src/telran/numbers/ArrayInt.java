package telran.numbers;

public class ArrayInt {
public static int[] addNumber(int ar[], int number) {
	int res[] = new int[ar.length+1];
	for (int i = 0; i < ar.length; i++) {
		res[i] = ar[i];
	}
	res[res.length-1] = number;
	return res;
}
/**
 * 
 * @param ar
 * @param index
 * @param number
 * @return new array contaning number value at the given index
 */
public static int[] insertNumber(int ar[], int index, int number) {
//solution should be on the metod arraycopy of the class System (System.arraycopy)	
	int res[] = new int[ar.length + 1];
	System.arraycopy(ar, 0, res, 0, index);
	res[index] = number;
	System.arraycopy(ar, index, res, index + 1, ar.length - index);
	return res;
}
/**
 * 
 * @param ar
 * @param index
 * @return new array whith removed number at the given index
 */
public static int[] removeNumber(int ar[], int index) {
	int res[] = new int[ar.length - 1];
	System.arraycopy(ar, 0, res, 0, index);
	System.arraycopy(ar, index + 1, res, index, res.length - index);
	return res;
}
/**
 * 
 * @param ar
 * @param number
 * @return 
 */
public static int indexOf(int ar[], int number) {
	int res = -1;
	for(int i = 0; i < ar.length; i++) {
		if (ar[i] == number) {
			res = i;
			break;
	//		return i;
		}
	}
//	return -1;
	return res;
}
}
