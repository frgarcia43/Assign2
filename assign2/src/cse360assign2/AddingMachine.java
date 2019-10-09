/*
 * Author: Fermin Garcia
 * Class ID: 70641
 * Assignment #: 2
 * Description: This is the AddingMachine class. It has a
 * constructor to create a string to hold the history
 * and an int to hold the total
 */

package cse360assign2;

public class AddingMachine 
{

	private String history;
	private int total;
	
	/**
	 * Constructor that sets total to initial value
	 */
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * The total of the calculations is returned
	 * @return Int
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * Adds the entered value to the total
	 * @param value
	 */
	public void add (int value) 
	{
		total += value;
		history = history + " + " + value;
	}
	
	/**
	 * Subtracts the entered value from the the total
	 * @param value
	 */
	public void subtract (int value) 
	{
		total -= value;
		history = history + " - " + value;
	}
	
	/**
	 * Returns the history of the calculations
	 */
	public String toString () 
	{
		return history;
	}

	/**
	 * Resets the value of total to 0
	 * and clears the history
	 */
	public void clear() 
	{
		total = 0;
		history = "0";
	}
}
