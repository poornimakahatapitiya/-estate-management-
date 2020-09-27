package com.app.registration.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.app.registration.model.user;
public interface registrationRepository extends JpaRepository<user,Integer> {


public user findByEmailId(String email);

public user findByEmailIdAndPassword(String tempEmailId, String tempPassword);
}
