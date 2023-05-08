package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.PageModel;

public interface RepoLogin extends JpaRepository<PageModel ,String> {

	PageModel findByUname(String username);

}
