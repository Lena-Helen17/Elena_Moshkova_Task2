package com.moshkova.task2.to;

import lombok.Data;

@Data
public class PseudonymRank {

    private String original;
    private String link;
    private Integer count;
    private Integer rank;

}
