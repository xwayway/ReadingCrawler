package io.github.weechang.reading.crawler.crawler;

/**
 * @author zhangwei
 * date 2018/9/26
 * time 13:28
 */
public enum SourceEnums {

    BIQUGE(1, "笔趣阁", "https://www.biqugexsw.com");

    private Integer key;
    private String name;
    private String url;

    SourceEnums(Integer key, String name, String url){
        this.key = key;
        this.name = name;
        this.url = url;
    }

    public Integer getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
