package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AuthorDAO;
import com.example.demo.model.Author;

@Controller
public class AuthorController {
	
	@Autowired
	AuthorDAO authorDAO;
	
	@RequestMapping("/home")
	public String loadHomePage() {
		return "index.jsp";
	}
	
	@RequestMapping(path = "/addAuthor", method = RequestMethod.POST)
	public String addAuthor(Author author) {
		authorDAO.save(author);
		return "index.jsp";
	}
	
	@RequestMapping(path = "/viewAuthorsAdded", method = RequestMethod.GET)
	public ModelAndView viewAuthorsAdded() {
		ModelAndView mv = new ModelAndView("Authors.jsp");
		Iterable<Author> authors =  authorDAO.findAll();
		mv.addObject("authors", authors);
		return mv;
	}
	
	@RequestMapping(path = "/fetchSingleAuthorData", method = RequestMethod.GET)
	public String fetchSingleAuthorData() {
		return "SingleAuthorFetchForm.jsp";
	}
	
	@RequestMapping(path = "/getAuthorById", method = RequestMethod.GET)
	public ModelAndView getAuthorById(int id) {
		ModelAndView mv = new ModelAndView("SingleAuthor.jsp");
		Optional<Author> author = authorDAO.findById(id);
		if(author.isPresent()) {
			mv.addObject("author", author.get());
		}
		else {
			mv.addObject("author", null);
		}
		return mv;
	}
}
