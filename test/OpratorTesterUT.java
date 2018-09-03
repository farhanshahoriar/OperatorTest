package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.OpTestCls;

class OpratorTesterUT {

	OpTestCls opt=new OpTestCls();
	@Test
	void OpratorTestUTint(){
		assertEquals(5,opt.sum(2,3),"Ok");
		assertEquals(3,opt.subs(5,2),"Ok");
		assertEquals(10,opt.mul(5,2),"Ok");
		assertEquals(2,opt.div(5,2),"Ok");
		assertEquals(1,opt.mod(5,2));
	}
	@Test
	void OpratorTestUTbit(){
		
		//fail("Not yet implemented");
		//System.out.println(12&7);
		assertEquals(-18,opt.bitNot(17));
		assertEquals(4,opt.bitAnd(12,7));
		assertEquals(3,opt.bitOr(2,3));
		assertEquals(1,opt.bitXor(2,3));
	}
	//shift
	@Test
	void OpratorTestUTShift(){
		assertEquals(6,opt.bitLS(3));
		assertEquals(3,opt.bitRS(6));
		assertEquals(3,opt.bitRS0Fill(6));
		//assertEquals(,opt.bitLS());
	}
		//boolean
	@Test
	void OpratorTestUTbool(){
		assertEquals(true,opt.equalto(7,7));
		assertEquals(true,opt.notequalto(9,7));
		assertEquals(true,opt.lessThan(6,7));
		assertEquals(true,opt.greaterThan(8,7));
	}
		//boolean operator
	@Test
	void OpratorTestUTlogic(){
		assertEquals(true,opt.logicalNot(false));
		assertEquals(true,opt.logicalAnd(true,true));
		assertEquals(true,opt.logicalOr(true,false));
		assertEquals(true,opt.logicalXor(true,false));
		
		//boolean operator
		assertEquals(true,opt.shortcircuitNot(false));
		assertEquals(true,opt.shortcircuitAnd(true,true));
		assertEquals(true,opt.shortcircuitOr(true,false));
				
		
		
	}
	
	

}
