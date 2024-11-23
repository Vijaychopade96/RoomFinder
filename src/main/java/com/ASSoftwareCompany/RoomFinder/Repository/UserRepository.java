package com.ASSoftwareCompany.RoomFinder.Repository;

import com.ASSoftwareCompany.RoomFinder.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    <T> ScopedValue<T> findByUsername(java.lang.String username);
}
