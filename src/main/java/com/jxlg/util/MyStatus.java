package com.jxlg.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 状态类
 *
 * @author herixin
 * @create 2022-11-22 9:39
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum MyStatus {
    ERROR(500, "操作失败"),
    SUCCESS(200, "操作成功"),
    SAVESUCCESS(300, "添加成功"),
    SAVEFALL(303, "添加失败"),
    ;
    private Integer code;
    private String msg;

}
