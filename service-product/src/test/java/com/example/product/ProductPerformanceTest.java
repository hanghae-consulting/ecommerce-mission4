package com.example.product;

import com.example.kafka.CreateProductEvent;
import com.example.product.entity.Product;
import com.example.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@SpringBootTest
@ActiveProfiles("test")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProductPerformanceTest {

    @Autowired
    private ProductService productService;

    private final int productCnt = 10000;
    private List<String> productIds;

    @BeforeAll
    public void setUpData() {
        // TODO #1: 테스트 데이터 초기화 로직을 구현하세요.
        // 요구사항:
        // - 대량의 상품을 생성하고 저장해야 합니다.
        // - 성능을 고려하여 적절한 데이터 구조를 사용해야 합니다.
        // - 진행 상황을 로그로 남겨야 합니다.
    }

    @Test
    @DisplayName("리스트를 이용한 모든 상품 조회: Kafka + Caching")
    public void testCacheProductRetrieval(){
        // TODO #2: 캐시 및 Kafka 기반 상품 조회 테스트를 구현하세요.
        // 요구사항:
        // - 저장된 상품 개수가 예상과 일치하는지 검증해야 합니다.
        // - 캐시를 활용하여 빠른 조회가 이루어지는지 확인해야 합니다.
        // - 로그를 통해 조회 결과를 출력해야 합니다.
    }
}
