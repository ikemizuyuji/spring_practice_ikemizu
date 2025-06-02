package jp.co.sss.practice.p04.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.practice.p04.q02.form.FavoriteForm;

@Controller
public class Practice0402Controller {
	@RequestMapping("/favorite/input")
		public String ichi() {
			return "practice04/02/favorite_input";
	}
	
	@RequestMapping(path="/favorite/result",method = RequestMethod.POST)
	public String san(FavoriteForm favoriteForm) {
		System.out.println("==POSTメソッドで受け取りました");
		System.out.println("==パラメータの値:"+favoriteForm);
		return "practice04/02/post_result";
}
}