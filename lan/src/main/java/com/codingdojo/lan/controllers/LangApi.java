package com.codingdojo.lan.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.lan.models.Language;
import com.codingdojo.lan.services.LangService;

@RestController
public class LangApi {
	private final LangService langService;
	public LangApi(LangService langService) {
		this.langService = langService;
	}
 	@RequestMapping("/api/langs")
 	public List<Language> index() {
 		return langService.allLanguages();
 	}
 	@RequestMapping(value="/api/langs", method=RequestMethod.POST)
 	public Language create(@RequestParam(value="name") String name, @RequestParam(value="creator") String creator, @RequestParam(value="currentVersion") String version) {
 		Language lang = new Language(name, creator, version);
 		return langService.createLanguage(lang);
 	}
 	@RequestMapping("/api/langs/{id}")
 	public Language show(@PathVariable("id") Long id) {
 		Language lang = langService.findLanguage(id);
 		return lang;
 	}
    @RequestMapping(value="/api/langs/{id}", method=RequestMethod.PUT)
    public Language update(@PathVariable("id") Long id, @RequestParam(value="name") String name, @RequestParam(value="creator") String creator, @RequestParam(value="currentVersion") String version) {
    	Language lang = langService.updateLanguage(id, name, creator, version);
        return lang;
    }    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
    	langService.deleteLanguage(id);
    }
}
