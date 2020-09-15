package main.api;

import main.serviceimpl.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class testapi {

    @Autowired
    private main.serviceimpl.ajaxServlet ajaxServlet;

    @GetMapping("/test-pay")
    public ResponseEntity<?> testPay(HttpServletRequest request) {
        try {
            String result = ajaxServlet.doPost(request);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.ok(e.getMessage());
        }
    }
}
