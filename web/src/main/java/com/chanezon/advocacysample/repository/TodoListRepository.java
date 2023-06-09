package com.chanezon.advocacysample.repository;

import com.chanezon.advocacysample.model.TodoList;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoListRepository
  extends PagingAndSortingRepository<TodoList, Long> {}
