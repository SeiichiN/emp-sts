package com.billies_works.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * クライアントからのリクエストが "/" だったとき
 * "index"ビューを返す
 * @author se-ichi
 * まず最初にこれを作る
 */
@Controller
public class IndexController {
	@RequestMapping(path = "/")
	public String index() {
		return "index";
	}
}
