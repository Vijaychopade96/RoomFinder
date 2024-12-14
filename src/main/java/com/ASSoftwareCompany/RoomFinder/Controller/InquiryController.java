package com.ASSoftwareCompany.RoomFinder.Controller;

import com.ASSoftwareCompany.RoomFinder.Model.Inquiry;
import com.ASSoftwareCompany.RoomFinder.Service.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inquiries")
public class InquiryController {
    @Autowired
    private InquiryService inquiryService;

    public InquiryController(InquiryService inquiryService) {
        this.inquiryService = inquiryService;
    }

    @GetMapping("/owner/{ownerId}")
    public List<Inquiry> getInquiriesForOwner(@PathVariable Long ownerId) {
        return inquiryService.getInquiriesForOwner(ownerId);
    }
}
