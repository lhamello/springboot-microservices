package br.com.lhamello.springbootmicroservices.course.endpoint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.lhamello.springbootmicroservices.core.model.Course;
import br.com.lhamello.springbootmicroservices.core.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
@Slf4j
public class CourseService {

  private final CourseRepository courseRepository;

  public Iterable<Course> list(final Pageable pageable) {
    log.info("Listing all courses");
    return courseRepository.findAll(pageable);
  }
}
