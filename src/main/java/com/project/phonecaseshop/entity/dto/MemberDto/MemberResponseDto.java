package com.project.phonecaseshop.entity.dto.MemberDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberResponseDto {
    private Long memberId;
    private String memberEmail;
    private String memberPassword;
    private String memberNickname;
    private Long memberPoint;
    private String memberAddress;
    private String memberDetailAddress;
}
