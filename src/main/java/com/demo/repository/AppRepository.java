package com.demo.repository;

import com.demo.entity.App;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRepository extends JpaRepository<App,Integer> {

}
