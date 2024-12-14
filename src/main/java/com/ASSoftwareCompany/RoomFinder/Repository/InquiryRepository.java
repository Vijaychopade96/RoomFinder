package com.ASSoftwareCompany.RoomFinder.Repository;

import com.ASSoftwareCompany.RoomFinder.Model.Inquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InquiryRepository extends JpaRepository<Inquiry, Long> {
    List<Inquiry> findByRoomOwnerId(Long roomOwnerId); // Ensure this method is declared

}
