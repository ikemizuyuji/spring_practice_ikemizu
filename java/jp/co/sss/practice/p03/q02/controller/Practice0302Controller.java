package jp.co.sss.practice.p03.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Practice0302Controller {	
	@RequestMapping("/show/redirect_page")
	public String ichi() {
		return "practice03/02/redirect_link";
		}
	
		@RequestMapping("/absolute")
		public String ni() {
			return "redirect:https://www.google.co.jp";
		}
		
		@RequestMapping("/relative")
		public String san() {
			return "redirect:/result";
		}
		@RequestMapping("/result")
		public String yon() {
			return "practice03/02/redirect_result";
		}
	
	

}