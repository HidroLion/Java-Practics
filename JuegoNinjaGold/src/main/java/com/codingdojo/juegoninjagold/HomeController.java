package com.codingdojo.juegoninjagold;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("total_gold") == null) {
			session.setAttribute("total_gold", 0);
			session.setAttribute("activities", new ArrayList<String>());
			session.setAttribute("messages", new ArrayList<String>());
		} 
		return "index.jsp";
	}
	@SuppressWarnings("unchecked")
	@RequestMapping("/process_money")
	public String processMoney(@RequestParam(value="building") String building, HttpSession session) {
		if("farm".equals(building)) {
			Random r = new Random();
			int max = 20;
			int min = 10;
			int n = r.nextInt(max + 1 - min) + min;
			session.setAttribute("total_gold", (Integer) session.getAttribute("total_gold") + n);
			SimpleDateFormat dateFormat = new SimpleDateFormat("E, MMMM d, y 'at' h:mm a");
			String dateString = dateFormat.format(new java.util.Date());
			ArrayList<String> tempActivities = (ArrayList<String>) session.getAttribute("activities");
			tempActivities.add(0, "Ganas " + n + " de oro en la granja! " + dateString);
			session.setAttribute("activities", tempActivities);
		} else if("cave".equals(building)) {
			session.setAttribute("message", " ");
			Random r = new Random();
			int max = 10;
			int min = 5;
			int n = r.nextInt(max + 1 - min) + min;
			session.setAttribute("total_gold", (Integer) session.getAttribute("total_gold") + n);
			SimpleDateFormat dateFormat = new SimpleDateFormat("E, MMMM d, y 'at' h:mm a");
			String dateString = dateFormat.format(new java.util.Date());			
			ArrayList<String> tempActivities = (ArrayList<String>) session.getAttribute("activities");
			tempActivities.add(0, "Ganas " + n + " de oro en la cueva! " + dateString);
			session.setAttribute("activities", tempActivities);
		} else if("house".equals(building)) {
			session.setAttribute("message", " ");
			Random r = new Random();
			int max = 5;
			int min = 2;
			int n = r.nextInt(max + 1 - min) + min;
			session.setAttribute("total_gold", (Integer) session.getAttribute("total_gold") + n);
			SimpleDateFormat dateFormat = new SimpleDateFormat("E, MMMM d, y 'at' h:mm a");
			String dateString = dateFormat.format(new java.util.Date());			
			ArrayList<String> tempActivities = (ArrayList<String>) session.getAttribute("activities");
			tempActivities.add(0, "Ganas " + n + " de oro en tu casa! " + dateString);
			session.setAttribute("activities", tempActivities);
		} else if("casino".equals(building)) {
			session.setAttribute("message", " ");
			Random r = new Random();
			int max = 50;
			int min = -50;
			int n = r.nextInt(max + 1 - min) + min;
			session.setAttribute("total_gold", (Integer) session.getAttribute("total_gold") + n);
			SimpleDateFormat dateFormat = new SimpleDateFormat("E, MMMM d, y 'at' h:mm a");
			String dateString = dateFormat.format(new java.util.Date());			
			ArrayList<String> tempActivities = (ArrayList<String>) session.getAttribute("activities");
			if(n < 0) {
				tempActivities.add(0, "Perdiste " + (-n) + " de oro en el casino... " + dateString);
			} else {
				tempActivities.add(0, "Ganas " + n + " de oro en el casino! " + dateString);
			}
			session.setAttribute("activities", tempActivities);
		}
		return "redirect:/";
	}
}