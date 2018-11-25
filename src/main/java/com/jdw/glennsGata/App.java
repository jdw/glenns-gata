package com.jdw.glennsGata;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App {
	static private List<Board> solved;
	static private List<Board> tests;
	
	private static void solve(Board b) {
		Stack<Integer> positions = b.getRemainigPositions();
		Stack<Character> digits = b.getRemainigDigits(); 
		
		if (positions.size() > 1) {
			Integer pos = positions.pop();
			while (!digits.isEmpty()) {
				Character digit = digits.pop();
				b.setDigitAt(pos, digit);
				solve(new Board(b));
				b.removeDigitAt(pos);
			}
		}
		else if (positions.size() == 1) {
			Integer pos = positions.pop();
			Character digit = digits.pop();
				
			b.setDigitAt(pos, digit);
				
			solve(new Board(b));
		}
		else {
			tests.add(b);
			//System.out.println(b);

			if (b.testBoard()) {
				solved.add(new Board(b));
				
			}
		}
	}
	
	
	public static void solve() {
		solve(new Board());
		
		if (solved.isEmpty()) System.out.println("No solution found");
		else {
			System.out.println("Tested " + tests.size()+ " boards, found "+ solved.size() + " solutions:");
			for (Board b: solved) {
				System.out.println(b);
			}
		}
	}
	
	
    public static void main( String[] args ) {
    	App.solved  = new ArrayList<Board>();
    	App.tests  = new ArrayList<Board>();
    	solve();
    }
}
