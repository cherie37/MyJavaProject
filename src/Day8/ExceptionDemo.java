package Day8;

public class ExceptionDemo {

	public static void main(String[] args) {

		try {
			// Long l1 = new Long("a");
			// Long l1 = createNumber("a");
			Long l1 = createNumber("100");
			System.out.println(l1);

		} catch (NumberFormatException e) {
			System.out.println("Error : Cannot parse to long");
		} catch (IllegalArgumentException e) {
			System.out.println("Error : IllegalArgumentException");
		} catch (Exception e) {
			System.out.println("Error : Exception" + e.getMessage());
		} finally {
			System.out.println("Finish");
		}

	}

	// private static Long createNumber(String str)throws Exception{
	private static Long createNumber(String str) {
		if ("".equals(str)) { // boolean
			// throw new Exception(); //checked exception (throw) //exception is
			// biggest if do not have catch exception will call it
			throw new IllegalArgumentException();
		} else if ("100".equals(str)) {
			// throw new Exception("the number show msg");
		}
		return new Long(str);
	}

}
