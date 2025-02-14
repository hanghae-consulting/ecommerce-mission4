package com.example.stock;

import com.example.kafka.CreateStockEvent;
import com.example.kafka.DecreaseStockEvent;
import com.example.product.dto.ProductDto;
import com.example.product.entity.Product;
import com.example.product.service.ProductService;
import com.example.stock.entity.Stock;
import com.example.stock.repository.StockRepository;
import com.example.stock.service.StockService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@SpringBootTest
@ActiveProfiles("test")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProductPerformanceTest {

    @Autowired
    private ProductService productService;

    private final List<String> productIds = new ArrayList<>();

    @BeforeAll
    public void setUpData() {
        // TODO #1: 대량의 상품 데이터를 초기화하는 로직을 구현하세요.
        // 요구사항:
        // - 100,000개의 상품을 생성해야 합니다.
        // - 각 상품은 고유한 ID와 가격을 가져야 합니다.
        // - 생성된 상품 ID를 리스트에 저장해야 합니다.
    }

    @Test
    @DisplayName("모든 상품 조회 : 레거시")
    public void testLegacyProductRetrieval(){
        // TODO #2: 기존 상품 조회 성능 테스트를 구현하세요.
        // 요구사항:
        // - 생성된 모든 상품을 개별적으로 조회해야 합니다.
        // - 조회된 상품 ID를 로그로 출력해야 합니다.
        // - 조회 시간이 얼마나 걸리는지 측정해야 합니다.
    }

    @AfterAll
    public void cleanupData() {
        // TODO #3: 생성된 상품 데이터를 정리하는 로직을 구현하세요.
        // 요구사항:
        // - 테스트 종료 후 모든 상품을 삭제해야 합니다.
        // - 삭제된 상품 정보를 로그에 남겨야 합니다.
    }
}
