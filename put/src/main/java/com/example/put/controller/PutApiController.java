package com.example.put.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.put.dto.PostRequestDto;

@RestController
@RequestMapping("/api")
public class PutApiController {

	@PutMapping("/put")
	public PostRequestDto put(@RequestBody PostRequestDto requestDto) {
		System.out.println(requestDto);
		return requestDto;
	}
	
	@PutMapping("/put/{userId}")
	public PostRequestDto putPathVariable(@RequestBody PostRequestDto requestDto, @PathVariable(name = "userId") Long id) {
		System.out.println(id);
		return requestDto;
	}
}
