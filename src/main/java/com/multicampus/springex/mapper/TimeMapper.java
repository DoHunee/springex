package com.multicampus.springex.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper { //데이터베이스의 현재시각을 문자열로 받아와서 처리
    @Select("select now()") //반복되는 것을 객체처럼 만들어서 재사용, 문자열로 넘어가기 때문에 ; 지정하지 않음
    String getTime();
}
