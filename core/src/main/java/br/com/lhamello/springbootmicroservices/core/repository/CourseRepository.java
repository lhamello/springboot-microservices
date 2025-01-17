package br.com.lhamello.springbootmicroservices.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.lhamello.springbootmicroservices.core.model.Course;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
