package com.mantan.junit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DBUtilImpl implements DBUtil{

	@Override
	public List<String> getList() {
		List<String> list=new ArrayList<String>(Arrays.asList("Ankit","pavi","Ankur"));
		return list;
	}

}
