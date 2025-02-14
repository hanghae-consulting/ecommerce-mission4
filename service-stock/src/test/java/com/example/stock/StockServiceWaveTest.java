package com.example.stock;

import com.example.kafka.CreateStockEvent;
import com.example.kafka.DecreaseStockEvent;
import com.example.stock.entity.Stock;
import com.example.stock.repository.StockRepository;
import com.example.stock.service.StockService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@SpringBootTest
@ActiveProfiles("test")
public class StockServiceWaveTest {

    @Autowired
    StockService stockService;

    @Autowired
    StockRepository stockRepository;

    private String STOCK_ID = null;

    @BeforeEach
    public void before() {
        // TODO #1: 테스트 데이터 초기화 로직을 구현하세요.
        // 요구사항:
        // - 새로운 재고(STOCK_ID)를 생성해야 합니다.
        // - 10,000개의 초기 재고를 설정해야 합니다.
        // - 로그를 출력하여 초기화 상태를 확인해야 합니다.
    }

    private void stockDecreaseWaveTest(Consumer<Void> action, int waveCount, int concurrencyPerWave) throws InterruptedException {
        // TODO #2: 동시성 제어를 위한 병렬 테스트 로직을 구현하세요.
        // 요구사항:
        // - 여러 개의 병렬 요청을 실행하고 동기화해야 합니다.
        // - 각 웨이브마다 일정한 간격을 두고 실행해야 합니다.
        // - 모든 요청이 끝난 후 최종 결과를 검증해야 합니다.
    }

    @Test
    @DisplayName("WaveTest - 5번 웨이브 × 각 1000명 동시 : 분산락")
    public void redissonStockingWaveTest() throws Exception {
        // TODO #3: 동시성 제어 테스트(Wave Test)를 구현하세요.
        // 요구사항:
        // - 5개의 웨이브를 실행하며, 각 웨이브에서 1000개의 동시 요청을 보냅니다.
        // - 분산락을 활용하여 경쟁 조건에서 일관된 처리가 되는지 검증해야 합니다.
        // - 최종적으로 예상한 재고 값과 실제 값이 일치하는지 확인해야 합니다.
    }
}
