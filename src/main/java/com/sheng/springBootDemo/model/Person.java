package com.sheng.springBootDemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author shengxingyue, created on 2017/12/1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {
    private Integer age;
    private String name;
}
