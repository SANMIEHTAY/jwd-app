package ai.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class PostController {

		@GetMapping("/posts")
		public String postList() {
			
			
			return "list";
		}

	}


