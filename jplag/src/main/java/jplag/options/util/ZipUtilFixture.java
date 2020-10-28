package jplag.options.util;

import java.io.File;

public class ZipUtilFixture {
    private File file;

    public ZipUtilFixture(String filePath) {
        this.file = new File(filePath);
    }

    public File zipWithDest(String dest) {
        return ZipUtil.zip(this.file, dest);
    }
}
