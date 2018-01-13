class ReverseString {

    String reverse(String inputString) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	StringBuilder sb = new StringBuilder("");
	sb.append(inputString);
		
	String revString = sb.reverse().toString();

	return revString;
    }
  
}
