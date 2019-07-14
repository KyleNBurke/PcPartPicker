package com.kyle.pcpartpicker.build;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildService {
	@Autowired
	private BuildRepository repo;

	public List<Build> getBuilds() {
		return repo.findAll();
	}

	public Build getBuild(String id) {
		return repo.findById(id).get();
	}

	 public Build saveBuild(Build build) {
		return repo.save(build);
	 }
}
