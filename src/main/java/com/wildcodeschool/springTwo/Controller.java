package com.wildcodeschool.springTwo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/doctor/{num}")
    public ResponseEntity<Object> displayDoctorWho(@PathVariable int num) {
        if (num <= 8) {
            return new ResponseEntity<>("Moved to another page", HttpStatus.SEE_OTHER);
        } else if (num == 9) {
            return new ResponseEntity<>(new DoctorWho(9, "Christopher Eccleston"), HttpStatus.OK);
        } else if (num == 10) {
            return new ResponseEntity<>(new DoctorWho(10, "David Tennant"), HttpStatus.OK);
        } else if (num == 11) {
            return new ResponseEntity<>(new DoctorWho(11, "Matt Smith"), HttpStatus.OK);
        } else if (num == 12) {
            return new ResponseEntity<>(new DoctorWho(12, "Peter Capaldi"), HttpStatus.OK);
        } else if (num == 13) {
            return new ResponseEntity<>(new DoctorWho(13, "Jodie Whittaker"), HttpStatus.OK);
        }
        return new ResponseEntity<>("Impossible to retrieve the incarnation " + num, HttpStatus.NOT_FOUND);
    }

}
