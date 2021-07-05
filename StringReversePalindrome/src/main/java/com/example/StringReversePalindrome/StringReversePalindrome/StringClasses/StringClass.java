package com.example.StringReversePalindrome.StringReversePalindrome.StringClasses;

import java.util.ArrayList;
import java.util.List;

public class StringClass {
String sentence;
List<Integer> pos =new ArrayList<Integer>();

    public StringClass(String sentence, List<Integer> count) {
        this.sentence = sentence;
        this.pos = count;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public List<Integer> getPos() {
        return pos;
    }

    public void setPos(List<Integer> pos) {
        this.pos = pos;
    }
}
