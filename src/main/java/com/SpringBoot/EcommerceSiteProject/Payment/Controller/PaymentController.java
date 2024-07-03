package com.SpringBoot.EcommerceSiteProject.Payment.Controller;

import com.SpringBoot.EcommerceSiteProject.Configuration.UserContext;
import com.SpringBoot.EcommerceSiteProject.Payment.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public String createOrder(@RequestParam Integer orderId) throws Exception {
        Long userId = UserContext.getUserId();
        paymentService.completePayment(userId, orderId);
        return  "success";
    }
}

