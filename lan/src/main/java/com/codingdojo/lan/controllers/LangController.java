package com.codingdojo.lan.controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.lan.models.Language;
import com.codingdojo.lan.services.LangService;

import jakarta.validation.Valid;

@Controller
public class LangController {
    private final LangService langService;
    
    public LangController(LangService langService) {
        this.langService = langService;
    }    
    @RequestMapping("/langs")
    public String index(Model model, @ModelAttribute("lang") Language lang) {
        List<Language> languages = langService.allLanguages();
        model.addAttribute("langs", languages);
        return "/langs/index.jsp";
    }   
    @RequestMapping(value="/langs", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("lang") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "/langs";
        } else {
            langService.createLanguage(language);
            return "redirect:/langs";
        }
    }
    @RequestMapping("/langs/{id}")
    public String showLang(@PathVariable("id") Long id, Model model) {
    	Language lang = langService.findLanguage(id);
    	model.addAttribute("lang", lang);
    	return "/langs/show.jsp";
    }
    @RequestMapping("/langs/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
    	Language lang = langService.findLanguage(id);
        model.addAttribute("lang", lang);
        return "/langs/edit.jsp";
    }    
    @RequestMapping(value="/langs/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("lang") Language lan, BindingResult result) {
        if (result.hasErrors()) {
            return "/langs/edit.jsp";
        } else {
        	langService.updateLanguage(lan.getId(), lan.getName(), lan.getCreator(), lan.getCurrentVersion());
            return "redirect:/langs";
        }
    }
    @RequestMapping(value="/langs/{id}", method=RequestMethod.DELETE)
    public String destroy(@PathVariable("id") Long id) {
        langService.deleteLanguage(id);
        return "redirect:/langs";
    }
}
