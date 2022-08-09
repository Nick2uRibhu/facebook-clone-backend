package com.soloproject.facebookcloneservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.soloproject.facebookcloneservice.entity.PostEntity;

@Repository
public interface PostEntityRepository extends JpaRepository<PostEntity, String> {
    
}
