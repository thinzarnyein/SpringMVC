package com.tzn.tusk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tzn.tusk.dao.QuestionDao;
import com.tzn.tusk.entity.Quest;
import com.tzn.tusk.entity.Question;

@Controller
public class QuestionController {

	@Autowired
	QuestionDao qDao;
	
	@RequestMapping("/question.htm")
	public String question()
	{
		return "question.jsp";
	}
	
	@RequestMapping("saveQuestion.htm")
	public ModelAndView saveQuestion(@ModelAttribute Question q)
	{
		ModelAndView mv = new ModelAndView("printQuestions.jsp");
		
		qDao.saveQuestion(q);
		
		return mv;
	}
	
	@RequestMapping("getQuestions")
	@ResponseBody
	public List<Question> getQuestion()
	{
		List<Question> questions = qDao.getTestQuestions();
		
		System.out.println(questions);
		
		return questions;
	}
	
	@RequestMapping("/test.htm")
	@ResponseBody
	public ModelAndView test()
	{
		ModelAndView mv = new ModelAndView("test.jsp");
		
		return mv;
	}
	
	@RequestMapping("/verify.htm")
	@ResponseBody
	public ModelAndView verify(@ModelAttribute Quest quest)
	{
		int result = qDao.verify(quest);
		ModelAndView mv = new ModelAndView("result.jsp");
		mv.addObject("result", result);
		mv.addObject("percent",result*20);
		System.out.println(quest);
		return mv;
	}
	
}
