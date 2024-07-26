package com.nimblejay.univtool.test;

import com.nimblejay.univtool.rule.Verify;
import com.nimblejay.univtool.sutil.StringUtil;

public class testController {
    public static void main(String[] args) {
        String a = null;
        System.out.println(Verify.getResultByCode("0","G123"));
        System.out.println(StringUtil.isEmpty(a));
    }
}
