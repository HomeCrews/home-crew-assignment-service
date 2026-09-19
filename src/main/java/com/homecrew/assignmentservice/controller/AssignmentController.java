package com.homecrew.assignmentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assignments")
public class AssignmentController {

  @GetMapping("/test")
  public String test() {
    return "Assignment Service is working";
  }
}
