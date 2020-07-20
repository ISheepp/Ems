package com.codelin.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author lin
 * @create 2020-07-20 20:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class Emp {

    private String id;
    private String name;
    private String salary;
    private Integer age;
}
