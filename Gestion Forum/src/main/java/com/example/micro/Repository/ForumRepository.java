package com.example.micro.Repository;

import com.example.micro.classes.Forum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForumRepository extends JpaRepository <Forum, Integer> {
}
