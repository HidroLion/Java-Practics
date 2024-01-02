package com.proyecto.tutorias.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyecto.tutorias.models.User;
import com.proyecto.tutorias.services.UserService;
import com.proyecto.tutorias.validator.UserValidator;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserValidator userValidator;

	// REGISTER
	@GetMapping("tutorias/register")
	public String register(@ModelAttribute("user") User user, HttpSession session, Model model) {
		if (session.getAttribute("errorMessage") != null) {
			model.addAttribute("errorMessage", session.getAttribute("errorMessage"));
			return "views/register.jsp";
		} else
			return "views/register.jsp";
	}

	// REGISTER POST
	@PostMapping("/registration")
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		userValidator.validate(user, result);
		if (result.hasErrors()) {
			return "views/register.jsp";
		} else {
			User u = userService.registerUser(user);
			session.setAttribute("userId", u.getId());
		}
		return "redirect:/";
	}

	// LOGIN
	@GetMapping("tutorias/login")
	public String login(@ModelAttribute("user") User user, HttpSession session, Model model) {
		if (session.getAttribute("errorMessage") != null) {
			model.addAttribute("errorMessage", session.getAttribute("errorMessage"));
			return "views/login.jsp";
		} else
			return "views/login.jsp";
	}
	
	// LOGIN POST
	@PostMapping("/login")
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model,
			HttpSession session) {
		boolean isAuntentico = userService.authenticateUser(email, password);
		if (isAuntentico) {
			User u = userService.findByEmail(email);
			session.setAttribute("userId", u.getId());
			return "redirect:/";
		} else {
			session.setAttribute("error", "Correo electrónico y/o contraseña incorrectos");
			return "redirect:/tutorias/login";
		}
	}

}
