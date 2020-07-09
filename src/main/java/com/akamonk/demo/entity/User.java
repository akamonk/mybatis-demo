package com.akamonk.demo.entity;

import java.io.Serializable;

/**
 * @author Yu
 * @since 2020/7/9
 */
public class User implements Serializable {
    private static final long serialVersionUID = 8104961490512068314L;
    private Integer id;

    private String name;

    private String password;

    // omitted getter & setter
}
