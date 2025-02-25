package com.example.bookingsystem;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookingServiceTest {
    @Autowired
    private BookingService bookingService;

    @Test
    public void testSaveBooking() {
        Resource resource = new Resource();
        resource.setName("Conference Room 1");

        Booking booking = new Booking();
        booking.setResource(resource);
        booking.setStartTime(LocalDateTime.now().plusDays(1));
        booking.setEndTime(LocalDateTime.now().plusDays(1).plusHours(2));

        Booking savedBooking = bookingService.saveBooking(booking);
        assertNotNull(savedBooking.getId());
    }
}
