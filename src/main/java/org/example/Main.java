package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String html = "https://google.com";
        Document document = Jsoup.connect(html).get();
        Elements elements = document.select("a");
        for (Element el : elements) {
            System.out.println(el.attr("href"));
        }
    }
}