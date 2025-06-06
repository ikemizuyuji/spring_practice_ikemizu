package jp.co.sss.practice.p05.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.practice.p05.q01.form.BmiForm;

	@Controller
	public class Practice0501Controller {
	@RequestMapping(path="/bmi/input",method=RequestMethod.GET)
		public String ichi() {
			return "practice05/01/bmi_input";
	}
	
	@RequestMapping(path="/bmi/result",method=RequestMethod.POST)
	public String ni(BmiForm bmiForm,Model model) {
		double aaa=(bmiForm.getHeight()/(bmiForm.getWeight()*bmiForm.getWeight())*1000);
		bmiForm.setBmi(aaa);
		model.addAttribute("bmiFORM",bmiForm);
		return "practice05/01/bmi_result";
	
	
}
}