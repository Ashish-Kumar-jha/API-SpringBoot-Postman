package com.example.StringReversePalindrome.StringReversePalindrome.Services;

import com.example.StringReversePalindrome.StringReversePalindrome.StringClasses.StringClass;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StringIntrImpl implements StringInter{
    @Override
    public StringClass ReverseStr(StringClass strobj) {

        String arr[]=strobj.getSentence().split(" ");
        String s=strobj.getSentence();
        List<Integer> pos=new ArrayList<Integer>();
        String Palinarr[]=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            String temp=arr[i];
            StringBuilder sb=new StringBuilder(temp);
             sb.reverse();
             Palinarr[i]=sb.toString();
            if(sb.toString().equalsIgnoreCase(temp)){
                pos.add(i);
            }
        }
        char ch[]=s.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }

        strobj.setSentence(rev);
        strobj.setPos(pos);
        return strobj;
    }

    @Override
    public StringClass Reversewordstr(StringClass obj) {
        String arr[]=obj.getSentence().split(" ");
        List<Integer> pos=new ArrayList<Integer>();
        int start=0,end=arr.length-1;
        //palindrome position
        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            StringBuilder sb=new StringBuilder(s);
            sb.reverse();

            if(sb.toString().equalsIgnoreCase(s)){
                pos.add(i);
            }
        }
        while(start<end){
            String x=arr[start];
            arr[start]=arr[end];
            arr[end]=x;
            start++;
            end--;
        }

        String temp="";
        for(int i=0;i<arr.length;i++) {
            if (i != arr.length - 1) {
                String x=arr[i];
                temp= temp+x;
                temp=temp+" ";
            }
            else {
                String x=arr[i];
                temp= temp+x;
            }
        }

        obj.setSentence(temp);
        obj.setPos(pos);
        return obj;
    }
}
