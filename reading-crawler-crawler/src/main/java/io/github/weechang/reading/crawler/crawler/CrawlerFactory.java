package io.github.weechang.reading.crawler.crawler;

/**
 * @author zhangwei
 * date 2018/9/26
 * time 10:07
 */
public class CrawlerFactory {

    public static AbstractCrawler build(Integer key){
        AbstractCrawler abstractCrawler = new BiQuGeCrawler();
        switch (key){
            case 1: // 笔趣阁
                abstractCrawler = new BiQuGeCrawler();
        }
        return abstractCrawler;
    }
}
