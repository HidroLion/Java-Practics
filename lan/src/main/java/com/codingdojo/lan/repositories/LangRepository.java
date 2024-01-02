package com.codingdojo.lan.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.codingdojo.lan.models.Language;

@Repository
public interface LangRepository extends CrudRepository<Language, Long>{

	List<Language> findAll();

	List<Language> findByCreatorContaining(String search);

	Long countByNameContaining(String search);

	Long deleteByNameStartingWith(String search);
}
