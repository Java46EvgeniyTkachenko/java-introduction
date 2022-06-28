package telran.numbers;

public class IntegerPrimitives {
int a;

public static byte getMaxByte() {
	// TODO Auto-generated method stub
	return -1;
}

public static byte getMinByte() {
	// TODO Auto-generated method stub
	return -1;
}

public static int getLengthByte() {
	// TODO Auto-generated method stub
	return -1;
}

public static int getMaxChar() {
	char res = 1; 
	while (res > 0) {
		res = (char) (res * 2);
	}
	return (char) (res-1);
}

public static char getMinChar() {
	
	return (char) (getMaxChar() + 1);
}

public static int getLengthChar() {
	// TODO Auto-generated method stub
	return -1;
}

public static short getMaxShort() {
	short res = 1; 
	while (res > 0) {
		res = (short) ((int)res * 2);
	}
	return (short) (res-1);
}

public static short getMinShort() {
	// TODO Auto-generated method stub
	return -1;
}

public static int getLengthShort() {
	// TODO Auto-generated method stub
	return -1;
}

public static int getMaxInt() {
	// TODO Auto-generated method stub
	return -1;
}

public static int getMinInt() {
	// TODO Auto-generated method stub
	return -1;
}

public static int getLengthInt() {
	// TODO Auto-generated method stub
	return -1;
}

public static long getMaxLong() {
	long res = 1; 
	while (res > 0) {
		res = res * 2;
	}
	return res-1;
}

public static long getMinLong() {
	// TODO Auto-generated method stub
	return -1;
}

public static int getLengthLong() {
	// TODO Auto-generated method stub
	
	return -1;
}
private static int getLength (long x) {
//TODO
	
	return -1;
}
}
