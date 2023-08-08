package com.multicampus.springex.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@ToString
@Service
@RequiredArgsConstructor
public class SampleService {

    // 내 맘대로 바꿀 수 있다
    // @Qualifier("normal")
    // @Qualifier("oracle")
    // @Qualifier("maria")

    // 생성지 주입 방식
    private final SampleDAOImpl sampleDAO;
/*
    @Autowired
    private SampleDAO sampleDAO;  // Field Injection 방식 (필드 주입)
*/

}