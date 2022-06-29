package telran.numbers;

public class IntegerPrimitives {
int a;

public static byte getMaxByte() {
	byte res =1;
	while (res>0)
		res = (byte) (res*2);
	return (byte) (res-1);
}

public static byte getMinByte() {
	
	return (byte) (getMaxByte() +1);
}

public static int getLengthByte() {
	byte a = 0;
	return getLength  (a);
}

public static char getMaxChar() {
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
	//char a = 0;
	return getLength (getMaxChar());
}

public static short getMaxShort() {
	
	return (short) (getMinShort()-1);
}

public static short getMinShort() {
	short res = 1; 
	while (res > 0) {
		res = (short) ((int)res * 2);
	}
	return (short) (res);
}

public static int getLengthShort() {
	//short a = 0;
	return getLength (getMaxShort());
}

public static int getMaxInt() {
	
	return getMinInt() - 1;
}

public static int getMinInt() {
	int res = 1;
	while (res >0) {
		res = res * 2;
	}
	return res;
}

public static int getLengthInt() {
	//int a = 0;
	return getLength(getMaxInt());
}

public static long getMaxLong() {
	
	return getMinLong()-1;
}

public static long getMinLong() {
	long res = 1; 
	while (res > 0) {
		res = res * 2;
	}
	return res;
}

public static int getLengthLong() {
	//long a = 0;
	
	return getLength(getMaxLong());
}
private static int getLength (long x) {
 long res = x;
 int i=0;
    while (res>1) {
		res =res/2;
		i++;
	}
	int b_size = i/8+1;
	return b_size;
}
}
