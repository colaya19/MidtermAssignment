package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() throws PersonException, ParseException {
		SimpleDateFormat sss = new SimpleDateFormat("dd/MM/yyyy");
		Staff staff1 = new Staff("Connor","Joseph","Olaya",sss.parse("24/01/1998"),"Home","123-456-7890","email@google.com","5-7pm",2,300000.0,sss.parse("20/03/2017"),eTitle.MR);
		Staff staff2 = new Staff("John","Jacob","Jingleheimerschmidtt",sss.parse("11,05,1988"),"Wilbur Street","932-445-3222","jschmidtt@wow.com","3pm-2am",4,22.0,sss.parse("19/03/2016"),eTitle.MR);
		Staff staff3 = new Staff("Damon","Harris","Johnson",sss.parse("22/06/2001"),"Christiana Drive","224-482-3273","dhj@yahoo.com","3am-4am",2,40023.0,sss.parse("11/12/1993"),eTitle.MR);
		Staff staff4 = new Staff("John","Joe","James",sss.parse("21/09/1984"),"Lake Drive East","392-813-3822","jjj@outlook.com","2pm-5pm",4,33222.03,sss.parse("12/01/2012"),eTitle.MR);
		Staff staff5 = new Staff("Ally","Mary","Beth",sss.parse("12,12,2012"),"Hemlock Terrace","932-192-2221","amb@hotmail.com","5pm-7pm",6,55993932.32,sss.parse("31/01/1944"),eTitle.MRS);
		
		
		
		ArrayList<Staff> tester = new ArrayList<Staff>();
		
		
		tester.add(5,staff1);
		tester.add(2,staff2);
		tester.add(1,staff3);
		tester.add(3,staff4);
		tester.add(4,staff5);
		
		
		//tester.add();
	}	

}
