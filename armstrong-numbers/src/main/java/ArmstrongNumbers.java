class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		// throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
		int sum = 0;
		int copyOfNum = numberToCheck;
		int lenOfNum = 0;

		while (numberToCheck > 0) {
			lenOfNum++;
			numberToCheck /= 10;			
		}

		numberToCheck = copyOfNum;
		
		while (numberToCheck > 0) {
			sum += Math.pow(numberToCheck%10, lenOfNum);
			numberToCheck /= 10;
		}

		return sum == copyOfNum;
	}

}
