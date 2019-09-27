package com.banque.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.banque.dao.UtilisateurDAO;

public class UtilisateurController {
@Autowired
	
	private UtilisateurDAO utilisateurRepository;




	
	/*@RequestMapping(method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_UTF8_VALUE
			)
	@ResponseBody
	@CrossOrigin(origins= {"http://localhost:4200"}, methods= {RequestMethod.GET}) 
	public Page<Uti> findAll(@PageableDefault(page=0, size=5) Pageable pr) {
	
		return utilisateurRepository.findAll(pr);
	}
	
	
	@RequestMapping(value="/{lid:[0-9]+}", method=RequestMethod.GET,
			produces=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	@CrossOrigin(origins= {"http://localhost:4200"}, methods= {RequestMethod.GET, RequestMethod.GET})
	public Intervenant findclientById(@PathVariable("lid") int lid) {
			return utilisateurRepository.findOne(lid) ;
	}*/
	
	
	
		
		
		
		
}
