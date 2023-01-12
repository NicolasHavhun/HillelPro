package com.hillelPro.havhun.homework25.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "statuses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String alias;
    private String description;

    public Status(String alias, String description) {
        this.alias = alias;
        this.description = description;
    }
}
