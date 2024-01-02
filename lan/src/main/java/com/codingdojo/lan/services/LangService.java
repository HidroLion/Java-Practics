package com.codingdojo.lan.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.codingdojo.lan.models.Language;
import com.codingdojo.lan.repositories.LangRepository;

@Service
public class LangService {
	private final LangRepository langRepository;

	public LangService(LangRepository langRepository) {
		this.langRepository = langRepository;
	}
	
	public List<Language> allLanguages(){
		return langRepository.findAll();
	}
	
	public Language createLanguage(Language l) {
		return langRepository.save(l);
	}
	
	public Language findLanguage(Long id) {
		Optional<Language> optionalLang = langRepository.findById(id);
		if(optionalLang.isPresent()) {
			return optionalLang.get();
		} 
		else 
		{
         return null;
		}
	}
	
	public Language updateLanguage(Long id, String name, String creator, String version) {		
		if(langRepository.findById(id).isPresent()) {
			Language optionalLang = langRepository.findById(id).get();
			optionalLang.setName(name);
			optionalLang.setCreator(creator);
			optionalLang.setCurrentVersion(version);
			return langRepository.save(optionalLang);
		} 
		else 
		{
         return null;
		}
	}
	
	public void deleteLanguage(Long id) {
		langRepository.deleteById(id);
	}
}
