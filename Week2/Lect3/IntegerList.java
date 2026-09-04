package Lect3;

public class IntegerList {

	  private int[] myList;

	    public IntegerList(int[] inputList) {
	        this.myList = new int[inputList.length];
	        for(int i = 0; i < inputList.length; i++) {
	            this.myList[i] = inputList[i];
	        }
	    }

	    /**
	     * Determine if the list of integers is increaing
	     * @return True if the list is increasing and false otherwise
	     */
	    public boolean isIncreasing() {
	    	return false;
	    }
}
