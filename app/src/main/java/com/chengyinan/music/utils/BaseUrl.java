package com.chengyinan.music.utils;

/**
 * @author ThirdGoddess
 * @email ofmyhub@gmail.com
 * @Github https://github.com/ThirdGoddess
 * @date :2020-02-18 19:18
 */
public class BaseUrl {

    private static String HOST = "http://192.168.1.109:3000/";

    //热歌榜
    public static String searchHot = HOST + "top/list?idx=1";

    //搜索歌曲
    public static String searchMusic = HOST + "search";

    //歌曲详细
    public static String musicDetail = HOST + "song/detail";

    //Music Url.
    public static String musicUrl = HOST + "song/url";


}
