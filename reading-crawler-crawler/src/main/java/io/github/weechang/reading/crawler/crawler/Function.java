package io.github.weechang.reading.crawler.crawler;

import java.util.Scanner;

/**
 * 逻辑功能控制类
 *
 * @author zhangwei
 * date 2018/9/26
 * time 13:11
 */
public class Function {

    // app配置
    private AppConfig config;
    // 爬虫类
    private AbstractCrawler crawler;

    public Function(String firstUrl){
        crawler =  CrawlerFactory.build(config.sourceType);
        startView(firstUrl);
    }

    // 页面浏览
    private void startView(String pageUrl){
        String content = crawler.getPage(pageUrl);
        System.out.println(content);
        this.inputListener();
    }

    // 开始浏览
    private void inputListener(){
        System.out.println("*************");
        System.out.println("* " + config.lastPage + " 上一页   *");
        System.out.println("* " + config.exit + " 退出     *");
        System.out.println("* 其他 下一页 *");
        System.out.println("*************");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (config.lastPage.equalsIgnoreCase(input)){
            // 上一页
            startView(crawler.lastUrl);
        } else if (config.exit.equalsIgnoreCase(input)){
            // 退出
        } else {
            // 下一页
            startView(crawler.nextUrl);
        }
    }
}
