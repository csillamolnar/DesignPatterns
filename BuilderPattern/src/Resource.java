class Resource {


    private final String description;
    private final String author;
    private final String summary;
    private final String reference;

    @Override
    public String toString() {
        return "Resource{" +
                "description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", summary='" + summary + '\'' +
                ", reference='" + reference + '\'' +
                '}';
    }


    public static class Builder {
        private String description = "";
        private String author = "";
        private String summary = "";
        private String reference = "";

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        public Builder reference(String reference) {
            this.reference = reference;
            return this;
        }


        public Resource build() {

            return new Resource(this);

        }

    }

    private Resource(Builder builder) {


        this.description = builder.description;
        this.author = builder.author;
        this.summary = builder.summary;
        this.reference = builder.reference;

    }


}