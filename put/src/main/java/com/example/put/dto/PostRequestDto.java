package com.example.put.dto;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PostRequestDto {

	private String name;
	private int age;
	
	private List<CarDto> carList;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the carList
	 */
	public List<CarDto> getCarList() {
		return carList;
	}

	/**
	 * @param carList the carList to set
	 */
	public void setCarList(List<CarDto> carList) {
		this.carList = carList;
	}

	@Override
	public String toString() {
		return "PostRequestDto [name=" + name + ", age=" + age + ", carList=" + carList + "]";
	}
	
	
}
