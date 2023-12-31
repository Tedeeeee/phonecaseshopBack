package com.project.phonecaseshop.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import java.util.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@DynamicUpdate
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reviewId;

    @Column(length = 50)
    private String reviewName;

    @Column(length = 1000)
    private String reviewContent;

    @Column
    private String reviewDate;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product productId;

    @ManyToOne
    @JoinColumn(name = "memberId")
    private Member memberId;
}
