package com.ASSoftwareCompany.RoomFinder.Service;

import com.ASSoftwareCompany.RoomFinder.Model.Inquiry;
import com.ASSoftwareCompany.RoomFinder.Repository.InquiryRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InquiryService {
    private final InquiryRepository inquiryRepository;

    public InquiryService(InquiryRepository inquiryRepository) {
        this.inquiryRepository = inquiryRepository;
    }

    public List<Inquiry> getInquiriesForOwner(Long ownerId) {
        return inquiryRepository.findByRoomOwnerId(ownerId);
    }
}
