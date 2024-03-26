package com.auth1.auth.learning.repository;

import com.auth1.auth.learning.model.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {

    //        expireDate                    value                                 isDel
    // '1', '2024-04-25 21:58:17.639000', '65c338ac-69f6-43a4-b460-dd4dd3e39534', 0

    Optional<Token> findByValueAndDeletedEquals(String token, Boolean isDeleted);

     /*
          To validate token
          1. Check if token value is present
          2. Check if token is not deleted
          3. Check if token is not expired
         */

    Optional<Token> findByValueAndDeletedEqualsAndExpireAtGreaterThan(
            String token, Boolean isDeleted, Date date);

}
