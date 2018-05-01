package com.fsoft.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fsoft.entities.Content;
import com.fsoft.entities.Member;
import com.fsoft.services.MemberService;

@Controller
public class ContentController {
	@Autowired
	private MemberService memberService;

	@RequestMapping(value = "index")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "add-content", method = RequestMethod.GET)
	public String addContent(Model model) {
		List<Member> list = memberService.getAllMember();
		model.addAttribute("members", list);
		model.addAttribute("content", new Content());
		// edit
		return "content/addcontent";
	}

	@RequestMapping(value = "add-content", method = RequestMethod.POST)
	public String processAddContent(Model model,@Valid @ModelAttribute("content") Content content,BindingResult erorr) {
		if(erorr.hasErrors()) {
			model.addAttribute("message", "Vui lòng sửa các trường sau.");
		}
		System.out.println(content.getMember().getId());
		return "content/addcontent";
	}
}
