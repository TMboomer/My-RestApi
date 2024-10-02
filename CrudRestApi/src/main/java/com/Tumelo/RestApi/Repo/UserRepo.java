package com.Tumelo.RestApi.Repo;
import com.Tumelo.RestApi.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}