package main;

public class OpTestCls {
	public int sum(int operand1,int operand2) {
		return operand1+operand2;
	}

	public int subs(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return operand1-operand2;
	}

	public int mul(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return operand1*operand2;
	}

	public int div(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return operand1/operand2;
	}

	public int mod(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return operand1%operand2;
	}

	public int bitNot(int operand) {
		// TODO Auto-generated method stub
		return ~operand;
	}

	public int bitAnd(int operand1 ,int operand2) {
		// TODO Auto-generated method stub
		return operand1&operand2;
	}
	public int bitOr(int operand1 ,int operand2) {
		// TODO Auto-generated method stub
		return operand1|operand2;
	}
	public int bitXor(int operand1 ,int operand2) {
		// TODO Auto-generated method stub
		return operand1^operand2; 
	}

	public int bitLS(int operand) {
		// TODO Auto-generated method stub
		return operand<<1;
	}
	public int bitRS(int operand) {
		// TODO Auto-generated method stub
		return operand>>1;
	}
	public int bitRS0Fill(int operand) {
		// TODO Auto-generated method stub
		return operand>>>1;
	}
	public int bitLSZ(int operand) {
		// TODO Auto-generated method stub
		return operand<<1;
	}

	public boolean equalto(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return operand1==operand2;
	}
	public boolean notequalto(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return operand1!=operand2;
	}
	public boolean lessThan(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return operand1<operand2;
	}
	public boolean greaterThan(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return operand1>operand2;
	}

	public boolean logicalNot(boolean b) {
		// TODO Auto-generated method stub
		return !b;
	}

	public boolean logicalAnd(boolean b, boolean c) {
		// TODO Auto-generated method stub
		return b&&c;
	}

	public boolean logicalOr(boolean b, boolean c) {
		// TODO Auto-generated method stub
		return b||c;
	}
	public boolean logicalXor(boolean b, boolean c) {
		// TODO Auto-generated method stub
		return b^c;
	}
	
	
	public boolean shortcircuitNot(boolean b) {
		// TODO Auto-generated method stub
		return !b;
	}

	public boolean shortcircuitAnd(boolean b, boolean c) {
		// TODO Auto-generated method stub
		return b&&c;
	}

	public boolean shortcircuitOr(boolean b, boolean c) {
		// TODO Auto-generated method stub
		return b||c;
	}
	
}
