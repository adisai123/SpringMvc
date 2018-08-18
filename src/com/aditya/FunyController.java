package com.aditya;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funny")
public class FunyController {
	
	@RequestMapping("/fun")
	public String makeFun() {
		
		return "silly";
	}

}
