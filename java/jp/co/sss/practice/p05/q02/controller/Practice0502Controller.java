package jp.co.sss.practice.p05.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class Practice0502Controller{
	@RequestMapping(path="/numguess/start",method=RequestMethod.GET)
	public String aaa(HttpSession session) {
		Integer hitNumber = (int) (Math.floor(Math.random() * 9) + 1);
		session.setAttribute("namnam", hitNumber);
		System.out.println(hitNumber);
		return "practice05/02/numguess_input";
	}
	@RequestMapping(path="/numguess/input",method=RequestMethod.GET)
	public String bbb() {			
		return "practice05/02/numguess_input";
		}
	@RequestMapping(path="/numguess/judge",method=RequestMethod.GET)
	public String ccc(HttpSession session,Integer inputNum) {
		
		int hitNumbeR = (int)session.getAttribute("namnam");
		inputNum=(int)inputNum;
		
		if(hitNumbeR==inputNum){
			return "redirect:/numguess/hit";
		}
		else {
			return "practice05/02/numguess_judge";
		}
	}
	
	@RequestMapping(path="/numguess/hit",method=RequestMethod.GET)
	public String ddd(Model model,HttpSession session) {	
		int hitNumbya = (int)session.getAttribute("namnam");
		String atari="当たりです!正解は"+hitNumbya+"でした。";
		model.addAttribute("atari",atari);
		
		session.invalidate();
		
		return "practice05/02/numguess_end";
		
	}
}
