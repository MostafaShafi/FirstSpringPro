package com.example.shesh.Repository;

import com.example.shesh.Models.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {

    @Query(value = "SELECT * FROM PUBLIC.POST WHERE USER_ID = :user_id", nativeQuery = true)
    public ArrayList<Post> getPostByUserId(@Param("user_id") Integer user_id);

    @Query(value = "UPDATE PUBLIC.POST SET USER_ID = :user_id, TITLE = :title, BODY = :body WHERE ID = :id",
            nativeQuery = true)
    public Post updatePost(@Param("id") Integer id, @Param("user_id") Integer user_id,
                           @Param("title") String title, @Param("body") String body);
}
