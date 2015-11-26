package com.dxx.dto;

public class TestDTO {

	private Long id;
	
	private long idlong;
	
	private String name;

	private SubTestDTO[] subTestDTOs;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getIdlong() {
		return idlong;
	}

	public void setIdlong(long idlong) {
		this.idlong = idlong;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public SubTestDTO[] getSubTestDTOs() {
		return subTestDTOs;
	}

	public void setSubTestDTOs(SubTestDTO[] subTestDTOs) {
		this.subTestDTOs = subTestDTOs;
	}

	public String toString(){
		return "[id]="+this.id+"&&[idlong]"+this.idlong+"&&[name]"+this.name+"&&[SubtestDto]"+subTestDTOs[0].getName();
	}
}
