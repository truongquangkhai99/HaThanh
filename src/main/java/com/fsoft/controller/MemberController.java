package com.fsoft.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fsoft.entities.Member;
import com.fsoft.services.MemberService;
import com.fsoft.utils.Log4J;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Controller
public class MemberController {
  @Autowired
  private MemberService memberService;

  @RequestMapping(value = "login", method = RequestMethod.GET)
  public String login() {
    return "login";
  }

  @RequestMapping(value = "login", method = RequestMethod.POST)
  public String processLogin(Model model,
      @Valid @ModelAttribute("member") Member member, HttpSession session,
      BindingResult erorr) {
    if (erorr.hasErrors()) {
      model.addAttribute("message", "Vui lòng sửa hết lỗi sau đây!");
      return "login";
    }
    Member user = memberService.checkLogin(member);
    if (user != null) {
      session.setAttribute("user", user);
      return "redirect:/index.html";
    } else {
      model.addAttribute("message", "invalid email or password!");
      return "login";
    }
  }

  @RequestMapping(value = "register", method = RequestMethod.GET)
  public String register() {
    return "register";
  }

  @RequestMapping(value = "register", method = RequestMethod.POST)
  public String processRegister(@ModelAttribute("member") Member member,
      BindingResult error) {
    if (member.getUserName().length() == 0) {
      error.rejectValue("userName", "member", "username not null");
    }
    if (member.getEmail().length() == 0) {
      error.rejectValue("email", "member", "invalid email!");
    }
    if (member.getPassword().length() == 0) {
      error.rejectValue("password", "member", "invalid password!");
    }
    if (error.hasErrors()) {
      Log4J.getLogger().info("invalid form member");
      return "register";
    } else {
      Log4J.getLogger().info(member);
      return "redirect:/login.html";
    }

  }

  @ResponseBody
  @RequestMapping(value = "list", method = RequestMethod.GET)
  public String listMember() {
    List<Member> list = new ArrayList<Member>();
    list.add(new Member("viet", "12345", "viettonich@gmail.com", new Date()));
    // Gson gson =new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
    Gson gson = new Gson();
    String json = gson.toJson(list);
    String j = "[{'userName':'viet','password':'12345','email':'viettonich@gmail.com','createdDate':'2018-03-29'}]";
    TypeToken<List<Member>> token = new TypeToken<List<Member>>() {
    };
    List<Member> memberList = gson.fromJson(j, token.getType());
    System.out.println(memberList.get(0).getCreatedDate());
    return json;
  }
}
