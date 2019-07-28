package br.com.lhamello.springbootmicroservices.endpoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lhamello.springbootmicroservices.endpoint.service.CourseService;
import br.com.lhamello.springbootmicroservices.model.Course;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequestMapping("v1/admin/courses")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@Slf4j
public class CourseController {

  private final CourseService courseService;
  
  @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public ResponseEntity<Iterable<Course>> list(final Pageable pageable) {
    log.info("call v1/admin/courses");
    return new ResponseEntity<>(courseService.list(pageable), HttpStatus.OK);
  }
  
}
