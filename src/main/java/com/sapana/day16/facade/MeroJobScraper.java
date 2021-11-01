package com.sapana.day16.facade;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class MeroJobScraper implements  Scraper {

    @Override
    public Object scrap(Document document) {
        Elements elements = document.select("div.row .job-card");

        List<JobDetail> jobDetails = new ArrayList<>();

        for (Element element : elements) {
            Elements jobTitle = element.select("h1.text-primary").select("a");
            Elements image = element.select("img.border");
            Elements companyName = element.select("h3");
            Elements companyAddress = element.select("span.text-muted > span");
            Elements keySkills = element.select("div.media").get(1).select("div.media-body > span").get(1).select("span");
            Elements deadline = element.select("div.card-footer > p.text-primary > span");

            JobDetail jobDetail = new JobDetail();
            jobDetail.setTitle(jobTitle.text());
            jobDetail.setCompanyImageUrl("https://merojob.com" + image.attr("src"));
            jobDetail.setCompany(companyName.text());
            jobDetail.setCompanyAddress(companyAddress.text());

            jobDetail.setDeadline(deadline.text());

            List<String> skills = new ArrayList<>();
            for (Element skill : keySkills) {
                skills.add(skill.text());
                System.out.println(skill);
            }
            jobDetail.setKeySkill(skills);

            jobDetails.add(jobDetail);

        }
        return  jobDetails;
    }

}

