import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstTest {


    @Test
    void t1() {
        int rst = 1;
        assertThat(rst).isEqualTo(1);
    }

    @Test
    void t2() {
        TestApp app = new TestApp();
        app.run();

        // aaa가 출력되는가?
        // assertThat(result).isEqualTo("aaa");
    }
    @Test
    void t3(){
        //테스트봇 선입력
        Scanner sc = new Scanner("종료\n");

        ByteArrayOutputStream out = new ByteArrayOutputStream(); // 비어있는 스트림
        System.setOut(new PrintStream(out));

        TestApp app = new TestApp();
        app.run();

        assertThat(out.toString()).contains("명언앱을 종료합니다");
        // 출력값을 체크

    }
}