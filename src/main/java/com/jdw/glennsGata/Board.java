package com.jdw.glennsGata;

import java.util.HashSet;
import java.util.Set;

public class Board {
	private String board = "9...4...1";
	//private String availableDigits = "235678";
	
	public Board() {}
	public Board(Board original) {
		this.board = original.board;
	}
	
	public boolean setDigitAt(int pos, char digit) {
		if (pos < 0 || pos > 8) return false;
		if (pos == 0 || pos == 4 || pos == 8) return false;
		
		if (board.contains(String.valueOf(digit))) return false;
		
		StringBuilder tmp_board = new StringBuilder(board);
		tmp_board.setCharAt(pos, digit);
		board = tmp_board.toString();
		
		return true;
	}
	
	public boolean removeDigitAt(int pos) {
		if (pos < 0 || pos > 8) return false;
		if (pos == 0 || pos == 4 || pos == 8) return false;
		
		StringBuilder tmp_board = new StringBuilder(board);
		tmp_board.setCharAt(pos, '.');
		board = tmp_board.toString();
		
		return true;
	}
	
	public Set<Character> getRemainigDigits() {
		Set<Character> ret = new HashSet<Character>();
		
		if (!board.contains("2")) ret.add('2');
		if (!board.contains("3")) ret.add('3');
		if (!board.contains("5")) ret.add('5');
		if (!board.contains("6")) ret.add('6');
		if (!board.contains("7")) ret.add('7');
		if (!board.contains("8")) ret.add('8');
		
		return ret;
	}
	
	
	public Set<Integer> getRemainigPositions() {
		Set<Integer> ret = new HashSet<Integer>();
		
		for (int i = 0; i < board.length(); i++) {
			
		}
		
		return ret;
	}
	
	
	public boolean testBoard() {
		if (board.contains(".")) return false;
		
		int numberA = Integer.valueOf((""+board.charAt(0))+(""+board.charAt(1))+(""+board.charAt(2)));
		int numberB = Integer.valueOf((""+board.charAt(3))+(""+board.charAt(4))+(""+board.charAt(5)));
		int numberC = Integer.valueOf((""+board.charAt(6))+(""+board.charAt(7))+(""+board.charAt(8)));
		
		return (numberA - numberB == numberC);
	}
	
	
	public String toString() {
		String ret = "";
		
		ret += " " + (""+board.charAt(0))+(""+board.charAt(1))+(""+board.charAt(2)) + "\n";
		ret += "-" + (""+board.charAt(3))+(""+board.charAt(4))+(""+board.charAt(5)) + "\n";
		ret += "====" + "\n";
		ret += " " + (""+board.charAt(6))+(""+board.charAt(7))+(""+board.charAt(8)) + "\n";
		
		return ret;
	}
	
	
	public boolean equals(Board that) {
		return (this.board.equals(that.board));
	}
}
