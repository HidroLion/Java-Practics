package com.codingdojo.enrutamiento.controllers;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/dojo")
public class DojoController {
	@RequestMapping("")
	public String start() {
		return "¡El Dojo es increíble!";
	}
	@RequestMapping("/{lugar}-dojo")
	public String place(@PathVariable("lugar") String lugar) {
		return "El Dojo " + lugar + " está localizado al sur de California";
	}
	@RequestMapping("/san-jose")
	public String cuartel() {
		return "El Dojo SJ es el cuartel general";
	}
}
