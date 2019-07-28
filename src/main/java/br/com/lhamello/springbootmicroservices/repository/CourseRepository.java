package br.com.lhamello.springbootmicroservices.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.lhamello.springbootmicroservices.model.Course;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
