package Lect3;

public class IntegerListTester {

	
	public static void main(String[] args) {
	    boolean expectedResponse;
	    boolean response;
	    IntegerList list;

	    // ---------- STANDARD CASES ----------

	    System.out.print("Testing with a standard increasing list.... ");
	    list = new IntegerList(new int[]{1, 2, 3, 4});
	    expectedResponse = true;
	    response = list.isIncreasing();

	    if (expectedResponse == response) {
	        System.out.println("PASS");
	    } else {
	        System.out.println("FAIL !!!!!!");
	        System.out.println("Response: " + response);
	        System.out.println("Expected Response: " + expectedResponse);
	    }

	    System.out.print("Testing with a standard non-increasing list.... ");
	    list = new IntegerList(new int[]{1, 2, 1});
	    expectedResponse = false;
	    response = list.isIncreasing();

	    if (expectedResponse == response) {
	        System.out.println("PASS");
	    } else {
	        System.out.println("FAIL !!!!!!");
	        System.out.println("Response: " + response);
	        System.out.println("Expected Response: " + expectedResponse);
	    }

	    // ---------- ERROR-PRONE CASE ----------
	    // catches the classic bug: using > instead of >= lets equal
	    // neighbors slip through as "increasing"

	    System.out.print("Testing with equal neighbors (not strictly increasing).... ");
	    list = new IntegerList(new int[]{1, 2, 2, 3});
	    expectedResponse = false;
	    response = list.isIncreasing();

	    if (expectedResponse == response) {
	        System.out.println("PASS");
	    } else {
	        System.out.println("FAIL !!!!!!");
	        System.out.println("Response: " + response);
	        System.out.println("Expected Response: " + expectedResponse);
	    }

	    System.out.print("Testing with a fully decreasing list.... ");
	    list = new IntegerList(new int[]{5, 4, 3, 2, 1});
	    expectedResponse = false;
	    response = list.isIncreasing();

	    if (expectedResponse == response) {
	        System.out.println("PASS");
	    } else {
	        System.out.println("FAIL !!!!!!");
	        System.out.println("Response: " + response);
	        System.out.println("Expected Response: " + expectedResponse);
	    }

	    // ---------- EDGE CASES ----------
	    // catches the "return true outside the loop" bug: with an empty or
	    // single-element list, the loop body never runs at all, so if
	    // return true isn't reachable outside the loop, this breaks

	    System.out.print("Testing with an edge case (empty list).... ");
	    list = new IntegerList(new int[]{});
	    expectedResponse = true;
	    response = list.isIncreasing();

	    if (expectedResponse == response) {
	        System.out.println("PASS");
	    } else {
	        System.out.println("FAIL !!!!!!");
	        System.out.println("Response: " + response);
	        System.out.println("Expected Response: " + expectedResponse);
	    }

	    System.out.print("Testing with an edge case (single element list).... ");
	    list = new IntegerList(new int[]{7});
	    expectedResponse = true;
	    response = list.isIncreasing();

	    if (expectedResponse == response) {
	        System.out.println("PASS");
	    } else {
	        System.out.println("FAIL !!!!!!");
	        System.out.println("Response: " + response);
	        System.out.println("Expected Response: " + expectedResponse);
	    }

	    System.out.print("Testing with an edge case (two elements, increasing).... ");
	    list = new IntegerList(new int[]{1, 2});
	    expectedResponse = true;
	    response = list.isIncreasing();

	    if (expectedResponse == response) {
	        System.out.println("PASS");
	    } else {
	        System.out.println("FAIL !!!!!!");
	        System.out.println("Response: " + response);
	        System.out.println("Expected Response: " + expectedResponse);
	    }

	    System.out.print("Testing with an edge case (two equal elements).... ");
	    list = new IntegerList(new int[]{4, 4});
	    expectedResponse = false;
	    response = list.isIncreasing();

	    if (expectedResponse == response) {
	        System.out.println("PASS");
	    } else {
	        System.out.println("FAIL !!!!!!");
	        System.out.println("Response: " + response);
	        System.out.println("Expected Response: " + expectedResponse);
	    }

	    System.out.print("Testing with an edge case (negative numbers, increasing).... ");
	    list = new IntegerList(new int[]{-5, -3, -1, 0, 2});
	    expectedResponse = true;
	    response = list.isIncreasing();

	    if (expectedResponse == response) {
	        System.out.println("PASS");
	    } else {
	        System.out.println("FAIL !!!!!!");
	        System.out.println("Response: " + response);
	        System.out.println("Expected Response: " + expectedResponse);
	    }
	}
}
