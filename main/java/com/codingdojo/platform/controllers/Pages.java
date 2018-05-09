package com.codingdojo.platform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("your_server")
public class Pages {
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/m/{chapter}/0553/{lessonID}")
	public String lesson(@PathVariable("chapter") String chapter, @PathVariable("lessonID") String lessonID, Model model) {
		String content = "";
		if(lessonID.equals("0733")) {
			content = "Setting up your servers";
		}
		else if(lessonID.equals("0342")) {
			content = "Punch cards";
		}
		else if(lessonID.equals("0348")) {
			content = "Advanced Fortran intro";
		}
		model.addAttribute("content", content);
		return "lesson.jsp";
	}
	
	@RequestMapping("/m/{chapter}/0483/{assignmentID}")
	public String assignment(@PathVariable("chapter") String chapter, @PathVariable("assignmentID") String assignmentID, Model model) {
		String content = "";
		if(assignmentID.equals("0345")) {
			content = "Assignment practicing coding forms";
		}
		else if(assignmentID.equals("2342")) {
			content = "Assignment about converting Fortran to Binary";
		}
		model.addAttribute("content", content);
		return "assignment.jsp";
	}
	
	@RequestMapping("/m/{chapter}/0505/{quizID}")
	public String quiz(@PathVariable("chapter") String chapter, @PathVariable("quizID") String quiz, Model model) {
		String content ="";
		if(quiz.equals("0001")) {
			content = "this is a quiz about Fortran";
		}
		model.addAttribute("content", content);
		return "quiz.jsp";
	}
}
