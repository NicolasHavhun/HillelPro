package com.hillelPro.havhun.homework26.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "mobile_numbers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class MobilePhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  long number;

@OneToOne(mappedBy = "mobilePhoneNumber")

    private  Client client;



}
