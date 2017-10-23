package com.wipro.demoproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.demoproject.bean.Film;
import com.wipro.demoproject.repository.FilmRepository;

@Controller
public class FilmController {

	@Autowired
	private FilmRepository filmRepository;
	
	@RequestMapping(value="/")
	public String home() {
		return "home";
	}
	
	
	@RequestMapping(value="/index")
	public String index(Model model) {
		List<Film> list = (List<Film>) filmRepository.findAll();
		model.addAttribute("list",list);
		return "index";
	}
	
	@RequestMapping(value="/expand")
	public String expand(Model model) {
		List<Film> list = (List<Film>) filmRepository.findAll();
		model.addAttribute("list",list);
		return "expand";
	}
	
	@GetMapping(value="/edit/{id}")
	public String edit(@PathVariable String id,Model model) {
		Film film = filmRepository.findOne(id);
		model.addAttribute("film",film);
		return "editfilm";
	}
	
	@PostMapping(value="/edit/update/{id}")
	public String update(@PathVariable String id,@RequestParam String filmid,@RequestParam String filmname,@RequestParam String language,@RequestParam int budget,Model model) {
		Film film = new Film();
		film.setFilmid(id);
		film.setFilmname(filmname);
		film.setLanguage(language);
		film.setBudget(budget);
		filmRepository.save(film);
		model.addAttribute("film",film);
		return "update";
	}
	
	@RequestMapping(value="/delete/{id}")
	public String delete(@PathVariable String id) {
		filmRepository.delete(id);
		return "update";
	}
	
	@RequestMapping(value="/new")
	public String addNew() {
		return "new";
	}
	
	@PostMapping(value="/new")
	public String newFilm(@RequestParam String filmid,@RequestParam String filmname,@RequestParam String language,@RequestParam int budget,Model model) {
		Film film = new Film();
		film.setFilmid(filmid);
		film.setFilmname(filmname);
		film.setLanguage(language);
		film.setBudget(budget);
		filmRepository.save(film);
		model.addAttribute("film",film);
		return "update";
	}
	
	
	
	
	
	
}
