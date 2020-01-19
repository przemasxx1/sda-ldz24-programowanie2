package pl.sda.academy.intermediate.warmup.warmup11;

public enum Genre {
    FOR_CHILDREN(true),
    CRIME_STORY(true),
    FANTASY(true);

    boolean category;

    Genre(boolean category) {
        this.category = category;
    }

    public boolean isCategory() {
        return category;
    }
}
