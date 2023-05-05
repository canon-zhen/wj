package com.canonzhen.wj.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Result 类是为了构造 response，主要是响应码
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    //响应码
    private int code;


}
