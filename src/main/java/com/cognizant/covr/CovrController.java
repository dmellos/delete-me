/* See the file "LICENSE" for the full license governing this code. */
package com.cognizant.covr;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;

@RestController
final class CovrController {

	@GetMapping("/")
	Iterable<?> list() {
		return Collections.emptyList();
	}

	@PostMapping("/")
	String echo(@RequestBody String newItem){

		return newItem;

	}

	@GetMapping("/visitors")
	Iterable<Visitor> getAllVisitor() {
		return Arrays.asList(new Visitor("Selwyn", "Dmello"),
				new Visitor("Prateek","Mulye"),
				new Visitor("Vinay","Kaple"));
	}
}

