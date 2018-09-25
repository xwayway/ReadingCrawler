package io.github.weechang.reading.crawler.crawler;

import org.jsoup.nodes.Document;

/**
 * 爬虫
 *
 * @author zhangwei
 * date 2018/9/21
 * time 17:26
 */
public abstract class AbstractCrawler {

    protected Document page = null;
    protected String nextUrl = null;
    protected String lastUrl = null;

    /**
     * 获取页面内容 —— 对外
     *
     * @param url Url
     * @return 页面内容
     */
    public abstract String getPage(String url);

    /**
     * 获取下一页URL
     */
    public String getNextUrl() {
        return nextUrl;
    }

    /**
     * 获取上一页URL
     */
    public String getLastUrl() {
        return lastUrl;
    }

    /**
     * 获取内容
     *
     * @return 页面内容
     */
    protected abstract String getContent();

    /**
     * 获取下一页URL
     */
    protected abstract void getNext();

    /**
     * 获取上一页URL
     */
    protected abstract void getLast();

}
