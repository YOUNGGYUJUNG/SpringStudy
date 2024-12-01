package com.fastcampus.ch4.domain;

public class PageHandler {
    int totalCnt; // 총 계시물 갯수
    int pageSize; // 한 페이지의 크기
    int naviSize; // 페이지 네비게이션의 크기
    int totalPages; // 전체 페이지의 갯수
    int page; // 현재 페이지
    int beginPage; // 네비게이션의 첫번째 페이지
    int endPage; // 네비게이션의 마지막 페이지
    boolean showPrev; // 이전 페이지로 이동하는 링크를 보연줄 것인지의 여부
    boolean showNext; // 다음 페이지로 이동하는 링크를 보연줄 것인지의 여부

}
