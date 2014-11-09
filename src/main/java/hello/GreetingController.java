package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value="name", required=false, defaultValue="world") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
}
