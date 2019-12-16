package com.example.youpangsecurityoauth2.Entitiy;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Role {
    @Id
    @GeneratedValue
    private Long id;
    String name;

    public Role(String name) {
        this.name = name;
    }
}
