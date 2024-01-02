package com.codingdojo.contador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
@Controller
@RequestMapping("/your-server")
public class HomeController {   
    @RequestMapping("")
    public String welcome(HttpSession session, ModelMap model) {
    	if(session.getAttribute("count") == null)
    	{
        	session.setAttribute("count", 0);
    	}
    	Integer count = (Integer) session.getAttribute("count");
    	count++;
    	session.setAttribute("count", count);
    	
        return "welcome.jsp";
    } 
    @RequestMapping("/counter")
    public String index() {
        return "index.jsp";
    }
}


