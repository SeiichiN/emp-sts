package com.billies_works.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.billies_works.app.form.LoginForm;

@Controller
public class SessionController {
	/**
	 * "/login" でユーザーがアクセスしてきたら、"session/login"ビュー
	 * を渡す
	 * @return URL
	 */
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String login() {
		return "session/login";
	}
	
	/**
	 * ログイン処理
	 * @param form
	 * @param session
	 * @return URL
	 */
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String doLogin(LoginForm form, HttpSession session) {
		if (form.getUserId() == 123) {
			session.setAttribute("userId", form.getUserId());
			return "redirect:/";
		} else {
			return "session/login";
		}
	}

	/**
	 * ログアウト処理
	 * @param session
	 * @return
	 */
	@RequestMapping(path = "/logout", method = RequestMethod.GET)
	public String logout( HttpSession session ) {
		session.invalidate();
		return "redirect:/";
	}
}
