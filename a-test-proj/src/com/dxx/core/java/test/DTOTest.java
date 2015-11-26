package com.dxx.core.java.test;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

import com.dxx.dto.SubTestDTO;
import com.dxx.dto.TestDTO;

public class DTOTest {

	public static void main(String[] args) {

		TestDTO dto = new TestDTO();
		dto.setId(1L);
		dto.setIdlong(2L);
		dto.setName("abc");
		
		SubTestDTO subTestDTO = new SubTestDTO();
		subTestDTO.setName("ÎÒ");
		SubTestDTO[] subTestDTOs = new SubTestDTO[1];
		subTestDTOs[0] = subTestDTO;
		dto.setSubTestDTOs(subTestDTOs);
		
		
		TestDTO[] dtos = new TestDTO[1];
		dtos[0] = dto;
//		
		
		SubTestDTO subTestDTO2 = new SubTestDTO();
		subTestDTO.setName("Äã");
		SubTestDTO[] subTestDTOs2 = new SubTestDTO[1];
		subTestDTOs2[0] = subTestDTO2;
		dto.setSubTestDTOs(subTestDTOs2);
		
//		SubTestDTO[] ret = dto.getSubTestDTOs();
//		Long newIdlong =  ret[0].getId();
//		newIdlong = "fafsagag";
//		ret[0].setName("woheni");
		SubTestDTO[] newSubTestDTOs = dto.getSubTestDTOs();
		newSubTestDTOs = subTestDTOs2;
		
		System.out.println(""+dto.getSubTestDTOs()[0].getName()+"&&" + newSubTestDTOs[0].getName());
		
		Long newID = dto.getId();
		newID = 100L;
		System.out.println("dtosss = " + dto.getId()+"&&neId= " + newID);
//		TestDTO[] newDtos = dtos;
		
//		TestDTO changedDto = new TestDTO();
//		changedDto.setId(3L);
//		changedDto.setName("okm");
//		
//		dtos[0] = changedDto;
//		newDtos[0].setId(2L);
//		newDtos[0].setName("efg");
		
		System.out.println("dtos = " +dtos[0].toString());
//		System.out.println("newdtos = " + newDtos[0].toString());
		
	}

}
