package com.project.phonecaseshop.controller;

import com.project.phonecaseshop.entity.dto.memberDto.MemberRequestDto;
import com.project.phonecaseshop.entity.dto.memberDto.MemberResponseDto;
import com.project.phonecaseshop.responseApi.ApiResponse;
import com.project.phonecaseshop.responseApi.CommonResult;
import com.project.phonecaseshop.service.MailService;
import com.project.phonecaseshop.service.MemberService;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    private final MailService mailService;
    private final ApiResponse apiResponse;

    // 회원가입
    @PostMapping("/signup")
    public CommonResult signUp(@RequestBody MemberRequestDto memberRequestDto) {
        return apiResponse.getSuccessResult(memberService.signUp(memberRequestDto));
    }

    // 로그아웃
    @GetMapping("/logout")
    public CommonResult logout() {
        return apiResponse.getSuccessResult(memberService.logout());
    }


    // 회원탈퇴
    @GetMapping("/withdrawal")
    public CommonResult withdrawal() {
        return apiResponse.getSuccessResult(memberService.withdrawal());
    }

    // 회원정보 수정
    @PutMapping("")
    public CommonResult updateProfile(@RequestBody MemberRequestDto memberRequestDto) {
        System.out.println("memberRequestDto = " + memberRequestDto);
        return apiResponse.getSuccessResult(memberService.updateProfile(memberRequestDto));
    }

    // 회원 정보 가져오기
    @GetMapping("")
    public MemberResponseDto findMember() {
        return memberService.findMember();
    }

    // 임시 비밀번호 전송과 저장
    @GetMapping("/reset")
    public CommonResult resetPassword(@RequestParam String memberEmail) throws MessagingException {
        return apiResponse.getSuccessResult(mailService.sendEmail(memberEmail));
    }
}
