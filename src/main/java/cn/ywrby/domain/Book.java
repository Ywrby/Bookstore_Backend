package cn.ywrby.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private int id;
    private String name;
    private String author;
    private String publishing_house;
    private Timestamp publish_date;
    private int pages;
    private String ISBN;
    private double price;
    private String brief_introduction;
    private String author_introduction;

}
