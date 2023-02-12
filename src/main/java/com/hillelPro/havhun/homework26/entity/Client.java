package com.hillelPro.havhun.homework26.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "clients")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private long phone;
    private String about;
    private int age;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mobile_phone_number", unique = true, nullable = false)
    private MobilePhoneNumber mobilePhoneNumber;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)

    private Set<MobileProvider> mobileProviders;
    @ManyToMany
    @JoinTable(
            name = "client_status",
            joinColumns = {@JoinColumn(name = "client_id")},
            inverseJoinColumns = {@JoinColumn(name = "status_id")}

    )
    private Set<Status> statuses;


}
