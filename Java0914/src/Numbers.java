import java.util.Arrays;

public class Numbers {
	// Á¢±ÙÁ¦ÇÑÀÚ : ±â´É¿¡ Á¢±Ù ÇÒ ¼ö ÀÖ´Â ¹üÀ§¸¦ ¼³Á¤ÇÏ´Â Å°¿öµå
	// private: ¸Ş¼Òµå°¡ Á¤ÀÇµÈ ÆÄÀÏ ¾È¿¡¼­¸¸ »ç¿ë°¡´É : ¼ÒÀ¯ÀÚ°¡ ÀÖÀ½.
	// public: ¿ÜºÎ ÆÄÀÏ¿¡¼­ »ç¿ë °¡´É(¸Ş¼Òµå°¡ Á¤ÀÇ µÇÁö ¾ÊÀº ÆÄÀÏ¿¡¼­µµ »ç¿ë °¡´É) : °ø¿ë

	public static boolean isPrime(int base) { // ¼Ò¼ö ±¸ÇÏ´Â ¸Ş¼Òµå
		return getDivisors(base).length == 2;
//		return result == 2;
	}

	public static int[] getDivisors(int base) {// ¾à¼ö ±¸ÇÏ´Â ¸Ş¼Òµå
		int[] array = new int[base];
		int index = 0; // ¾à¼ö°¡ µé¾î°¥ °ø°£À» ¾Ë·ÁÁÖ´Â º¯¼ö

		for (int i = 1; i <= base; i++) {
			if (isDivisor(base, i)) {
				array[index++] = i; // array[0]¿¡ °ªÀ» ÀúÀåÇÏ°í array[1]·Î ¿Ã¶ó°£´Ù.
			}
		}
//		return array;
		// return Arrays.copyOf(original: º¹Á¦ ÇÒ ¹è¿­, newLength: ¸î¹øÂ°±îÁö);
		return Arrays.copyOf(array, index); // ³»°¡ ¿øÇÏ´Â ÀÎµ¦½º±îÁö ¹è¿­À» º¼ ¼ö ÀÖ´Ù.
	}

	public static boolean isDivisor(int base, int divInt) { // ¾à¼ö°¡ ÀÖ´ÂÁö ±¸ÇÏ´Â ¸Ş¼Òµå
		return base % divInt == 0;
		// return base%divInt==0; °ª ÀÚÃ¼°¡ boolean °ªÀÌ´Ù!! ®X!
//		if (base % divInt == 0) {
//			return true;
//		} else {
//			return false;
//		}
	}
}
