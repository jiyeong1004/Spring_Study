package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SumController {
	@GetMapping("/sum")
	public String sum() {
		return "sum/input";
	}

	@PostMapping("/sum_result")
	public String sum_re(@RequestParam int n, @RequestParam int m, Model model) {
		String result = "";
		int sum = 0;
		for(int i = n; i <= m; i++) {
			sum += i;
		}
		result += n + " ~ " + m + "������ �� : " + sum;
		
		model.addAttribute("re", result);
		System.out.println("sum");
		return "sum/result";
	}
}
