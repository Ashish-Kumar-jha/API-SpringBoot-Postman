package com.example.StringReversePalindrome.StringReversePalindrome.Controller;

import com.example.StringReversePalindrome.StringReversePalindrome.Services.StringInter;
import com.example.StringReversePalindrome.StringReversePalindrome.StringClasses.StringClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @Autowired
   StringInter stringInter;

    /*Reverse whole string and check for the palindrome position*/
    @PostMapping("/strrev")
    public StringClass ReverseStr(@RequestBody StringClass strobj){
       return this.stringInter.ReverseStr(strobj);
    }
    /*Reverse e*/
    @PostMapping("/strwordrev")
    public StringClass Reversewordstr(@RequestBody StringClass obj) {
        return this.stringInter.Reversewordstr(obj);
    }
}
