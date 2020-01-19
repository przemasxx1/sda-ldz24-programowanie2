package pl.sda.academy.intermediate.warmup.warmup11;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class BookShortInfo {
    private String title;
    private String author;
    private int yearPushlished;
}
