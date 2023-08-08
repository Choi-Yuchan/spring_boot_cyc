package edu.global.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.global.ex.vo.GradeVO;
import edu.global.ex.vo.MemberVO;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@GetMapping("/insert")
	public String insert() {
		return "board/insert";
	}

	@GetMapping("/form")
	public String form() {
		return "form";
	}
	
	@GetMapping("/input")
	public String input() {
		return "input";
	}

	// ways of getting data from user
	// 1. HttpServletRequest
//	public String confirm(HttpServletRequest request, Model model) {
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
//		model.addAttribute("id",id);
//		model.addAttribute("pw",pw);
//		return "board/confirm";
//	}
//	@PostMapping("/confirm")
//	public String confirmPost(HttpServletRequest request, Model model) {
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
//		model.addAttribute("id",id);
//		model.addAttribute("pw",pw);
//		return "board/confirm";
//	}
	// 2. @RequestParam
//	public String confirm(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {
//		model.addAttribute("id", id);
//		model.addAttribute("pw", pw);
//		return "board/confirm";
//	}

	//3. Data(command) object
	@GetMapping("/confirm")
	public String confirm(MemberVO memberVO, Model model) {
		System.out.println(memberVO);
		return "board/confirm";
	}
	@GetMapping("/grade")
	public String grade(GradeVO gradeVO, Model model) {
		System.out.println(gradeVO);
		return "board/grade";
	}
	
	@RequestMapping(value = "/confirm", method = RequestMethod.POST)
	public String confirmPost2(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "board/confirm";
	}

	@GetMapping("/delete")
	public String delete() {
		return "board/delete";
	}

	@GetMapping("/content")
	public String content(Model model) {

		model.addAttribute("id", "1234");
		model.addAttribute("pw", "abcd");
		model.addAttribute("name", "John");
		model.addAttribute("age", 27);

		return "board/content";
	}

	@GetMapping("/reply")
	public ModelAndView reply(ModelAndView mv) {

//		ModelAndView mv = new ModelAndView();
		mv.addObject("id", 30);
		mv.setViewName("board/reply");

		return mv;
	}

	@RequestMapping("/update")
	public String update() {
		return "board/update";
	}

}
