package com.example.Sql_Rocks;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    //First part in <> : with whom to connect (Entity), what is datatype of the primary key.

}
