package com.example.StringReversePalindrome.StringReversePalindrome.Controller;

import com.example.StringReversePalindrome.StringReversePalindrome.Services.StringInter;
import com.example.StringReversePalindrome.StringReversePalindrome.Services.StringIntrImpl;
import com.example.StringReversePalindrome.StringReversePalindrome.StringClasses.StringClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
public class StringController {

    @Autowired
    StringInter stringInter;

    /*Reverse whole string and check for the palindrome position*/
    @PostMapping("/strrev")
    public ResponseEntity<?> ReverseStr(@RequestBody StringClass strobj){
        StringClass sre=this.stringInter.ReverseStr(strobj);
        if(sre.getSentence()==null || sre.getSentence().length()==0){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.of(Optional.of(sre));
    }


    /*Reverse word of the string and find the position of palindrome*/
    @PostMapping("/strwordrev")
    public ResponseEntity<?> Reversewordstr(@RequestBody StringClass strobj){
        StringClass sre=this.stringInter.ReverseStr(strobj);
        if(sre.getSentence()==null || sre.getSentence().length()==0){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.of(Optional.of(sre));
    }


}
