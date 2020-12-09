package com.example.mymusic.api;

import com.example.mymusic.domain.SheetDetailWrapper;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * 网络接口配置
 * <p>
 * 之所以调用接口还能返回数据
 * 是因为Retrofit框架内部处理了
 * 这里不讲解原理
 * 在《详解Retrofit》课程中讲解
 */
public interface Service {
    /**
     * 歌单详情
     * 相对路径
     * @param id
     * @return
     */
    @GET("v1/sheets/{id}")
    Observable<SheetDetailWrapper> sheetDetail(@Path("id") String id);
}
