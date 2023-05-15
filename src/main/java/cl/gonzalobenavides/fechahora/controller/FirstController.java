package cl.gonzalobenavides.fechahora.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	
	private final String timeFormat = "HH:MM a";

	@RequestMapping("/")
	public String home() {
		System.out.println("home");
		return "index.jsp";
	}
	
	@RequestMapping("date")
	public String date(Model model) {
		System.out.println("date");
		final String dia = "EEEE";
		final String diaN = "dd";
		final String mes = "MMMM";
		final String anio = "YYYY";
		String diaString = new SimpleDateFormat(dia).format(new Date());
		String mesString = new SimpleDateFormat(mes).format(new Date());
		String html = String.format("%s, %s de %s, %s",StringUtils.capitalize(diaString) ,new SimpleDateFormat(diaN).format(new Date()),StringUtils.capitalize(mesString),new SimpleDateFormat(anio).format(new Date()));
		System.out.println(html);
		
		model.addAttribute("date", html);
		return "date.jsp";
	}
	
	@RequestMapping("time")
	public String time(Model model) {
		System.out.println("time");
		SimpleDateFormat sdf = new SimpleDateFormat(timeFormat);
		String html = String.format("%s", sdf.format(new Date()));
		System.out.println(html.toUpperCase());
		model.addAttribute("time", html.toUpperCase());
		return "time.jsp";
	}
	
	
}
