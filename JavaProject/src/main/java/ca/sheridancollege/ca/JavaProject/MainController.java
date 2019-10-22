package ca.sheridancollege.ca.JavaProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	private PersonDAO personDAO;

	@Autowired
	public MainController(PersonDAO personDAO) {
		super();
//		dao.populate();
	}

	@ResponseBody
	@GetMapping({"/", "/hello"})
	public String home() {

		
		
		return "home";
	}

//	@RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
//	public String viewPersonList(Model model) {
//
////		model.addAttribute("persons", );
//
//		return "personList";
//	}
}
