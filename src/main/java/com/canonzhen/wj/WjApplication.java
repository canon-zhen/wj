package com.canonzhen.wj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WjApplication {

    /**
     * DAO 用于与数据库的直接交互，定义增删改查等操作
     * Service 负责业务逻辑，跟功能相关的代码一般写在这里，编写、调用各种方法对 DAO 取得的数据进行操作
     * Controller 负责数据交互，即接收前端发送的数据，通过调用 Service 获得处理后的数据并返回
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(WjApplication.class, args);
    }

}
