package com.kyle.pcpartpicker.build;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BuildController {

	@Autowired
	private BuildService buildService;

	@GetMapping("/builds")
	public List<Build> getBuilds() {
		return buildService.getBuilds();
	}

	@GetMapping("/builds/{id}")
	public Build getBuild(@PathVariable String id) {
		return buildService.getBuild(id);
	}

	@PostMapping("/builds")
	public Build saveBuild(@RequestBody Build build) {
		return buildService.saveBuild(build);
	}
}
