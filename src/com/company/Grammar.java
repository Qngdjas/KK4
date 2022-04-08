package com.company;

public class Grammar {

    private String[] rules = {"E->E+T",
            "E->T",
            "T->n",
            "T->(E)"};

    public int getMaxRuleLength() {
        int max = 1;
        for (String rule : rules) {
            if (getRuleRightPart(rule).length() > max) {
                max = getRuleRightPart(rule).length();
            }
        }
        return max;
    }

    public int getRulesCount() {
        return rules.length;
    }

    public String getRuleRightPart(String rule) {
        String[] temp = rule.split("->");
        return temp[1];
    }
}
