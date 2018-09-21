package io.github.weechang.reading.crawler.crawler;

/**
 * 爬虫
 *
 * @author zhangwei
 * date 2018/9/21
 * time 17:26
 */
public abstract class AbstractCrawler {

    protected String baseUrl = "";
    protected String currentUrl = "";
    protected String nextUrl = "";
    protected String lastUrl = "";

    public abstract String getPage(String url);

    public abstract String getContent(String url);

    public abstract String getNext();

    public abstract String getLast();
}
