package jplag.options.util;

public class TagParserFixture {
    private String message;
    private String[] params;


    public void setMessage(String message) {
        this.message = message;
    }

    public void setParams(String[] params) {
        this.params = params;
    }

    public String parse() {
        return TagParser.parse(this.message, this.params);
    }
}
