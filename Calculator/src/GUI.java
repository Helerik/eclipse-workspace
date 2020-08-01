import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame{
	
	private FlowLayout layout;
	
	private JTextField display;
	
	private JButton nine;
	private JButton eight;
	private JButton seven;
	private JButton six;
	private JButton five;
	private JButton four;
	private JButton three;
	private JButton two;
	private JButton one;
	private JButton zero;
	
	private JButton lparenthesis;
	private JButton rparenthesis;
	private JButton dot;
	
	private JButton clear;
	private JButton backspace;
	
	private JButton plus;
	private JButton minus;
	private JButton mult;
	private JButton div;
	private JButton equal;
	
	public GUI(){
		super("Calculator");
		
		layout = new FlowLayout();
		layout.setAlignment(FlowLayout.CENTER);
		setLayout(layout);
		
		display = new JTextField(20);
		display.setEditable(false);
		add(display);
		
		
		seven = new JButton("7");
		seven.setPreferredSize(new Dimension(50,30));
		add(seven);
		seven.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					display.setText(display.getText() + "7");
				}
			}
		);
		
		eight = new JButton("8");
		eight.setPreferredSize(new Dimension(50,30));
		add(eight);
		eight.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					display.setText(display.getText() + "8");
				}
			}
		);
		
		nine = new JButton("9");
		nine.setPreferredSize(new Dimension(50,30));
		add(nine);
		nine.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					display.setText(display.getText() + "9");
				}
			}
		);
		
		clear = new JButton("C");
		clear.setPreferredSize(new Dimension(50,30));
		add(clear);
		clear.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					display.setText("");
				}
			}
		);
		
		backspace = new JButton("<");
		backspace.setPreferredSize(new Dimension(50,30));
		add(backspace);
		backspace.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					if (display.getText().equals("ERROR")) {
						display.setText("");
					}
					else if (display.getText().equals("")) {
						
					}
					else{
						display.setText(display.getText().substring(0,display.getText().length()-1));
					}
				}
			}
		);
		
		four = new JButton("4");
		four.setPreferredSize(new Dimension(50,30));
		add(four);
		four.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					display.setText(display.getText() + "4");
				}
			}
		);
		
		five = new JButton("5");
		five.setPreferredSize(new Dimension(50,30));
		add(five);
		five.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					display.setText(display.getText() + "5");
				}
			}
		);
		
		six = new JButton("6");
		six.setPreferredSize(new Dimension(50,30));
		add(six);
		six.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					display.setText(display.getText() + "6");
				}
			}
		);
		
		plus = new JButton("+");
		plus.setPreferredSize(new Dimension(50,30));
		add(plus);
		plus.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					display.setText(display.getText() + "+");
				}
			}
		);
		
		minus = new JButton("-");
		minus.setPreferredSize(new Dimension(50,30));
		add(minus);
		minus.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					display.setText(display.getText() + "-");
				}
			}
		);
		
		one = new JButton("1");
		one.setPreferredSize(new Dimension(50,30));
		add(one);
		one.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					display.setText(display.getText() + "1");
				}
			}
		);
		
		two = new JButton("2");
		two.setPreferredSize(new Dimension(50,30));
		add(two);
		two.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					display.setText(display.getText() + "2");
				}
			}
		);
		
		three = new JButton("3");
		three.setPreferredSize(new Dimension(50,30));
		add(three);
		three.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					display.setText(display.getText() + "3");
				}
			}
		);
		
		mult = new JButton("*");
		mult.setPreferredSize(new Dimension(50,30));
		add(mult);
		mult.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					display.setText(display.getText() + "*");
				}
			}
		);
		
		div = new JButton("/");
		div.setPreferredSize(new Dimension(50,30));
		add(div);
		div.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					display.setText(display.getText() + "/");
				}
			}
		);
		
		zero = new JButton("0");
		zero.setPreferredSize(new Dimension(50,30));
		add(zero);
		zero.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					display.setText(display.getText() + "0");
				}
			}
		);
		
		dot = new JButton(".");
		dot.setPreferredSize(new Dimension(50,30));
		add(dot);
		dot.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					display.setText(display.getText() + ".");
				}
			}
		);
		
		lparenthesis = new JButton("(");
		lparenthesis.setPreferredSize(new Dimension(50,30));
		add(lparenthesis);
		lparenthesis.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					display.setText(display.getText() + "(");
				}
			}
		);
		
		rparenthesis = new JButton(")");
		rparenthesis.setPreferredSize(new Dimension(50,30));
		add(rparenthesis);
		rparenthesis.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					display.setText(display.getText() + ")");
				}
			}
		);
		
		equal = new JButton("=");
		equal.setPreferredSize(new Dimension(50,30));
		add(equal);
		equal.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					String text = display.getText();
					try {
						text = (String.valueOf(eval(text)));
					}
					catch(Exception some_error) {
				    	text = "ERROR";
					}
					display.setText(text);
				}
			}
		);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(299,240);
		setResizable(false);
		setVisible(true);
	}
	
	public static double eval(final String str) {
	    return new Object() {
	        int pos = -1, ch;

	        void nextChar() {
	            ch = (++pos < str.length()) ? str.charAt(pos) : -1;
	        }

	        boolean eat(int charToEat) {
	            while (ch == ' ') nextChar();
	            if (ch == charToEat) {
	                nextChar();
	                return true;
	            }
	            return false;
	        }

	        double parse() {
	            nextChar();
	            double x = parseExpression();
	            if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
	            return x;
	        }

	        // Grammar:
	        // expression = term | expression `+` term | expression `-` term
	        // term = factor | term `*` factor | term `/` factor
	        // factor = `+` factor | `-` factor | `(` expression `)`
	        //        | number | functionName factor | factor `^` factor

	        double parseExpression() {
	            double x = parseTerm();
	            for (;;) {
	                if      (eat('+')) x += parseTerm(); // addition
	                else if (eat('-')) x -= parseTerm(); // subtraction
	                else return x;
	            }
	        }

	        double parseTerm() {
	            double x = parseFactor();
	            for (;;) {
	                if      (eat('*')) x *= parseFactor(); // multiplication
	                else if (eat('/')) x /= parseFactor(); // division
	                else return x;
	            }
	        }

	        double parseFactor() {
	            if (eat('+')) return parseFactor(); // unary plus
	            if (eat('-')) return -parseFactor(); // unary minus

	            double x;
	            int startPos = this.pos;
	            if (eat('(')) { // parentheses
	                x = parseExpression();
	                eat(')');
	            } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
	                while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
	                x = Double.parseDouble(str.substring(startPos, this.pos));
	            } else if (ch >= 'a' && ch <= 'z') { // functions
	                while (ch >= 'a' && ch <= 'z') nextChar();
	                String func = str.substring(startPos, this.pos);
	                x = parseFactor();
	                if (func.equals("sqrt")) x = Math.sqrt(x);
	                else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
	                else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
	                else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
	                else throw new RuntimeException("Unknown function: " + func);
	            } else {
	                throw new RuntimeException("Unexpected: " + (char)ch);
	            }

	            if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

	            return x;
	        }
	    }.parse();
	}
}





