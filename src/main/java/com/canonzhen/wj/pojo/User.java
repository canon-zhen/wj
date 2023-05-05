package com.canonzhen.wj.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 因为是做前后端分离，而前后端数据交互用的是 json 格式。 那么 User 对象就会被转换为 json 数据。
 * 而本项目使用 jpa 来做实体类的持久化，jpa 默认会使用 hibernate,
 * 在 jpa 工作过程中，就会创造代理类来继承 User ，
 * 并添加 handler 和 hibernateLazyInitializer 这两个无须 json 化的属性，
 * 所以这里需要用 JsonIgnoreProperties 把这两个属性忽略掉
 */

@Entity
@Table(name = "user")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
     * AUTO：（默认）根据实际连接的数据库类型，选择是 IDENTITY、SEQUENCE 或者 TABLE。
     * IDENTITY：使用数据库的 ID 自增的方式生成主键，Oracle 不支持。
     * SEQUENCE：使用数据库的序列生成功能生成主键，MySQL 不支持。
     * TABLE：使用其他数据库表的值作为当前表的主键值，一定程度影响扩展性和性能。
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
//    @JsonProperty("username")
    String username;
//    @JsonProperty("password")
    String password;
}
