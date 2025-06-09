package jp.co.sss.practice.p06.q01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.practice.p06.repository.FruitsSeasonRepository;

@Controller
public class Practice0601Controller {
	@Autowired
	FruitsSeasonRepository repo;
	@RequestMapping(path="/fruits/list/all",method=RequestMethod.GET)
	
	public String neko(Model model) { 
        model.addAttribute("fruits", repo.findAll()); 
        return "practice06/01/fruits_list"; 
    }
}
