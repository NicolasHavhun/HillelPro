package com.hillelPro.havhun.homework25.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  int client_id;
    private String number;
    private  float value;

    public Account(int client_id, String number, float value) {
        this.client_id = client_id;
        this.number = number;
        this.value = value;
    }
}
