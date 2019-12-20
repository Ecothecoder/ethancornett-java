package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.validation.model.Login;
import com.techelevator.validation.model.Registration;

@Controller
public class UserController {

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}

	@GetMapping("/register")
	public String emptyRegistration(ModelMap modelMap) {
		if (modelMap.containsAttribute("formData") == false) {
			Registration empty = new Registration();
			modelMap.put("formData", empty);
		}
		return "register";
	}

	@PostMapping("/register")
	public String validRegistration(@Valid @ModelAttribute Registration registration, BindingResult result,
			RedirectAttributes redirectAttributes) {
		if (result.hasErrors()) {
			for (ObjectError error : result.getAllErrors()) {
				System.out.println(error.getDefaultMessage());
			}

			redirectAttributes.addFlashAttribute("formData", registration);
			redirectAttributes.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "formData", result);
			return "redirect:/register";
		}
		return "redirect:confirmation";
	}

	@GetMapping("/login")
	public String emptyLogin(ModelMap modelMap) {
		if (modelMap.containsAttribute("formData") == false) {
			Login empty = new Login();
			modelMap.put("formData", empty);
		}
		return "login";
	}

	@PostMapping("/login")
	public String validLogin(@Valid @ModelAttribute Login login, BindingResult result,
			RedirectAttributes redirectAttributes) {

		if (result.hasErrors()) {
			redirectAttributes.addFlashAttribute("formData", login);
			redirectAttributes.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "formData", result);
			return "redirect:/login";
		}

		return "redirect:confirmation";
	}

	@GetMapping("/confirmation")
	public String confirm() {
		return "confirmation";
	}
}
