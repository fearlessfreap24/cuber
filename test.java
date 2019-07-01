package testApp;

import java.io.*;

public class test {

	public static void main(String[] args) {
		
		test start = new test();
		start.init();

	}
	
	private void init() {
		String numbers = "0123456789";
		Stack stk = new Stack();
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		sop("Input an integer that you want to cube:");
		String line = readALine(read);
		while (line != "") {
			if (line.equals("exit") || line.equals("bye") || line.equals("x") || line.equals("quit")) {
				sop("good-bye");
				sop(String.format("The sum of input numbers equals %d", sumNumbers(stk)));
				closeout(read);
			}
			for (int i=0; i<line.length(); i++) {
				if (numbers.indexOf(line.charAt(i)) < 0) {
					sop("your entry is not an integer");
					closeout(read);
				}
			}
			int a = Integer.parseInt(line);
//			sop(String.format("%d being added to stack", a));
			stk.stackAdd(a);
			sop(Integer.toString(cube(a)));
			sop("Input an integer that you want to cube:");
			line = readALine(read);
		}
	}
	
	private String readALine(BufferedReader read) {
		String line = "";
		try {
			line = read.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			sop("Something is not right");
			System.exit(1);
		}
		return line;
	}

	private void closeout(BufferedReader read) {
		try{
			read.close();
		}
		catch (Exception e) {}
		System.exit(1);		
	}

	private int cube(int c) {
		return c*c*c;
	}
	
	private void sop(String s) {
		System.out.println(s);
	}
	
	private int sumNumbers(Stack a) {
		int c = 0;
		String b = "";
		Stack e = new Stack();
		while (!a.isEmpty()) {
			int d = a.stackPop();
			e.stackAdd(d);
			c = c + d;
		}
		while (!e.isEmpty()) {
			b = b + Integer.toString(e.stackPop());
			if (!e.isEmpty()) {
				b = b + ", ";
			}
		}
		sop("Your input(s) were: " + b);
		return c;
	}

}
