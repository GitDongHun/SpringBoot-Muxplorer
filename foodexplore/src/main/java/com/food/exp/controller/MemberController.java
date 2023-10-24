package com.food.exp.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.food.exp.dto.MemberDTO;
import com.food.exp.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	MemberService service;

	// 회원가입 페이지로 이동
	@GetMapping("/joinform")
	public String join() {
		System.out.println("MemberController");
		return "member/joinform";
	}

	// 회원가입
	@PostMapping(value = "/join")
	public String join(MemberDTO dto) {
		int num = service.join(dto);
		return "redirect:loginform";
	}

	// 아이디 중복 체크
	@GetMapping(value = "/idCheck", produces = "text/plain;charset=utf-8")
	@ResponseBody
	public String idCheck(@RequestParam("user_email") String user_email) {
		System.out.println("----");
		System.out.println(user_email);
		if (service.idCheck(user_email) != null) {
			// 이미 존재하는 아이디
			return "0";
		} else {
			// 사용 가능한 아이디
			return "1";
		}
	}

	// 닉네임 중복 체크
	@GetMapping(value = "/nameCheck", produces = "text/plain;charset=utf-8")
	@ResponseBody
	public String nameCheck(@RequestParam("nickname") String nickname) {
		System.out.println(nickname);
		if (service.nameCheck(nickname) != null) {
			// 이미 존재하는 닉네임
			return "0";
		} else {
			// 사용 가능한 닉네임
			return "1";
		}
	}

	// 로그인 페이지로 이동
	@GetMapping("/loginform")
	public String loginform() {
		return "member/loginform";
	}

	// 로그인
	@PostMapping(value = "/login")
	public String login(MemberDTO dto, HttpServletResponse response, HttpSession session) throws IOException {
		System.out.println("login");

		if (service.login(dto) != null) {
		dto = service.login(dto);
		String user_email = dto.getUser_email();
		String nickname = dto.getNickname();
			// 로그인 성공
			session.setAttribute("login", user_email);
			session.setAttribute("nickname", nickname);
			if(session.getAttribute("dest") != null) {
				Object dest = session.getAttribute("dest");
				return "redirect:"+(String)dest;
			}else {
				return "redirect:/main";
			}
		} else {
			// 로그인 실패
			System.out.println("login fail");
			return "redirect:loginform?error=true";
		}
	}

	// 로그아웃
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/main";
	}

}
