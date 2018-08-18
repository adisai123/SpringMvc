package com.aditya;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showMyPage() {
		int i = 0;
		return "My-page";
	}

	@RequestMapping("/showForm")
	public String showForm() {
		return "Form";
	}

	/*
	 * @RequestMapping("/processForm") public String processForm(HttpServletRequest
	 * req, Model model) { String myname = req.getParameter("password"); //myname =
	 * myname.toUpperCase(); model.addAttribute("message", myname); return
	 * "ProcessForm"; }
	 */

	@RequestMapping("/processForm")
	public String newProcessForm(@RequestParam("password") String password, Model model) {

		model.addAttribute("message", password);
		return "ProcessForm";
	}
}
