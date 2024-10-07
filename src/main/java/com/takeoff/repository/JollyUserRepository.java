package com.takeoff.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.takeoff.domain.JollyUser;

public interface JollyUserRepository extends JpaRepository<JollyUser, Long> {

	Optional<JollyUser> findByMobileAndPassword(String mobile, String password);

	@Query(nativeQuery = true, value = "select image from image_details order by rand() limit 10")
	List<String> getRandomImages();

	Optional<JollyUser> findByMobile(@Param("mobile") String mobile);

	Optional<JollyUser> findByEmail(@Param("email") String email);
	
	Optional<JollyUser> findByEmailOrMobile(@Param("email") String email, @Param("mobile") String mobile);

}
