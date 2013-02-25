package me.springcloudfoundry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return String.valueOf(jdbcTemplate
				.queryForInt("SELECT id FROM settings WHERE id = 2"));
	}

}
