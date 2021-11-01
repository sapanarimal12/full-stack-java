package com.sapana.day16.facade;

import org.jsoup.nodes.Document;

public interface Scraper {

    Object scrap(Document document);
}
