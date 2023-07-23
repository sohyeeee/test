package com.ll.exam.sbb;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    private int increaseNo = -1;

    @RequestMapping("/sbb")
    // 아래 함수의 리턴값을 그대로 브라우저에 표시
    // 아래 함수의 리턴값을 문자열화 해서 브라우저 응답의 바디에 담는다.
    @ResponseBody
    public String index(){
        // 서버에서 출력
        System.out.println("Hello");
        // 먼 미래에 브라우저에서 보여짐
        return "반가워요.";
    }
    @GetMapping("/page1")
    @ResponseBody
    public String showPage1(){
        return """
                <form method="POST" action="/page2">
                    <input type="number" name="age" placeholder="나이" ?>
                    <input type="submit" value="page2로 POST 방식으로 이동" />
                </form>
                """;
    }
    @PostMapping("/page2")
    @ResponseBody
    public String showPage2Post(@RequestParam(defaultValue = "0") int age){
        return """
                <h1>입력된 나이 : %d </h1>
                <h1>안녕하세요. POST방식으로 오셨군요</h1>
                """.formatted(age);
    }
    @GetMapping("/page2")
    @ResponseBody
    public String showPost(@RequestParam(defaultValue = "0") int age){
        return """
                <h1>입력된 나이 : %d </h1>
                <h1>안녕하세요. GET방식으로 오셨군요</h1>
                """.formatted(age);
    }
    @GetMapping("/plus")
    @ResponseBody
    public int showPlus(int a, int b){
        return a+b;
    }

    @GetMapping("/minus")
    @ResponseBody
    public int showMinus(int a, int b){
        return a-b;
    }


    @GetMapping("/increase")
    @ResponseBody
    public int showIncrease(){
        increaseNo++;
        return increaseNo;
    }

}
