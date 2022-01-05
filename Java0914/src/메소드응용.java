import java.util.Arrays;

public class ¸Ş¼ÒµåÀÀ¿ë {

	public static void main(String[] args) {
		// ¸Ş¼Òµå¸¦ »ç¿ëÇÏ¸é ½Ç¿ë¼ºÀÌ ¿Ã¶ó°£´Ù.
		// 1. ¾à¼öÀÎÁö ¾Ë·ÁÁÖ´Â ¸Ş¼Òµå
		// ¸Ş¼Òµå ÀÌ¸§Àº isDivisor
		// ÀÔ·ÂÀÎÀÚ(¸Å°³º¯¼ö) : Á¤¼ö 2°³(Á¤¼ö, ¾à¼ö)
		// ¹İÈ¯Å¸ÀÔ(¸®ÅÏÅ¸ÀÔ) : ³í¸®(boolean) Å¸ÀÔ
		// 1. ¸Ş¼Òµå È£Ãâ -> 2. ¸Ş¼Òµå Á¤ÀÇ¸¦ ÀÚµ¿ »ı¼º

		// ¸Ş¼Òµå È£Ãâ
		int base = 10, divInt = 2;
		boolean result = isDivisor(base, divInt);
		System.out.println(result);

		// 2. ÀÔ·Â µÈ ¼ıÀÚÀÇ ¾à¼öµéÀ» ¾Ë·ÁÁÖ´Â ¸Ş¼Òµå
		// ¸Ş¼Òµå ÀÌ¸§ : getDivisors
		// ÀÔ·ÂÀÎÀÚ(¸Å°³º¯¼ö) : Á¤¼ö 1°³
		// ¹İÈ¯Å¸ÀÔ(¸®ÅÏÅ¸ÀÔ) : ¹è¿­ Å¸ÀÔ

		// ¸Ş¼Òµå È£Ãâ
		base = 10;
		int[] result_array = getDivisors(base);
		// Arrays.toString() : ¹è¿­ÀÇ 0¹øÂ°ºÎÅÍ ³¡¹øÂ°±îÁö ¹®ÀÚ¿­·Î ¸¸µé¾îÁÜ.
		System.out.println(Arrays.toString(result_array));
		
		// 3. ÀÔ·ÂµÈ ¼ıÀÚ°¡ ¼Ò¼öÀÎÁö ¾Ë·ÁÁÖ´Â ¸Ş¼Òµå
		// ¸Ş¼Òµå ÀÌ¸§: isPrime
		// ÀÔ·ÂÀÎÀÚ : 1º¸´Ù Å« Á¤¼ö 1°³
		// ¹İÈ¯Å¸ÀÔ : boolean
		
		base = 17;
		// ¸Ş¼Òµå È£Ãâ
		boolean result_prime = isPrime(base); 
		//¸Ş¼Òµå ÀÚÃ¼°¡ boolean Å¸ÀÔÀÌ±â ¶§¹®¿¡ , boolean result_primeºÎºĞµµ »ı·«°¡´É
		System.out.println(result_prime);
		System.out.println(isPrime(base));//¹Ù·Î ¸Ş¼Òµå¸¦ È£Ãâ ÇÒ ¼ö ÀÖ´Ù.
		System.out.println(getDivisors(base).length==2);// ÀÌ·¸°Ôµµ »ç¿ëÇÒ ¼ö ÀÖÀ½.
	}
	
		// ¸Ş¼Òµå Á¤ÀÇ
	private static boolean isPrime(int base) { // ¼Ò¼ö ±¸ÇÏ´Â ¸Ş¼Òµå
		return getDivisors(base).length == 2;
//		return result == 2;
	}

	private static int[] getDivisors(int base) {// ¾à¼ö ±¸ÇÏ´Â ¸Ş¼Òµå
		int[] array = new int[base];
		int index = 0; //¾à¼ö°¡ µé¾î°¥ °ø°£À» ¾Ë·ÁÁÖ´Â º¯¼ö
		
		for (int i = 1; i <= base; i++) {
			if (isDivisor(base,i)) {
				array[index++] = i; //array[0]¿¡ °ªÀ» ÀúÀåÇÏ°í array[1]·Î ¿Ã¶ó°£´Ù.
			}
		}
//		return array;
		//return Arrays.copyOf(original: º¹Á¦ ÇÒ ¹è¿­, newLength: ¸î¹øÂ°±îÁö);
		return Arrays.copyOf(array, index); // ³»°¡ ¿øÇÏ´Â ÀÎµ¦½º±îÁö ¹è¿­À» º¼ ¼ö ÀÖ´Ù.
	}

	private static boolean isDivisor(int base, int divInt) { // ¾à¼ö°¡ ÀÖ´ÂÁö ±¸ÇÏ´Â ¸Ş¼Òµå
		return base % divInt == 0;
		// return base%divInt==0; °ª ÀÚÃ¼°¡ boolean °ªÀÌ´Ù!! ®X!
//		if (base % divInt == 0) {
//			return true;
//		} else {
//			return false;
//		}

	}

}
